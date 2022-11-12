package BaseClass;

import Utilities.utilityFetchProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class driverInstance {
    public WebDriver driver;

    @BeforeMethod
    public void initiateDriverInstance() throws IOException {
        String browserName = utilityFetchProperty.fetchPropertyValue("browserName");
        switch(browserName){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

        }
        driver.get(utilityFetchProperty.fetchPropertyValue("url"));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeInstance(){
       // driver.quit();
    }
}
