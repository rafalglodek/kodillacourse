package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/login");
        WebElement emailInputBox = driver.findElement(By.id("Email"));
        emailInputBox.clear();
        System.out.println(emailInputBox.getAttribute("value"));
        System.out.println(emailInputBox.getText()); // returns value of inner text

        WebElement search = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

        System.out.println(search.getAttribute("type"));
        System.out.println(search.getAttribute("class"));
        System.out.println(search.getText());

        WebElement title = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
        System.out.println(title.getText());
        System.out.println(title);
    }
}
