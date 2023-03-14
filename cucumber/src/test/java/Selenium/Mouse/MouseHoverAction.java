package Selenium.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverAction {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/");
        WebElement menu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions action = new Actions(driver);
        //action.moveToElement(menu).moveToElement(Mac).click().perform();
        action.moveToElement(menu).build().perform();
        Thread.sleep(3000);
        action.moveToElement(Mac).build().perform();
        Thread.sleep(3000);
        Mac.click();
        driver.quit();




    }
}
