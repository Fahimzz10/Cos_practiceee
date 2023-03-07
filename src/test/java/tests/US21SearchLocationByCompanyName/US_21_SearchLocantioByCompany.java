package tests.US21SearchLocationByCompanyName;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class US_21_SearchLocantioByCompany extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_VerifycompanynamesareShowinginDropdownMenuonadvancefileter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
       Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
       Assert.assertTrue(searchLocation.verifyDropdownItemsDisplayed());


    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifycompanynameIsShowinginsuggestionwhenadminentercompnaynameonadvancefileter() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
    //    Assert.assertTrue(searchLocation.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(searchLocation.verifCompnayNameisShowingonAdvnaceFilter());


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyAdvanceFilterDrawerHasClosedAfterSelectingCompnayName() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation. selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_VerifySelectedCompanyTagisShowingonLocationPage() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCompanyTagisShowingonLocationPage());

    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_VerifyClearAllTagisShowingonLocationPage() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyClearAllTagisShowingonPropertyPage());

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_CheckWhatappenWenAdminRemovesOneCompanyAfterSelectingMultipleCompanies () throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickOnCloseImage());
        Assert.assertTrue(searchCompany.ClickonApplyButton());


    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckWhatappenWenAdminRemovesAllTagsAfterSelectingMultipleCompaniesFrmAdvanceFilterDrawer () throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickOnCloseImage());
        Assert.assertTrue(searchLocation.removeAnotherCompany());
        Assert.assertTrue(searchCompany.ClickonApplyButton());

    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_CheckCountonLocationPageAfterApplyingCompanyFilterFromAdvanceFilter () throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyElementCount());

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_CheckCountonLocationPageAfterApplyingmultipleCompanyFilterFromAdvanceFilter () throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountAfterAppyingCompanyFilter());


    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_VerifyCountonLocationPageWhenAdminClicksonResetAllButtonAfterSelectingMultipleTagsFromAdvanceFilter () throws InterruptedException {
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
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountAfterAppyingCompanyFilter());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());
    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_VerifyCountonLocationPageWhenAdminRemovesOneFilterAfterSelectingMultipleTagsFromAdvanceFilter () throws InterruptedException, IOException {
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
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
//        Assert.assertTrue(searchLocation.verifyCountonLocationPageAfterApplyingMultipleFilters());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickOnCloseImage());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
      //  Assert.assertTrue(searchLocation.verifyCountonLocationPageAfterRemovingOneTag());

    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckWhatWhenAdminClicksonResetAllButton () throws InterruptedException, IOException {
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
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchLocation.VerifySelectedTagHasbeenremoved());
    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void TC_58_CheckWhatWhenAdminClicksonClearAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyLocationPageHasResettoDefaultalueAfterClickingonClearAllTag());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-59"})
    public void TC_59_VerifyCountonLocationPageAfterClickingonClearAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
      //  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());
    }




    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_VerifyLoadMorebuttonisShowingonLocationPageAfterClickingonClearAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchLocation.selectAnotherCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyLodMoreButtonisShowing());
    }








}
