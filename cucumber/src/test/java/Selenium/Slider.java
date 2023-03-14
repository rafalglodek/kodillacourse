package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        WebElement minimum_slider = driver.findElement(By.xpath("//span[1]"));
        WebElement maximum_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println(minimum_slider.getLocation());
        System.out.println(maximum_slider.getLocation());

        Actions action = new Actions(driver);
        action.dragAndDropBy(minimum_slider,100,0).perform();  //  or -100

    }
}
