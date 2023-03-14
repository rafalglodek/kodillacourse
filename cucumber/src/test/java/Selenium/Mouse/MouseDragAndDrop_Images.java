package Selenium.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDragAndDrop_Images {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frame);

        WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement trash = driver.findElement(By.id("trash"));

        Actions action = new Actions(driver);
        action.dragAndDrop(img1,trash).build().perform();
        action.dragAndDrop(img2,trash).build().perform();
    }
}
