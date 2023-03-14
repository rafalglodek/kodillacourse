package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class HandleLinks {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //Thread.sleep(3000);

        //driver.findElement(By.linkText("Today's Deals"));
        driver.findElement(By.partialLinkText("Deals"));

        List<WebElement>links=driver.findElements(By.tagName("a"));

        for(int i=0; i<=0; i++) {
            System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));
        }

    }
}
