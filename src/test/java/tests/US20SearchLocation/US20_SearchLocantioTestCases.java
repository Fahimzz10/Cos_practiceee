package tests.US20SearchLocation;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class US20_SearchLocantioTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonLocationSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifPagehasRefreshafterpressingsearchbutton());
    }


    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyBrowserhasRereshafterProvidingSpaceinSearchBar() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(searchLocation.enterSpaceinSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminSearchtheLocationUsingInvalidData() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("Invaliddata")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifLocationIsNotShowingafterProvidingInvalidData());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_WhenAdminSearchtheLocationByPropertyName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
      //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationwithPropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifyLocationWithProvidedPropertyNameisShowing());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyLocationCountAfterSearchingtheLocationByPropertyName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationwithPropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(searchLocation.verifyPropertyNameCount());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminSearchtheLocationByLocationTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifyLocationsWithProvidedTitleisShowing());

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyLocationCountAfterSearchingtheLocationByPropertyName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationwithPropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifyLocationTitleCount());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyCrossButtonHasDisplayedAfterTypingtheName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
         Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationwithPropertyName")));*/
        Assert.assertTrue(searchandfilter.verifCrossButtonHasDisplyed());

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyProvidedNameHasRemovedAfterClickingonCrossButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(searchandfilter.verifCrossButtonHasDisplyed());
        Assert.assertTrue(searchandfilter.clickOnCross());
        Assert.assertTrue(searchandfilter.verifyProvidedtNameisNotShowingAfterClickingonCross());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyPageHasrefreshClickingonCrossButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(searchandfilter.verifCrossButtonHasDisplyed());
        Assert.assertTrue(searchandfilter.clickOnCross());
        Assert.assertTrue(searchandfilter.verifPagehasRefreshafterpressingsearchbutton());

    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckwhathappenswhenadminclicksonthecrossoptionaftersearchinganyLocation() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
         Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickOnCross());*/
        Assert.assertTrue(searchandfilter.verifyProvidedtNameisNotShowingAfterClickingonCross());

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminOpenLocationPageInIncognitoMode () throws InterruptedException, IOException {
        SearchLocation searchLocation=new SearchLocation(driver);
        Assert.assertTrue(searchLocation.openLocationPageinIncognitoMode());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckwhathappenswhenadminOpenLocationPageInNewTabAfterSearchingLocation() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.openLocationPageinNewTab());

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminPressEnterAfterSearchingtheLocation() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(searchLocation.pressEnterButton());
        Assert.assertTrue(searchLocation.verifyLocationsWithProvidedTitleisShowing());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_ChecktheCountAfterSearchingtheLocation() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationwithPropertyName")));
        Assert.assertTrue(searchLocation.pressEnterButton());*/
        Assert.assertTrue(searchLocation.verifyLocationTitleCount());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_Checktheeditdraweroflocationaftersearchingwithpropertyname () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(searchLocation.verifyLocationsDetailsareShowingonEditLocationDrawer());


    }

   @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckTheDataofAllColumnsAfterSearchingLocation () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifyLocationsWithProvidedTitleisShowing());
        Assert.assertTrue(searchLocation.verifyPropertyNameisShowing());


    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckSearchResultWhenMorethanTenLocationsMatchesSearchResult () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.verifyLocationsWithProvidedTitleisShowing());

    }


   /* @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckWhatHappenWhenAdminClickonLoadMoreButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.clickLoadMoreButton());
        Assert.assertTrue(searchLocation.verifyMoreLocationsareShowingAfterClickingLoadMoreButton());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_verifyContonTopofThePageAfterPressingLoadMoreButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.clickLoadMoreButton());
        Assert.assertTrue(searchLocation.verifyCountAfterPressingLoadMoreButton());

    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_verifyLoctinsWhichApperAfterPressingLoadMoreButtonMatchesWithSearchInput () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchLocation.clickLoadMoreButton());
        Assert.assertTrue(searchLocation.verifyAlltheLocationsonTheTableShouldbeSameWithTheSearchedInputAfterClickingLoadMoreButton());

    }*/

   @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckWhathappensWhenAdminrefreshThePageAfterSearchingTheLocation () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
      //  Assert.assertTrue(searchLocation.verifySearchInputRemainsSameAfterRefreshingtheBrowser());

    }

   /* @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckWhathappensWhenAdminClicksonLoadMoreButtonArefreshThePage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchLocation.clickLoadMoreButton());
        Assert.assertTrue(searchLocation.verifyAlltheLocationsonTheTableShouldbeSameWithTheSearchedInputAfterClickingLoadMoreButton());

    }
*/

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_VerifyAdvanceFilterDrawerhasDisplayedAfteclickingonAdvanceFilterButton() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchLocation.verifyAdvanceFilterDrawerhasOpened());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_VerifyAdvanceFilterDrawerhasDisplayedAfteclickingonAdvanceFilterButton() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchLocation.verifyAllFiltersareShowingOnTheAdvanceFilterDrawer());

    }

  }
