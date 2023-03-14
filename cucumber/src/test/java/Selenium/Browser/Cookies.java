package Selenium.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public class Cookies {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Cookie cookieTestobj=new Cookie("Test cookie", "test");
        driver.manage().addCookie(cookieTestobj);

        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies.size());
        for (Cookie cookie:cookies) {
            System.out.println(cookie.getName());
        }
        Thread.sleep(3000);
        driver.manage().deleteCookie(cookieTestobj);  // does not work
        //driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed(".Nop.Antiforgery");
        driver.manage().deleteCookieNamed("_ga_SCT41TW89V");
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());

        for (Cookie cookie:cookies) {
            System.out.println(cookie.getName());
        }

        driver.quit();
    }
}
