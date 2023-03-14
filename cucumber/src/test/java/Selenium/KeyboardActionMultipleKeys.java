package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActionMultipleKeys {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.findElement(By.id("ez-accept-all")).click();
        driver.manage().window().maximize();

        WebElement leftWindow=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement rightWindow=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        Actions actions = new Actions(driver);


        leftWindow.sendKeys("Welcome to Selenium");
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.sendKeys(Keys.TAB);
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        Thread.sleep(3000);

        if(leftWindow.getAttribute("value").equals(rightWindow.getAttribute("value"))) {
            System.out.println("Text copied correctly ");
        } else {
            System.out.println("Text copied incorrectly ");
        }
        driver.quit();

    }
}
