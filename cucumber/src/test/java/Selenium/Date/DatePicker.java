package Selenium.Date;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        String year="2024";
        String month="Mar";
        String day="10";

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

        while (true) {
            String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            System.out.printf(monthyear);
            String arr[]=monthyear.split(" ");

            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year)) {
                break;

            }
            else {
                driver.findElement(By.xpath("//button[normalize-space()='>']")).click();

            }

        }
        List<WebElement>dates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
        for (WebElement element:dates) {
            String el=element.getText();
            if (el.equals(day)) {
                element.click();
                break;
            }
        }
    }
}
