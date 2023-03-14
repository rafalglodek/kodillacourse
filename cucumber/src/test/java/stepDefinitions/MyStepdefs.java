package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AddingNewCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class MyStepdefs extends BaseClass {


    @Before
    public void setup() throws IOException {

        logger = Logger.getLogger("cucumber");
        PropertyConfigurator.configure("log4j.properties");

        configProp = new Properties();
        FileInputStream configPropFile = new FileInputStream("C:\\Projects\\kodilla-course\\" +
                "cucumber\\src\\test\\resources\\config.properties");
        System.out.println(configPropFile);
        configProp.load(configPropFile);

        String br = configProp.getProperty("browser");
        System.out.println(br);

        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
            driver = new ChromeDriver();
        } else if(br.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver",configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();
        } else if(br.equals("edge")) {
            System.setProperty("webdriver.edge.driver", configProp.getProperty("iepatch"));
            driver = new EdgeDriver();
        }

        logger.info("Launching browser - logger TEST example");
    }

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {

        lp = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User Enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String Email, String Password) {
        lp.setUserName(Email);
        lp.setPassword(Password);
    }

    @When("Click on login")
    public void click_on_login() {
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {

        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }

    }

    @When("User click on log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);
    }

    @Then("Page title Should be \"Your store. Login")
    public void page_title_should_be_your_store_login() {
    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();
    }

    // Customer features step definitions

    @Then("User can see Dashboard")
    public void user_can_see_dashboard() {
        addingNewCustomer=new AddingNewCustomer(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration",addingNewCustomer.getPageTitle());
    }
    @When("User click on Customers Menu")
    public void user_click_on_customers_menu() {
        addingNewCustomer.clickOnCustomersMenu();
    }
    @When("Click on Customers Menu Item")
    public void click_on_customers_menu_item() {
        addingNewCustomer.clickOnCustomersMenuItem();
    }
    @When("Click on Add new Button")
    public void click_on_add_new_button() {
        addingNewCustomer.clickOnAddnew();
    }
    @Then("User can view Add new Customer page")
    public void user_can_view_add_new_customer_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration",addingNewCustomer.getPageTitle());
    }
    @When("User enter Customer info")
    public void user_enter_customer_info() throws InterruptedException {
        String email=randomString()+"@gmail.com";
        addingNewCustomer.setEmail(email);
        addingNewCustomer.setPassword("1234");
        addingNewCustomer.setCustomerRoles("Administrators");
        addingNewCustomer.setFirstName("Rafal");
        addingNewCustomer.setLastName("Glodek");
        addingNewCustomer.setGender("Male");
        addingNewCustomer.setManagerOfNewsLetter1("Test store 2");
        addingNewCustomer.setManagerOfVendor("Vendor 1");
        addingNewCustomer.setDob("2/8/2023");
        addingNewCustomer.setCompanyName("ABC");
        addingNewCustomer.setAdminContent("Test");
        addingNewCustomer.clickOnIsTaxExempt();
        addingNewCustomer.deleteRegistered();
    }
    @When("click on save button")
    public void click_on_save_button() {
        addingNewCustomer.clickOnSave();
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String massage) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().
                contains(massage));
    }

    //  Steps for searching customer using email

    @When("Enter customer email")
    public void enter_customer_email() {
        searchCustomerPage = new SearchCustomerPage(driver);
        searchCustomerPage.setEmail("aa123@gmail.com");
    }

    @When("Click on Search button")
    public void click_on_search_button() throws InterruptedException {
        searchCustomerPage.clickSearch();
        Thread.sleep(300);
    }

    @Then("User should found email {string} in the search table")
    public void user_should_found_email_in_the_search_table(String email) {
         Boolean status = searchCustomerPage.searchCustomersByEmail(email);
        Assert.assertEquals(true,status);
    }

    //  Steps for searching customer using email

    @When("Enter customer First name")
    public void enter_customer_first_name() {
        searchCustomerPage = new SearchCustomerPage(driver);
        searchCustomerPage.setFirstName("Abhishek");

    }

    @When("Enter customer Last name")
    public void enter_customer_last_name() {
        searchCustomerPage.setLastName("Singh");

    }

    @Then("User should found Name in the search table")
    public void user_should_found_name_in_the_search_table() {
        Boolean status = searchCustomerPage.searchCustomersByName("Abhishek Singh");
        Assert.assertEquals(true,status);
    }

}
