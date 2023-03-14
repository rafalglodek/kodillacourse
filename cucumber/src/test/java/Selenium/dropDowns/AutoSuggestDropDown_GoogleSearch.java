package Selenium.dropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestDropDown_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement acceptButton=driver.findElement(By.id("L2AGLb"));
        acceptButton.click();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("q")).sendKeys("java tutorial");
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));

        System.out.println(list.size());
        for(WebElement element:list) {
            if (element.getText().equals("java tutorial")) {
                element.click();
                break;
            }
        }

    }
}
