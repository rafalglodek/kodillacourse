package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com/");
        driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
        List<WebElement>productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println(productTypes.size());
        for(WebElement element:productTypes) {
            if (element.getText().equals("Accounts")) {
                element.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        List<WebElement>products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        System.out.println(products.size());
        for(WebElement element:products) {
            if (element.getText().equals("Current Accounts")) {
                element.click();
                break;
            }
        }
    }
}
