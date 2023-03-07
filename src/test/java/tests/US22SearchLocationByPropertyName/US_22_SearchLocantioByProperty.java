package tests.US22SearchLocationByPropertyName;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class US_22_SearchLocantioByProperty extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;

   @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void TC_64_verifyPropertyNameisShowinginPropertyDropdownAfterTypingValidPropertyName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.verifyPropertyisShowingInTheDropDown());

    }


    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-65"})
    public void TC_65_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongPropertyFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());

    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-66"})
    public void TC_66_VerifyLocationsWithSelectedPropertyisShowing() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());*/
        searchLocation.verifyLocatonsWithSelectedPropertyTagHasDisplayed();

    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-67"})
    public void TC_67_VerifyPropertyTagisShowingonLocationPageAfterSelectingPropertyFromAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());

    }

    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_VerifyClaerAllTagisShowingonLocationPageAfterSelectingPropertyFromAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());*/
        Assert.assertTrue(searchandfilter.verifyClearAllTagisShowingonPropertyPage());

    }

    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_CheckWhathappensWhenAdminClicksOutsideTheDrawerAfterSelectingProperty() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        //Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.verifySelectedPropertyTagisShowingAterClosingtheDrawer());

    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_CheckWhatappenWenAdminRemovesOnePropertyAfterSelectingMultipleProperties() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removePropertyFromAdvanceFilterDrawer());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        searchLocation.verifyLocatonsWithSelectedPropertyTagHasDisplayed();

    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_CheckWhatappenWenAdminRemovesAllPropertyTagsAfterSelectingMultipleProperties() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removePropertyFromAdvanceFilterDrawer());
        Assert.assertTrue(searchLocation.removeAnotherPropertyFromAdvanceFilterDrawer());
        Assert.assertTrue(searchCompany.ClickonApplyButton());

    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_CheckCountAfterApplyingPropertyFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterSelectingPropertyFromAdvanceFilterDrawer());

    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_CheckLocationCountAfterAfterSelectingMultiplePropertiesFilterFromAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterSelectingPropertyFromAdvanceFilterDrawer());

    }

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-74"})
    public void TC_74_CheckLocationCountAfterAfterResetingThePropertiesfilterFromAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterSelectingPropertyFromAdvanceFilterDrawer());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
//        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterRemovingPropertyFilterFromAdvanceFilterDrawer());

    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-77"})
    public void TC_77_VerifyCountonLocationPageWhenAdminRemovesOneFilterAfterSelectingMultipleTagsFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.RefreshBrowser());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removePropertyFromAdvanceFilterDrawer());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterRemovingProperty());

    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-78"})
    public void TC_78_CheckWhatWhenAdminClicksonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
         Assert.assertTrue(dashboard.GotoDashboard());
         Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchLocation.VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton());
    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-80"})
    public void TC_80_CheckWhatWhenAdminClicksonClearAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyLocationPageHasResettoDefaultalue());
    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-81"})
    public void TC_81_VerifyCountonLocationPageAfterClickingonClearAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());
    }

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-83"})
    public void TC_83_CheckWhathappensWhenadminRefreshthePageAfterApplyingMultiplePropertyFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchLocation.verifyLocatonsWithSelectedPropertyTagHasDisplayed());

    }

    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-84"})
    public void TC_84_VerifyFiltertagsareShowingAfterRefreshingthePage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        /*Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchCompany.ClickonApplyButton());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchLocation.verifyPropertyTagsareShowingonLocationPage());
    }






}
