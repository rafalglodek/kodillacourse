package stepDefinitions;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import pageObjects.AddingNewCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

import java.util.Properties;
import java.util.logging.Logger;

public class BaseClass {
    public WebDriver driver;
    public LoginPage lp;
    public AddingNewCustomer addingNewCustomer;
    public SearchCustomerPage searchCustomerPage;
    public static Logger logger;
    public Properties configProp;

    public static String randomString() {
        String generatedString= RandomString.make(5);
        return generatedString;
    }

}
