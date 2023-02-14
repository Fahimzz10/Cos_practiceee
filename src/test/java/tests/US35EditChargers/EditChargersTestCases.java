package tests.US35EditChargers;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class EditChargersTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditChargerButtonIsShowingontheChargersPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
       /* Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());*/
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyEditChargerDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.verifyChargerDetailsDrawerHasDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyAlltheRequiredFieldsHaspopulatedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.verifyAllRequiredFieldsareShowing());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyActivityButtonIsOnByDefaultonEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.verifyToggleButtonisOn());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyChargerStatusisActiveonEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.verifyStatusisActive());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyChargerStatusisActiveonEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.verifDeactivateChargerButtonIsShowing());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckWhathappensWhenAdminMakeaChargerOffline () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.clickonToggleButton());
        Assert.assertTrue(editLocation.verifyToggleButtonHasDisabled());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
    }

   /* @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_ChecktheDetailsOfChargerOntheEditDrawerAfterMakingItOffline  () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
       *//* Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.clickonToggleButton());
        Assert.assertTrue(editChargers.clickSaveChargerButton());

    }*/

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhathappensWhenAdminMakeaChargerOffline () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
       /* Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.verifyToggleButtonHasDisabled());
        Assert.assertTrue(editLocation.clickonToggleButton());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckIfLocationFieldIsAutoselectedInLocationFieldOnEditChargerDrawer () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.verifyLocationFieldIsAutoSelected());

    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void C_18_VerifyLocationsareShowinginDropdownMenuonadvancefileter () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonLocationDropdown());
        Assert.assertTrue(searchLocation.verifyAllTheDropdownItemsareShowing());

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void C_19_VerifyLocationTitleonEditDrawerIsSameasLocationTitleOnChargerTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
     //   Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyLocationTitleonEditDrawerIsSameasLocationTitleOnChargerTable());

    }

    @Test(priority =13)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void C_21_VerifyAdminHasRedirectedToNewTabAfterClickingOnViewLocationFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickOnViewLocation());
        Assert.assertTrue(editChargers.verifyNewTabHasOpenedAfterClickingonViewLocationLink());

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void C_22_VerifyZoomedinVersionOfLocationAddressIsShowingOnMap() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickOnViewLocation());
        Assert.assertTrue(editChargers.verifyNewTabHasOpenedAfterClickingonViewLocationLink());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void C_23_VerifyLocationPointerIsPointedAtLocationAddressOnMap() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickOnViewLocation());
        Assert.assertTrue(editChargers.verifyNewTabHasOpenedAfterClickingonViewLocationLink());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void C_24_VerifyPropertyTitleonEditDrawerIsSameasPropertyTitleOnChargerTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
       // Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyPropertyTitleonEditDrawerIsSameasPropertyTitleOnChargerTable());

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyPropertyAddresonEditDrawerIsSameasPropertyAddresOnChargerTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
      //  Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyPropertyAddressonEditDrawerIsSameasPropertyAddressOnChargerTable());

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckWhatHappensWhenAdminClicksonDeactivateChargerFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonDeactivateCharerButton());
        Assert.assertTrue(editChargers.verifyPopupHasDisplayedAfterClickingonDeactivateChargerButton());
        Assert.assertTrue(editChargers.verifyTextonPopupOfDeactivateChargerButton());

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifyButtonsonDeactivateChargerFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonDeactivateCharerButton());
        Assert.assertTrue(editChargers.verifyCancelandRequestForDeactivationButtonsAreShowingonDeactivateChargerButton());


    }

    /*@Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_VerifyErrorMEssageIsShowingWhenAdminRemovesTheLocationNameFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.selectLocationFeildFromEditChargerDrawer());
        Assert.assertTrue(editProperty.clickonCrossButton());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyErrorMessageIsShowingAfterRemovingLocation());

    }
*/

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckWhatHappensWenAdminWritesInvalidLocationNameOnEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonLocationDropdown());
        Assert.assertTrue(editProperty.clickonCrossButton());
        Assert.assertTrue(editChargers.writeLocationName("abc Location"));
       // Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyNoDataisShowingAfterEntringInvalidLocationName());


    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckWhatHappensWenAdminChangeLocationwithvalidLocationNameOnEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonLocationDropdown());
       // Assert.assertTrue(editProperty.clickonCrossButton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonLocationName());
        // Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyLocationLandmarkHasChangedAfterEntringValidLocationName());


    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckWhatHappensWenAdminClicksonCreateNewLocationFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonCreateNewLocation());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyLeaveandContinueButtonsareShowingonthePopuWhichHasDisplyedAfterClickingonCreateNewLocationFromEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonCreateNewLocation());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.verifyLeveButtonisShowingonPopup());

    }


   /* @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyAdminhasRedirectedToCreateNewLocationDrawerAfterClickingonLeaveFromPOpup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//**//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//**//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonCreateNewLocation());
        Assert.assertTrue(properties.clickonLeaveButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasDisplayed());

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyNewlyCreatedLocationIsShowinginSelectLocationDropdownOfEditChargerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        EditLocation editLocation=new EditLocation(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.clickonCreateNewLocation());
        Assert.assertTrue(properties.clickonLeaveButton());
//        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasDisplayed());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationName")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark1")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());
      //  Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.verifyNewlyCreatedLocationIsShowingInCreateLocationDropdown());
*//*
    }*/

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_VerifyLocationLandmarkIsAccordingtoNewlyCreatedLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
       /* Assert.assertTrue(editChargers.clickonCreateNewLocation());
        Assert.assertTrue(properties.clickonLeaveButton());
//        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasDisplayed());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationName")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark1")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());
        //  Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());*/
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonLocationName());
        Assert.assertTrue(editChargers.verifyNewLocationLandmarkHasChangedAfterEntringValidLocationName());

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_WhenAdminClicksonSavebuttonAfterCreatingNewLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        EditCharger editChargers=new EditCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonLocationName());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyEditChargerDrawerHasClosed());

    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_VerifyLocationTitleHasUpdatedOnChargerPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        /*Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonLocationName());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyEditChargerDrawerHasClosed());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("LocationName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editChargers.verifyUpdatedLocationNameisShowingonChargerPage());


    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_ChekAuditLogSectionAfterupdatingInformation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        /*Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonLocationName());
        Assert.assertTrue(editChargers.clickSaveChargerButton());
        Assert.assertTrue(editChargers.verifyEditChargerDrawerHasClosed());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("LocationName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
//        Assert.assertTrue(editChargers.verifyUpdatedLocationNameisShowingonChargerPage());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyUpdatedInformationisShowinginAuditlog());


    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckWhatHappensWhenAdminClicksonCancelButtonAfterEnteringValidDataOnEditChargerPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonCancelButton());
    //    Assert.assertTrue(editLocation.verifyALertisShowingAfterPressingCancelButton());


    }

  /*  @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_VerifyContinueandDiscardButtonsAreShowingAfterPressingCancelButtonFromEditChargerPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonCancelButton());
        Assert.assertTrue(editLocation.verifyContinueandDiscardButtonsareShowinOnConfirmationPopup());


    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckWhatappensWhenAdminClicksonDiscardButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonCancelButton());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(editChargers.verifyEditChargerDrawerHasClosed());


    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_CheckWhatappensWhenAdminClicksonContinueButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonCancelButton());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(editLocation.verifyConfirmationPopupHasClosed());


    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_VerifyEditChargerDraawerIsShowingAfterPressingContinueButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditLocation editLocation=new EditLocation(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       *//*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargers.writeLocationName(prop.getProperty("LocationName")));
        Assert.assertTrue(editChargers.clickonCancelButton());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(editChargers.verifyChargerDetailsDrawerHasDisplayed());


    }
*/
}
