package Selenium.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //String windowID=driver.getWindowHandle();
        //System.out.println(windowID);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> windowsID=driver.getWindowHandles();
/*
        Iterator<String>id= windowsID.iterator();
        String parent=id.next();
        String child=id.next();
        System.out.println(parent);
        System.out.println(child);

 */
        List<String>list=new ArrayList<>(windowsID);

        String parent=list.get(0);
        String child=list.get(1);
        System.out.println(parent);
        System.out.println(child);

        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parent);
/*


        for(String element:list) {
            String title=driver.switchTo().window(element).getTitle();
            System.out.println(element);
        }

        for(String element:list) {
        String title=driver.switchTo().window(element).getTitle();
        if(title.equals("OrangeHRM")) {
            close();
        }
            String title=driver.switchTo().window(element).getTitle();
            System.out.println(element);
        }

 */
        driver.close();
        driver.quit();

    }
}
