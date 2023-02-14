package tests.US23SearhLocationByZipCode;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class US_23_SearchLocantioByZip extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;


    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_85_VerifyZipCodesareShowinginDropdownMenuonadvancefileter () throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
        Assert.assertTrue(searchLocation.verifyAllTheDropdownItemsareShowing());

    }

    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-86"})
    public void TC_86_CheckWhathappensWhenAdminSearchLocationByZipcode () throws Exception {
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
        Assert.assertTrue(searchLocation.clickononZipDropdown());
        Assert.assertTrue(searchLocation.writeZipCode());
       // Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.verifyZipCodeisShowinginSuggestion());

    }

    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_VerifyAdvanceFilterDrawerHascloseAfteSelectingZipcode () throws Exception {
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
        Assert.assertTrue(searchLocation.clickononZipDropdown());
       // Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());

    }

    @Test(priority = 60)//Done
    @TestParameters(testCaseId = {"TC-89"})
    public void TC_89_VerifyZipcodetagisShowingonLocationpageAfteSelectingZipcodefromAdvanceFilterDrawer () throws Exception {
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
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
      //  Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());*/
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());

    }

    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-90"})
    public void TC_90_CheckWhathappensWhenAdminClicksOutsideTheDrawerAfterSelectingZipcode() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchLocation.clickononZipDropdown());
    //    Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.verifyZipcodeTagisShowingAterClosingtheDrawer());

    }

    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhathappensWhenAdminRemovesOneZipcodeAfterSelectingMultipleZipsFromAdvanceFilterDrawer() throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
       // Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removeZipcodeFromAdvanceFilterDrawer());
        Assert.assertTrue(searchLocation.verifyZipTagHasbeenremoved());

    }

    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-92"})
    public void TC_92_CheckWhathappensWhenAdminRemovesAllZipcodeTagsAfterSelectingMultipleZipcodeFromAdvanceFilterDrawer() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchLocation.clickononZipDropdown());
      //  Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removeZipcodeFromAdvanceFilterDrawer());
        Assert.assertTrue(searchLocation.removeAnotherZipcodeFromAdvanceFilterDrawer());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());

    }

    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-93"})
    public void TC_93_CheckCountAfterApplyingtheOneZipCodeFromAdvanceFilter() throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
    //    Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyCountoAfterSelectingZipcodeFromAdvanceFilterDrawer());


    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-94"})
    public void TC_94_CheckCountAfterApplyingtheMultipleZipCodeFromAdvanceFilter() throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
      //  Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyElementCountonLocationpageAfterApllyingFilterFromAdvanceFilterDrawer(prop.getProperty("expectedCount")));
       // searchLocation.verifyLocatonsWithSelectedPropertyTagHasDisplayed();
      //  searchLocation.verifyElementCount("//table/tbody/tr", 51);


    }

    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-95"})
    public void TC_95_CheckLocationCountWhenAdminClicksonResetAllButtonAfterppplyingMultipleZipcodeFilter () throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
     //   Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());
    }


    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-98"})
    public void TC_98_CheckLocationCountWhenAdminRemovesOneZipcodeAfterSelectingMultipleZipsFromAdvanceFilterDrawer() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchLocation.clickononZipDropdown());
    //    Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.removeZipcodeFromAdvanceFilterDrawer());
        Assert.assertTrue(searchLocation.verifyZipTagHasbeenremoved());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());

    }


    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-99"})
    public void TC_99_CheckWhatHappensWhenadminclicksonResetAllbuttonAfterApplyingMultipleZipcodeFilters () throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
      //  Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
    //    Assert.assertTrue(searchLocation.verifyLocationPageHasresettoDefaultData());
        Assert.assertTrue(searchLocation.verifyZipcodeTagsareNotShowingonLocationPageAfterPressingResetButton());
    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-100"})
    public void TC_100_VerifyLocationPagehasResettoDeaultvalueWhenadminSelectMultipleZipcodeandClickonResetAllButton () throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
    //    Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());

    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_CheckWhatWhenAdminClicksonClearAllButton () throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
  //      Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());

    }

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-102"})
    public void TC_102_VerifyCountonLocationPageAfterClickingonClearAllButton () throws InterruptedException, IOException {
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
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
     //   Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchLocation.verifyCountonLocationPage());
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-104"})
    public void TC_103_CheckWhathappensWhenadminRefreshthePageAfterApplyingMultipleZipcodeFilter () throws InterruptedException, IOException {
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
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
   //     Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchLocation.verifyElementCountonLocationpageAfterApllyingFilterFromAdvanceFilterDrawer(prop.getProperty("expectedCount")));

    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-105"})
    public void TC_105_VerifyFiltertagsareShowingAfterRefreshingthePage () throws InterruptedException, IOException {
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
        Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchLocation.clickononZipDropdown());
    //    Assert.assertTrue(searchLocation.writeZipCode(prop.getProperty("Zipcode1")));
        Assert.assertTrue(searchCompany.SelectZipFromDropDown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchLocation.verifyTagsareShowing());
    }

    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-107"})
    public void TC_107_CheckWhatHappensWhenAdminSelectsDifferentFilter () throws InterruptedException, IOException {
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
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
      //  Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
//        Assert.assertTrue(searchLocation.selectCompnayNameonAdvanceFilter());
      //  Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchLocation.clickononPropertyDropdown());
        Assert.assertTrue(searchLocation.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
         Assert.assertTrue(searchLocation.clickononZipDropdown());
        Assert.assertTrue(searchLocation.writeZipCode());
        Assert.assertTrue(searchLocation.selectAnotherZipcodeFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyTagsareShowingonLocationPage());
    }




}
