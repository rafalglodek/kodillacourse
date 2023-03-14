package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestDropDown_BingSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement acceptButton=driver.findElement(By.id("bnp_btn_accept"));
        acceptButton.click();

        Thread.sleep(5000);
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium download");

        Thread.sleep(5000);
        List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));

        System.out.println(list.size());
        for(WebElement element:list) {
            if (element.getText().equals("selenium download")) {
                element.click();
                break;
            }
        }
    }
}
