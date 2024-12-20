package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;

public class Download {
    public static void main(String[] args) throws InterruptedException {

        //String location= System.getProperty("user.dir")+"\\Downloads\\";
        String location= "C:\\Projects\\kodilla-course\\cucumber\\src\\main\\Downloads";
        HashMap preferences=new HashMap<>();
        preferences.put("download.default_directory", location);


        //ChromeOptions options =new ChromeOptions();
        //options.setExperimentalOption("prefs",preferences);

        //EdgeOptions options =new EdgeOptions();
        //options.setExperimentalOption("prefs",preferences);


        FirefoxProfile profile =new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/msword");
        //https://www.sitepoint.com/mime-types-complete-list/
        profile.setPreference("browser.download.folderList",2);
        profile.setPreference("browser.download.dir",location);
        FirefoxOptions options =new FirefoxOptions();
        options.setProfile(profile);



        WebDriverManager.firefoxdriver().setup();
        RemoteWebDriver driver = new FirefoxDriver(options);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://filesamples.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Document']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Get .doc samples']")).click();
        driver.findElement(By.xpath("//*[@id=\"output\"]/div[1]/a")).click();


    }
}
