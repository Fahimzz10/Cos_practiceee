package tests.US30SearchChargers;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class SearchChargersTestCases extends BaseTest {

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
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
    //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
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
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
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
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.enterSpaceinSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCrossButtonHasDisplayedAfterTypingtheValidChargertitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.verifCrossButtonHasDisplyed());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckWhatHappensWhenAdminClicksonCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyPageHasRefreshedAfterClickingonCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckWhatHappensWhenAdminClicksonCrossOptionAfterSearchingCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
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
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminOpenLocationPageInIncognitoMode () throws InterruptedException, IOException {
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        Assert.assertTrue(searchChargers.openChargerPageinIncognitoMode());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminPressEnterAfterSearchingtheCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchChargers.pressEnterButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_VerifyCountAftersearchingCharger () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerPageCount());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhatHappensWhwnAdminSearchTheChargerByChargerTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhwnAdminSearchTheChargerByLocationTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Locationwithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedLocationTitleisShowing());
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWhatHappensWhwnAdminRefreshthePageAfterSearchingTheCharger () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchChargers.verifySearchInputRemainsSameAfterRefreshingTeBrowser());
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_verifyPropertyNameisShowinginPropertyDropdownAfterTypingValidPropertyName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.verifyPropertyisShowingInTheDropDown());
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongPropertyFromAdvanceFilterDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifyChargerWithSelectedPropertyisShowing () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
       Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyPropertyTagisShowingonChargerPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyClaerAllTagisShowingonLocationPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());*/
        Assert.assertTrue(searchproperty.verifyClearAllTagisShowingonPropertyPage());
    }

   /* @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyConnectionStatusisShowingonChargerPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyConnectionStatusISShowingonChargerTable());
    }

*/

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckWhatWhenAdminClicksonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyPageHasResetToDefaultAfterClickingonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_verifyLocationNameisShowinginDropdownAfterTypingValidLocationName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.verifyLocationisShowingInTheDropDown());
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongLocationFromAdvanceFilterDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_VerifyLocationWithSelectedLocationsareShowingOnChargerPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());

    }


    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_VerifyLocationTagisShowingonChargerPageAfterSelectinglocationFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckWhatHappensWhenAdmnSearchChargerBySelectingMutipleTags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }


    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_VerifySelectedTagsAreShowingonChargerPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());*/
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckWhatHappensWhenAdminremoesOneTagafterSelectingMultipletags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickOnCross());
        Assert.assertTrue(searchChargers.verifyTagHasbeenremovedAfterClickingonCrossButton());
    }


    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckWhatHappensWhenAdminremoesOneTagafterSelectingMultipletags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickOnCross());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerIsNotShowingonChargerPgeAfterRemovingFromAdvanceFilterDrawer());
    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_54_CheckPreviouslySelectedInputFieldsAreShowingAfterOpeningAdvanceFilterDrawerAgain () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.verifySelectedFiltersAreShowingonAdvanceFilterDrawer());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_checkWhathappensWhenAdmincliksOnresetAllButtonAfterSelectingMltipleFiltersFromAdvanceFilerDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        /*Assert.assertTrue(searchChargers.VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());*/
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckWhathappensWhenAdmincliksOnresetAllButtonAfterSelectingMltipleFiltersFromAdvanceFilerDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
        /*Assert.assertTrue(searchChargers.VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());*/
    }


    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void TC_58_VerifyChargerTableHasResetToDefaultAfertclickingonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_VerifyUserHasRedirectedToTheChargerPageAfterClickingOnChargerCountFromLocatonTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle3")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.clickOnChargerCount());
        Assert.assertTrue(searchChargers.verifyAdminHasRedirectedToTheChargersPage());


    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_VerifyAllTheChargersAreShowingOnTheChargerPageAfterClickingOnChargerCountFromLocatonTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle3")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.clickOnChargerCount());*/
        Assert.assertTrue(searchChargers.verifyAllChargersAreShowingAfterClickingonChargerCountFromLocationpage());


    }

   /* @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_VerifyConnectionStatusIsShowingOnTheChargerPageAfterClickingOnChargerCountFromLocatonTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       *//* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle3")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.clickOnChargerCount());*//*
        Assert.assertTrue(searchChargers.verifyConnectionStatusISShowingonChargerTable());


    }*/







}
