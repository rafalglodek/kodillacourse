package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        //Thread.sleep(3000);
        //driver.switchTo().alert().accept();

        //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        //Thread.sleep(3000);
        //driver.switchTo().alert().accept();  //  Close alert by clicking Ok button
        //driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Welcome");
        alert.accept();
    }
}
