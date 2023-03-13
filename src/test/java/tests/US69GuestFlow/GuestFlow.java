package tests.US69GuestFlow;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class GuestFlow extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_GuestFlow() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger());
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1111111111111",9000));
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        Thread.sleep(3000);
        driver.findElement(pages.GuestFlow.OtpField1).sendKeys("6");
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys("6666");
        driver.findElement(pages.GuestFlow.OtpField2).sendKeys("6");
        driver.findElement(pages.GuestFlow.OtpField3).sendKeys("6");
        driver.findElement(pages.GuestFlow.OtpField4).sendKeys("6");
        driver.findElement(pages.GuestFlow.OtpField5).sendKeys("6");
        driver.findElement(pages.GuestFlow.OtpField6).sendKeys("6");

    }
}
