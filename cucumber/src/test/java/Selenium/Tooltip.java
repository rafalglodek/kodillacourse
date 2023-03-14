package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class Tooltip {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.xpath("//input[@id='age']"));
        String tooltipText=element.getAttribute("title");
        System.out.println(tooltipText);




    }
}
