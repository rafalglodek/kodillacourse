package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;

public class PdfDownload {
    public static void main(String[] args) throws InterruptedException {

        String location= "C:\\Projects\\kodilla-course\\cucumber\\src\\main\\Downloads";
        HashMap preferences=new HashMap<>();
        preferences.put("plugins.always_open_pdf_externally",true);
        preferences.put("download.default_directory", location);

        ChromeOptions options =new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);

/*
        FirefoxProfile profile =new FirefoxProfile();
        profile.setPreference("pdfjs.disable",true);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/msword");
        //https://www.sitepoint.com/mime-types-complete-list/
        profile.setPreference("browser.download.folderList",2);
        profile.setPreference("browser.download.dir",location);
        FirefoxOptions options =new FirefoxOptions();
        options.setProfile(profile);

 */
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.get("https://filesamples.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Document']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//a[normalize-space()='Get .pdf samples']")).click();
        driver.findElement(By.xpath("//*[@id=\"output\"]/div[1]/a")).click();



    }
}
