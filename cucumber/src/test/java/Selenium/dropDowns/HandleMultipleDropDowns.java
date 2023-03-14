package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleMultipleDropDowns {

    static WebDriver driver;


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

        //WebElement inMenu = driver.findElement(By.id("search-in-menu"));
        //selectOptionFromDropDown(inMenu,"News");
        WebElement users = driver.findElement(By.name("Country"));
        selectOptionFromDropDown(users,"Poland");
    }
    public static void selectOptionFromDropDown(WebElement element, String value) {
        Select drp = new  Select(element);
        List<WebElement> allOptions = drp.getOptions();
        for (WebElement option:allOptions) {
            if(option.getText().equals(value)) {
                option.click();
                break;
            }
        }
    }
}
