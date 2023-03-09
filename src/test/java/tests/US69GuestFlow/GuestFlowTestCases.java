package tests.US69GuestFlow;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;

public class GuestFlowTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckGuestFlow() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        GuestFlow guestFlow= new GuestFlow(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createCharger.writeInputText(ChargerListPropertyAdmin.SearchChargerField,"Selenium 33",3000));
        Assert.assertTrue(createCharger.ClickButton(ChargerListPropertyAdmin.searchargerbtn,3000));
        Assert.assertTrue(createCharger.ClickButton(CosAdminChargerList.EditButton,3000));
        Assert.assertTrue(createCharger.ClickButton(UpdateChargerPropertyAdmin.CopyButton,3000));
        Assert.assertTrue(guestFlow.GuestFlow());

    }




}
