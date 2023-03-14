package Selenium.Date;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DatePicker_DropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='dob']")).click();

        Select month_dropDown = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        month_dropDown.selectByVisibleText("Aug");

        Select year_dropDown = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        year_dropDown.selectByValue("1990");

        String date= "15";

        List<WebElement>dates=driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//td"));

        for (WebElement element:dates) {
            String name=element.getText();
            if (name.equals(date)) {
                element.click();
            }

        }
    }

}
