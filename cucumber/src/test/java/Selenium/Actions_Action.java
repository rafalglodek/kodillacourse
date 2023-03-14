package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_Action {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement woman = driver.findElement(By.xpath("//a[@title='Women']"));

        Actions action = new Actions(driver);

        Action act = action.moveToElement(woman).build();  // Stores act in variable Action
        act.perform();
    }
}
