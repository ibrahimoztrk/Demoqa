package demoqa.tests;

import demoqa.pages.DemoqaPages;
import demoqa.utilities.ConfigReader;
import demoqa.utilities.Driver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Elements {
    DemoqaPages demoqaPages = new DemoqaPages();
    Actions actions;

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("elements"));
    }

    @Test
    public void textBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("elements"));
        demoqaPages.textbox.click();
        demoqaPages.fullName.sendKeys("Edith Piaf");
        demoqaPages.email.sendKeys("edit@piaf.com");
        demoqaPages.currentAddress.sendKeys("Paris et Paris");
        demoqaPages.permanentAddress.sendKeys("2eme paris");
        demoqaPages.submit.submit();

    }

    @Test
    public void checkBox()  {
            demoqaPages.checkbox.click();
            demoqaPages.home.click();
    }

    @Test
    public void RadioButton() {
         demoqaPages.radioButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoqaPages.yesRadio.click();


        Assert.assertTrue(ConfigReader.getProperty("yesText").equals(demoqaPages.yesText.getText()));
    }

    @Test
    public void WebTables() {
           demoqaPages.webTables.click();
           demoqaPages.webTablesEdit.click();
           demoqaPages.firstName.sendKeys("edith");
           demoqaPages.lastName.sendKeys("piaf");
           demoqaPages.userEmail.sendKeys("edith@piaf.com");
           demoqaPages.age.sendKeys("100");
           demoqaPages.salary.sendKeys("20000");
           demoqaPages.department.sendKeys("Paris");
           demoqaPages.webTablessubmit.submit();


    }

}
