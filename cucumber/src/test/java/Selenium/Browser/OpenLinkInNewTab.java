package Selenium.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenLinkInNewTab {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.nopcommerce.com/en/demo");

        driver.manage().window().maximize();

        String tab= Keys.chord(Keys.CONTROL,Keys.RETURN);

        driver.findElement(By.xpath("//a[@href='/en/partners']")).sendKeys(tab);





    }
}
