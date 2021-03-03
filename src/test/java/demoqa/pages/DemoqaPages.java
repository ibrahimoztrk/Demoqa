package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPages {

    public DemoqaPages() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath="//*[.='Text Box']")
    public WebElement textbox;

    @FindBy(xpath="//*[.='Check Box']")
    public WebElement checkbox;
    @FindBy(xpath="//*[.='Radio Button']")
    public WebElement radioButton;
    @FindBy(id="item-3")
    public WebElement webTables;
    @FindBy(id="userName")
    public WebElement fullName;
    @FindBy(id="userEmail")
    public WebElement email;
    @FindBy(id="currentAddress")
    public WebElement currentAddress;
    @FindBy(id="permanentAddress")
    public WebElement permanentAddress;
    @FindBy(id="submit")
    public WebElement submit;
    @FindBy(xpath = "//span[@class='rct-checkbox']")
    public WebElement home;
    @FindBy(id = "yesRadio")
    public WebElement yesRadio;
    @FindBy(id = " edit-record-1")
    public WebElement webTablesEdit;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(id = "age")
    public WebElement age;
    @FindBy(id = "salary")
    public WebElement salary;
    @FindBy(id = "department")
    public WebElement department;
    @FindBy(id = "submit")
    public WebElement webTablessubmit;
    @FindBy(xpath = "//p")
    public WebElement yesText;








}
