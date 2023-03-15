package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SizeAndLocationOfElement {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        System.out.println(logo.getLocation());
        System.out.println(logo.getLocation().getX());
        System.out.println(logo.getLocation().getY());
        System.out.println(logo.getRect().getY());
        System.out.println(logo.getSize());
        System.out.println(logo.getSize().width);
        System.out.println(logo.getRect().getDimension().width);

        driver.close();
    }
}
