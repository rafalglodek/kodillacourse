package Selenium.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDoubleClickAction {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
        driver.findElement(By.id("accept-choices")).click();
        driver.switchTo().frame("iframeResult");


        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));

        Actions action = new Actions(driver);

        action.doubleClick(button).build().perform();

    }
}
