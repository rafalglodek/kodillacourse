package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // isDisplayed() isEnabled()
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Display status:"+searchStore.isDisplayed());
        System.out.println("Display status:"+searchStore.isEnabled());
        // isSelected
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());

        male.click();

        System.out.println(male.isSelected());
        System.out.println(female.isSelected());



    }
}
