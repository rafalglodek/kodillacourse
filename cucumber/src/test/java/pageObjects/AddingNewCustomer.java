package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddingNewCustomer {
    public WebDriver ldriver;
    public static final String SEARCHFIELD = "AdminComment";


    public AddingNewCustomer(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    By lnkCustomers_menu=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
    //By lnkCustomers_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");

    By lnkCustomers_menuitem=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a");
    //By lnkCustomers_menuitem=By.xpath("//span[@class='menu-item-title'][contains(text(),)");

    By btnAddnew=By.xpath("//a[@class=\"btn btn-primary\"]");
    //By btnAddnew=By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
    By txtEmail=By.xpath("//input[@id='Email']");
    By txtPassword=By.xpath("//input[@id='Password']");
    //By txtCPFCNPJ=By.xpath("//*[@id=\"customer_attribute_1\"]");

    By txtcustomerRoles=By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]");

    By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
    By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
    By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
    By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
    By lstitemYourStoreName=By.xpath("//li[contains(text(),'Your store name')]");
    By lstitemTestStore2=By.xpath("//li[contains(text(),'Test store 2')]");
    By drpmgrOfVendor=By.xpath("//*[@id=\"VendorId\"]");

    By dropMenuOfStores=By.xpath("//*[@id=\"SelectedNewsletterSubscriptionStoreIds\"]");
    //div[contains(@class, "tasks-container")]/form/div/fieldset/select[1]
    By rdMaleGender=By.id("Gender_Male");
    By rdFemaleGender=By.id("Gender_Female");
    By txtFirstName=By.xpath("//input[@id='FirstName']");
    By txtLastName=By.xpath("//input[@id='LastName']");

    By txtDob=By.xpath("//input[@id='DateOfBirth']");
    By txtCompanyName=By.xpath("//input[@id='Company']");
    By txtAdminContent=By.id(SEARCHFIELD);
    By btnSave=By.xpath("//button[@name='save']");
    By isTaxExempt=By.xpath("//*[@id=\"IsTaxExempt\"]");
    //By txtName=By.xpath("//*[@id=\"customer_attribute_2\"]");
    By textRegistered=By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]");

    // Actions method

    public void setManagerOfNewsLetter1(String store) throws InterruptedException {
        Thread.sleep(3000);
        WebElement listitem2;

        if (store.equals("Your store name"))
        {
            listitem2=ldriver.findElement(lstitemYourStoreName);
        }
        else if (store.equals("Test store 2"))
        {
            listitem2=ldriver.findElement(lstitemTestStore2);
        }
        else
        {
            listitem2=ldriver.findElement(lstitemTestStore2);
        }
        //listitem2.click();

        JavascriptExecutor js=(JavascriptExecutor)ldriver;
        js.executeScript("arguments[0].click();",listitem2);
    }
    public void deleteRegistered() {
        ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
    }
    public String getPageTitle() {
        return ldriver.getTitle();
    }
    public void clickOnCustomersMenu() {
        ldriver.findElement(lnkCustomers_menu).click();
    }
    public void clickOnCustomersMenuItem() {
        ldriver.findElement(lnkCustomers_menuitem).click();
    }
    public void clickOnIsTaxExempt() {
            ldriver.findElement(isTaxExempt).click();
        }
    public void clickOnAddnew() {
        ldriver.findElement(btnAddnew).click();

    }
    public void setEmail(String email) {
        ldriver.findElement(txtEmail).sendKeys(email);
    }


    public void setPassword(String password) {
        ldriver.findElement(txtPassword).sendKeys(password);
    }
    public void setCustomerRoles(String role) throws InterruptedException
    {
        //ldriver.findElement(textRegistered).click();
        Thread.sleep(3000);
        WebElement listitem;
        if (role.equals("Registered"))
        {
            listitem=ldriver.findElement(lstitemRegistered);
        }
        else if(role.equals("Administrators"))
        {
            listitem=ldriver.findElement(lstitemGuests);
        }


        else if(role.equals("Vendors"))
        {
            listitem=ldriver.findElement(lstitemVendors);
        }
        else
        {
            listitem=ldriver.findElement(lstitemGuests);
        }
        //listitem.click();


        JavascriptExecutor js=(JavascriptExecutor)ldriver;
        js.executeScript("arguments[0].click();",listitem);
    }
    public void setManagerOfVendor(String value) {
        Select drp = new Select(ldriver.findElement(drpmgrOfVendor));
        drp.selectByVisibleText(value);
    }
    public void setGender(String gender) {
        if (gender.equals("Male")) {
            ldriver.findElement(rdMaleGender).click();
        }
        else if (gender.equals("Female")) {
            ldriver.findElement(rdFemaleGender).click();
        }
        else {                                                  //  DEFAULT
            ldriver.findElement(rdMaleGender).click();
        }
    }

    public void setFirstName(String fname) {
        ldriver.findElement(txtFirstName).sendKeys(fname);
    }
    public void setLastName(String lname) {
        ldriver.findElement(txtLastName).sendKeys(lname);
    }
    public void setDob(String dob) {
        ldriver.findElement(txtDob).sendKeys(dob);
    }
    public void setCompanyName(String comname) {
        ldriver.findElement(txtCompanyName).sendKeys(comname);
    }
    public void setAdminContent(String comment) {
        ldriver.findElement(txtAdminContent).sendKeys(comment);
    }
    public void clickOnSave () {
        ldriver.findElement(btnSave).click();
    }
}
