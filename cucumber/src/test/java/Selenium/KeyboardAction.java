package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAction {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.SEMICOLON).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.ARROW_DOWN).perform();

        driver.quit();
    }
}
