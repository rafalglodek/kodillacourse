package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

public class HandleBrokenLinks {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException, ClassCastException {

        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        int broken = 0; //  Variable initialized before loop

        for(WebElement element:links) {
            String url=element.getAttribute("href");
            if ((url==null) || (url.isEmpty())) {
                System.out.println("empty");
                continue;
            }

            URL link= new URL(url);

            try {
                HttpURLConnection httpURLConnection= (HttpURLConnection) link.openConnection();
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode()>400) {
                    System.out.println(httpURLConnection.getResponseCode() + " " + url + " broken");
                    broken++;
                } else {
                    System.out.println(httpURLConnection.getResponseCode() + " " + url + " valid");

                }

            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                    e.printStackTrace();
            } catch (ClassCastException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(broken + " broken links");
        driver.quit();

    }
}
