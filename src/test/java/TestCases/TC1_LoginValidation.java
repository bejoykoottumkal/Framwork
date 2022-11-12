package TestCases;

import BaseClass.driverInstance;
import Pages.landingPage;
import Pages.logInPage;
import Utilities.ExcelUtility;
import Utilities.utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC1_LoginValidation extends driverInstance {
    @Test(dataProvider = "loginDetails")
    public void loginValidation(String username,String password){
        landingPage land = new landingPage(driver);
        logInPage log =new logInPage(driver);
        land.clickSignIn();
        log.login(username,password);
        Assert.assertTrue(utils.verifyTextContains("https://petstore.octoperf.com/actions/Catalog.action",log.getPageURL()));
    }
    @DataProvider(name =  "loginDetails")
    public Object[][] userDetails()
    {
        ExcelUtility.setExcelfile("./src/test/resources/TestData/TestData.xlsx","DataSheet");
        Object[][] test= ExcelUtility.getTableData("TC1_LoginValidation");
        return test;
    }


}
