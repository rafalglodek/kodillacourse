package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementFindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
/*

        // 1
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("xyz");
        // 2
        WebElement searchFooter = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(searchFooter.getText());
        // 3
        WebElement search = driver.findElement(By.xpath("//button[normalize-space()='login']"));
        System.out.println(search.getText());

 */
        // 4
        List<WebElement> searchList = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(searchList.size());
        for(WebElement ele:searchList) {
            System.out.println(ele.getText());
        }

        // 5
        List<WebElement> Logos = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(Logos.size());
        // 6
        List<WebElement> img = driver.findElements(By.xpath("//img[contains(title, 'Electronics')]"));
        System.out.println(img.size());



    }
}
