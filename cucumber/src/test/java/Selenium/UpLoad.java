package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UpLoad {
    public static void main(String[] args) throws AWTException {

        ChromeOptions options =new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver(options);
        driver.get("https://www.foundit.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
        //driver.findElement(By.xpath("//input[@id='file-upload']"))
        //        .sendKeys("C:\\Projects\\kodilla-course\\cucumber\\src\\main\\Downloads\\sample3.pdf");
        WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",button);
        Robot rb=new Robot();
        rb.delay(1000);
        StringSelection ss=new StringSelection("C:\\Projects\\kodilla-course\\cucumber\\src\\main\\Downloads\\sample3.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);










    }
}
