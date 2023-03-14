package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {
        // Generic methods
        // SelectByVisibleTex()
        // SelectByValue()
        // SelectByIndex()

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement dropCountryElement = driver.findElement(By.id("input-country"));
        Select dropCountry = new Select(dropCountryElement);
        //dropCountry.selectByVisibleText("Poland");
        //dropCountry.selectByValue("1");
        //dropCountry.selectByIndex(2);  //  Albania

        List<WebElement>allOptions = dropCountry.getOptions();
        for (WebElement option:allOptions) {
            if(option.getText().equals("Cuba")) {
                option.click();
                break;
            }
        }

    }
}
