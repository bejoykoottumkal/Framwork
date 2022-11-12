package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
    WebDriver driver;
    public landingPage(WebDriver dvr){
       driver =  dvr;

    }
    public void clickSignIn(){
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

    }
}
