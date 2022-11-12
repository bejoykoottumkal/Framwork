package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInPage {
    WebDriver driver;
    public logInPage(WebDriver driver){
        this.driver =  driver;
    }
    public void login(String username, String password){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='signon']")).click();
    }
    public String getPageURL(){
        return driver.getCurrentUrl();
    }

}
