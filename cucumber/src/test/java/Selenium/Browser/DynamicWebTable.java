package Selenium.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicWebTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("demo");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

        String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        System.out.println(text);
        int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
        System.out.println(total_pages);

        int total_rows = 0;
        for (int p=1;p<=total_pages;p++) {
            Thread.sleep(3000);
            WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
            active_page.click();
            int table_size=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            total_rows=total_rows+table_size;

            for(int r=1;r<=table_size;r++) {
                String orderId =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
                String customer =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
                String status =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
                //System.out.println(orderId+ " " + customer + " " + status);
                if (status.equals("Pending")) {
                    System.out.println(orderId+ " " + customer + " " + status);

                }

            }

            if (p+1<total_pages+1) {
                String page_number=Integer.toString(p+1);

                driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+page_number+"']")).click();
            }
            System.out.println(table_size);
        }
        System.out.println(total_rows);
    }
}
