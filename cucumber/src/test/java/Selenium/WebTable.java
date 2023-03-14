package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/ecosystem/");
        driver.manage().window().maximize();
        int rows= driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody/tr")).size();
        System.out.println(rows);
        int columns= driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//thead/tr/th")).size();
        System.out.println(columns);
        String value=driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tr[2]/td[2]")).getText();
        System.out.println(value);
/*
        for (int r=1;r<rows;r++) {
            for (int c=1;c<columns;c++) {
                String data=driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']" +
                        "//table[@class='table']//tr["+r+"]/td["+c+"]")).getText();
                System.out.println(data+"  ");
            }
            System.out.println();
        }
 */
        for (int r=1;r<rows;r++) {
                String data=driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']" +
                        "//table[@class='table']//tr["+r+"]/th")).getText();
            //System.out.println(data);
                if (data.equals("wd")) {
                    String author=driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//" +
                            "table[@class='table']//tr["+r+"]/td[2]")).getText();
                    String language=driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//" +
                            "table[@class='table']//tr["+r+"]/td[1]")).getText();
                    System.out.println(author);
                    System.out.println(language);
                }

            System.out.println();
        }
        driver.quit();
    }
}
