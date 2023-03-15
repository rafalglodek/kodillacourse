package Selenium.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.nopcommerce.com/en/demo");
        driver.manage().window().maximize();

 /*     TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File screenShot=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file=new File("C:\\Users\\Rafal\\Desktop\\Screen\\screen.png");
        FileUtils.copyFile(screenShot,file);
 */
        WebElement part=driver.findElement(By.xpath("//div[@class='footer-upper']"));
        File screenShot=part.getScreenshotAs(OutputType.FILE);
        File file=new File("C:\\Users\\Rafal\\Desktop\\Screen\\screen.png");
        FileUtils.copyFile(screenShot,file);



    }

}
