package tests.US134CreateCharger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class CreateChargersTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_8_VerifyCreateNewChargerIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());

    }
    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_9_AddNewChargerDrawerHasDisplayedAfterClickingonAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_WhenPressSaveButtonWithoutChargerNameInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writePropertyName(prop.getProperty("PropertyName2")));
        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyChargerNameErrorMsgHasDisplayed());

//
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_WhenPressSaveButtonWithoutPropertyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeNewChargerName(prop.getProperty("NewChargerName")));
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyPropertyNameErrorMsgHasDisplayed());

//
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_WhenPressSaveButtonWithoutAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyChargerNameErrorMsgHasDisplayed());
        Assert.assertTrue(createcharger.verifyPropertyNameErrorMsgHasDisplayed());

//
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_WhenAdminProvidesValidDatainFieldofCreateNewCharger() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeNewChargerName(prop.getProperty("NewChargerName")));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writePropertyName(prop.getProperty("PropertyName2")));
        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
//        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
//        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
//        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
//        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
//        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
//        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
//        Assert.assertTrue(company.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminProvidesValidDatainFieldofCreateNewCharger() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeNewChargerName(prop.getProperty("NewChargerName")));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writePropertyName(prop.getProperty("PropertyName3")));
        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
        Assert.assertTrue((createcharger.clickonlocation()));
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.location,"Electric Charger",3000));
        Assert.assertTrue(createcharger.selectLoactionNameFromSelectPropertyDropdown());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
    }




}
