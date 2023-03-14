package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckDropDownSorted {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com/");
        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
        WebElement dropDown=driver.findElement(By.name("category_id"));
        Select drpElement=new Select(dropDown);
        List<WebElement>options=drpElement.getOptions();
        ArrayList originalList= new ArrayList<>();
        ArrayList temporaryList= new ArrayList<>();

        for(WebElement option:options) {

            originalList.add(option.getText());
            temporaryList.add(option.getText());
        }

        System.out.println(originalList);
        System.out.println(temporaryList);

        Collections.sort(temporaryList);

        System.out.println(originalList);
        System.out.println(temporaryList);

        if(originalList.equals(temporaryList)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
        driver.close();
    }

}
