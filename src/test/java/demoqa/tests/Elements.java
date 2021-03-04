package demoqa.tests;

import demoqa.pages.DemoqaPages;
import demoqa.utilities.ConfigReader;
import demoqa.utilities.Driver;
import demoqa.utilities.TestBaseFinal;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Elements extends TestBaseFinal {
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
    public void checkBox() {
        demoqaPages.checkbox.click();
        demoqaPages.home.click();
        Assert.assertTrue(demoqaPages.resultText.getText().contains(ConfigReader.getProperty("checkboxText")));
    }

    @Test
    public void RadioButton() {
        demoqaPages.radioButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoqaPages.yesRadioXpath.click();
        Assert.assertTrue(ConfigReader.getProperty("yesText").equals(demoqaPages.yesText.getText()));
    }

    @Test
    public void WebTables() {
        Driver.getDriver().get(ConfigReader.getProperty("webtables"));

        demoqaPages.webTablesEdit.click();
        demoqaPages.firstName.clear();
        demoqaPages.firstName.sendKeys("edith");
        demoqaPages.lastName.sendKeys("piaf");
        demoqaPages.userEmail.clear();
        demoqaPages.userEmail.sendKeys("edith@piaf.com");
        demoqaPages.age.sendKeys("100");
        demoqaPages.salary.sendKeys("20000");
        demoqaPages.department.sendKeys("Paris");
        demoqaPages.webTablessubmit.submit();
        demoqaPages.searchBox.sendKeys("edith");
        Assert.assertTrue(demoqaPages.webtablessearchResult.getText().equals("edith"));


    }

    @Test
    public void WebTables2() {
        Driver.getDriver().get(ConfigReader.getProperty("webtables"));
        String deuxiémeNom = demoqaPages.webtable2émeName.getText();
        demoqaPages.webTablesDeleteButton.click();
        demoqaPages.searchBox.sendKeys(demoqaPages.webtable2émeName.getText());
        Assert.assertFalse(demoqaPages.webtablessearchResult.getText().contains(deuxiémeNom));

    }

    @Test
    public void Buttons() {
        Driver.getDriver().get(ConfigReader.getProperty("buttons"));
        actions = new Actions(Driver.getDriver());
        actions.doubleClick(demoqaPages.doubleClickBtn).perform();
        Assert.assertTrue(demoqaPages.doubleClickMessage.getText().contains(ConfigReader.getProperty("doubleClickMesagge")));


    }

    @Test
    public void Buttons2() {
        Driver.getDriver().get(ConfigReader.getProperty("buttons"));
        actions = new Actions(Driver.getDriver());
        actions.contextClick(demoqaPages.rightClickBtn).perform();
        Assert.assertTrue(demoqaPages.rightClickMessage.getText().contains(ConfigReader.getProperty("rightClickMessage")));

    }

    @Test
    public void Buttons3() {
        Driver.getDriver().get(ConfigReader.getProperty("buttons"));
        actions = new Actions(Driver.getDriver());
        actions.click(demoqaPages.clickMe).perform();
        Assert.assertTrue(demoqaPages.dynamicClickMessage.getText().contains(ConfigReader.getProperty("dynamicClickMessage")));


    }

    @Test
    public void Links1() {
        Driver.getDriver().get(ConfigReader.getProperty("links"));
        System.out.println("nombre des links: " + demoqaPages.allLinks.size());
        int i = 0;
        for (WebElement w :
                demoqaPages.allLinks) {
            System.out.println(i + ".iéme link : " + w.getText());
            i++;
        }

    }

    @Test
    public void Links2() {
        Driver.getDriver().get(ConfigReader.getProperty("links"));
        String parentHandle = Driver.getDriver().getWindowHandle();
        demoqaPages.homeLink.click();
        Set<String> allHandles = Driver.getDriver().getWindowHandles();
        for (String w : allHandles
        ) {
            if (!w.equals(parentHandle)) {
                Driver.getDriver().switchTo().window(parentHandle);
            }
        }
        Assert.assertTrue(demoqaPages.linkText.getText().contains(ConfigReader.getProperty("linkText")));

    }

    @Test
    public void downloadUpload() throws IOException, InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("downloadUpload"));
        demoqaPages.downloadButton.click();
        String path = "C:\\Users\\ibrahim\\Downloads\\sampleFile.jpeg";
        demoqaPages.uploadFile.sendKeys(path);

        Thread.sleep(2000);
        Assert.assertTrue(demoqaPages.uploadedFilePath.getText().contains(ConfigReader.getProperty("uploadSuccess")));

    }

    @Test
    public void dynamicProperties() {
        Driver.getDriver().get(ConfigReader.getProperty("dynamicProperties"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(demoqaPages.enableAfter));
        demoqaPages.enableAfter.click();
        wait.until(ExpectedConditions.visibilityOf(demoqaPages.visibleAfter));
        demoqaPages.visibleAfter.click();


    }


}

