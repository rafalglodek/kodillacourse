package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class SearchCustomerPage {

    public WebDriver ldriver;
    public WaitHelper waitHelper;

    public SearchCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper = new WaitHelper(ldriver);
    }
    @FindBy(how = How.ID,using = "SearchEmail")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(how = How.ID,using = "SearchFirstName")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(how = How.ID,using = "SearchLastName")
    @CacheLookup
    WebElement txtLastName;
    @FindBy(how = How.ID,using = "search-customers")
    @CacheLookup
    WebElement searchButton;

    @FindBy(how = How.XPATH,using = "//table[@id = 'customers-grid']")
    WebElement table;
    @FindBy(how = How.XPATH,using = "//table[@id = 'customers-grid']//tbody/tr")
    List<WebElement> tableRows;

    @FindBy(how = How.XPATH,using = "//table[@id = 'customers-grid']//tbody/tr/td")
    List<WebElement> tableColumns;

    public void setEmail(String email) {
        waitHelper.WaitForElement(txtEmail, Duration.ofSeconds(30));
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }
    public void setFirstName(String firstName) {
        //waitHelper.WaitForElement(txtFirstName, Duration.ofSeconds(30));
        //txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }
    public void setLastName(String lastName) {
        //waitHelper.WaitForElement(txtLastName, Duration.ofSeconds(30));
        //txtLastName.clear();
        txtLastName.sendKeys(lastName);
    }
    public void clickSearch() {
        searchButton.click();
        waitHelper.WaitForElement(searchButton, Duration.ofSeconds(3));
    }
    public int getNumberOfRows() {
        return (tableRows.size());
    }
    public int getNumberOfColumns() {
        return (tableColumns.size());
    }

    public boolean searchCustomersByEmail(String email) {
        boolean flag = false;
        for(int i = 0; i<=getNumberOfRows();i++) {
            String emailId= table.findElement(By.xpath("//table[@id ='customers-grid']/tbody/tr/td[2]")).getText();
            if (emailId.equals(email));
            flag=true;
        }
        return flag;
    }

    public boolean searchCustomersByName(String name) {
        boolean flag = false;
        for(int i = 0; i<=getNumberOfRows();i++) {
            String Name = table.findElement(By.xpath("//table[@id ='customers-grid']/tbody/tr/td[3]")).getText();
            String names[] =Name.split(" ");

            if (names[0].equals("Abhishek") && names[1].equals("Singh"));
            flag=true;
        }
        return flag;
    }
}
