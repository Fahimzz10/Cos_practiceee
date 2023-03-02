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
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_VerifyCountAftersearchingCharger () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerPageCount());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhatHappensWhenAdminSearchTheChargerByChargerTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhenAdminSearchTheChargerByLocationTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Locationwithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedLocationTitleisShowing());
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWhatHappensWhenAdminRefreshthePageAfterSearchingTheCharger () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchChargers.verifySearchInputRemainsSameAfterRefreshingTeBrowser());
    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_verifyPropertyNameisShowinginPropertyDropdownAfterTypingValidPropertyName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.verifyPropertyisShowingInTheDropDown());
    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_VerifyAdvanceFilterDrawerHasClosedAfterSelectingPropertyFromAdvanceFilterDrawer () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyChargerWithSelectedPropertyIsShowing () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyPropertyTagisShowingOnChargerPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyClearAllTagIsShowingOnLocationPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchProperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchProperty.verifyClearAllTagisShowingonPropertyPage());
    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckWhatWhenAdminClicksOnResetAllButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_VerifyPageHasResetToDefaultAfterClickingOnResetAllButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        SearchCompany searchCompany = new SearchCompany(driver);
        SearchChargers searchChargers = new SearchChargers(driver);
        SearchLocation searchLocation = new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_verifyLocationNameIsShowingInDropdownAfterTypingValidLocationName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.verifyLocationisShowingInTheDropDown());
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongLocationFromAdvanceFilterDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyLocationWithSelectedLocationsareShowingOnChargerPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        SearchCompany searchCompany = new SearchCompany(driver);
        SearchChargers searchChargers = new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyLocationTagIsShowingOnChargerPageAfterSelectingLocationFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckWhatHappensWhenAdminSearchChargerBySelectingMultipleTags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifySelectedTagsAreShowingonChargerPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckWhatHappensWhenAdminRemovesOneTagAfterSelectingMultipleTags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenAdminRemovesOneTagAfterSelectingMultipleTags () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckWhatHappensWhenAdminClicksOnResetAllButtonAfterSelectingMultipleFiltersFromAdvanceFilerDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_VerifyChargerTableHasResetToDefaultAfertClickingOnResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
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




}
