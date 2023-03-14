package Selenium.Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IframeExampleTwo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(0);
        System.out.printf(1 + ": "+ driver.findElement(By.xpath("//h1")).getText());
        driver.switchTo().parentFrame();
        String text=driver.findElement(By.xpath("//p[contains(text(), 'You can use')]")).getText();
        System.out.printf("\n" + 2 + ": " + text);


    }
}
