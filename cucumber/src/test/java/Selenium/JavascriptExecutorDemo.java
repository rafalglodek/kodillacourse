package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class JavascriptExecutorDemo {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.get("https://demo.nopcommerce.com/");
        //driver.navigate().refresh();
/*
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil.drawBorder(logo, driver);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("C:\Users\Rafal\Desktop\Screen\logo.png");
        FileUtils.copyFile(src, trg);

        String title=JavaScriptUtil.getTitleByJS(driver);
        System.out.println(title);

        //WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        //JavaScriptUtil.clickElementByJS(register, driver);
        //register.click();
        //JavaScriptUtil.refreshBrowserByJS(driver);
        //JavaScriptUtil.scrollPageUp(driver);

 */
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil.flash(logo,driver);

    }
}
