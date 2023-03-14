package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigations {
    public static void main(String[] args) throws MalformedURLException {


        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        URL url = new URL("https://snapdeal.com");

        driver.get("https://snapdeal.com");
        driver.get("https://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().to("https://snapdeal.com");
        driver.navigate().to(url);
    }
}
