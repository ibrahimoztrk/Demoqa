package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "(//*[@id=\"item-3\"]/span)[1]")
    public WebElement webTables;
    @FindBy(xpath = "//span[.='Buttons']")
    public WebElement Buttons;

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
    @FindBy(xpath = "//label[@for='yesRadio']")
    public WebElement yesRadioXpath;
    @FindBy(id = "result")
    public WebElement resultText;
    @FindBy(id = "edit-record-1")
    public WebElement webTablesEdit;
    @FindBy(id = "edit-record-2")
    public WebElement webTablesDelete;
    @FindBy(id = "searchBox")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class='rt-td']")
    public WebElement webtablessearchResult;
    @FindBy(xpath = "(//div[@class='rt-td'])[8]")
    public WebElement webtable2émeName;
    @FindBy(id = "delete-record-2")
    public WebElement webTablesDeleteButton;
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
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;
    @FindBy(xpath ="(//button[@type='button'])[4]")
    public WebElement clickMe;
    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;
    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;
    @FindBy(xpath = "//a")
    public List<WebElement> allLinks;
    @FindBy(id="simpleLink")
    public WebElement homeLink;
    @FindBy(xpath = "//*[.='Links']")
    public WebElement linkText;
    @FindBy(id = "downloadButton")
    public WebElement downloadButton;
    @FindBy(id = "uploadFile")
    public WebElement uploadFile;
    @FindBy(id = "uploadedFilePath")
    public WebElement uploadedFilePath;
    @FindBy(id = "enableAfter")
    public WebElement enableAfter;
    @FindBy(id = "colorChange")
    public WebElement colorChange;
    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;




















}
