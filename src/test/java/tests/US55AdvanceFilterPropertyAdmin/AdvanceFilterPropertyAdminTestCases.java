package tests.US55AdvanceFilterPropertyAdmin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class AdvanceFilterPropertyAdminTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminSearchChargerByInvalidChargerTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminEntersAlphabatesinChargerTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Alphabates")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyBrowserhasRereshafterProvidingSpaceinSearchBar() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.enterSpaceinSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCrossButtonHasDisplayedAfterTypingTheValidChargerTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.verifCrossButtonHasDisplyed());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckWhatHappensWhenAdminClicksOnCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyPageHasRefreshedAfterClickingonCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckWhatHappensWhenAdminClicksOnCrossOptionAfterSearchingCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyChargerPageHasResetToDefaultvalueAfterPressingCrossButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminOpenLocationPageInIncognitoMode () throws InterruptedException, IOException {
        SearchChargers searchChargers=new SearchChargers(driver);
        Assert.assertTrue(searchChargers.openChargerPageinIncognitoMode());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminPressEnterAfterSearchingtheCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchChargers.pressEnterButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }

}
