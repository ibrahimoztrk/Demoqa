package demoqa.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

     private Driver() {
          //Baska obje olusturulmasini istemedigimiz icin create ediyoruz.
     }

        static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver==null) {
               switch (ConfigReader.getProperty("browser")) {
                   case "chrome" :
                       WebDriverManager.chromedriver().setup();
                       driver = new ChromeDriver();
                       break;
                   case "firefox" :
                       WebDriverManager.firefoxdriver().setup();
                       driver = new FirefoxDriver();
                       break;
                   case "Edge" :
                       WebDriverManager.edgedriver().setup();
                       driver = new EdgeDriver();
                       break;
                   case "ie" :
                       WebDriverManager.iedriver().setup();
                       driver = new InternetExplorerDriver();
                       break;
                   case "safari":
                       WebDriverManager.getInstance(SafariDriver.class).setup();
                       driver = new SafariDriver();
                       break;



               }

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;

        }
    public static void closeDriver(){
        if(driver!=null){  //eger driver chrome'u isaret ediyorsa
            driver.quit();  // driver'i kapat
            driver=null; // driver'in null oldugundan emin olmak icin tekrar null olarak atayalim.
        }               //Boylelikle driver'i tekrar baslatabilirim.
    }                   //Multi Browser Test(chrome, firefox, ie ...) yaparken bu onemli olacaktir.


}