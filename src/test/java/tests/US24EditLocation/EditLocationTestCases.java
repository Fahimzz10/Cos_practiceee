package tests.US24EditLocation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;
import java.util.Properties;


public class EditLocationTestCases extends BaseTest {

        Properties prop = ConfigUtill.getConfig();
        Messages msg = new Messages();


        @Test(priority = 1)//Done
        @TestParameters(testCaseId = {"TC-1"})
        public void TC_1_VerifyEditLocationButtonIsShowingontheLocationsPage() throws InterruptedException {
            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            Dashboard dashboard=new Dashboard(driver);
            CreateCompany company = new CreateCompany(driver);
            EditLocation editLocation=new EditLocation(driver);
            loginPage.VerifyValidLogin();
            Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
            Assert.assertTrue(dashboard.clickonLocations());
            Assert.assertTrue(editLocation.verifyEditDetailsButtonHasDisplayed());
        }

        @Test(priority = 2)//Done
        @TestParameters(testCaseId = {"TC-2"})
        public void TC_2_VerifyEditLocationDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            Dashboard dashboard=new Dashboard(driver);
            CreateCompany company = new CreateCompany(driver);
            EditCompany editCompany= new EditCompany(driver);
            EditEntity editEntity= new EditEntity(driver);
            EditLocation editLocation=new EditLocation(driver);
            SearchLocation searchLocation=new SearchLocation(driver);
            loginPage.VerifyValidLogin();
            Assert.assertTrue(dashboard.RefreshBrowser());
            /*Assert.assertTrue(dashboard.GotoDashboard());
            Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
            Assert.assertTrue(dashboard.clickonLocations());*/
            Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
            Assert.assertTrue(editCompany.ClickonSearchButton());
            Assert.assertTrue(editLocation.clickonDetailsButton());
            Assert.assertTrue(editLocation.verifyLocationInformationareShowing());
        }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyAlltherequiredFieldsHaspopulatedAfterClickingonEditButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        /*Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        //Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(createLocation.verifySelectCompanyFieldisShowing());
        Assert.assertTrue(createLocation.verifySelectPropertyFieldisShowing());
        Assert.assertTrue(createLocation.verifyLocationTitleFieldisShowing());
        Assert.assertTrue(createLocation.verifyLatitudeFieldisShowing());
        Assert.assertTrue(createLocation.verifyLongitudeFieldisShowing());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyAlltheOptionaldFieldHaspopulatedAfterClickingonEditButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        //Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        //Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(createLocation.verifyLocationlandmarkFieldisShowing());
        Assert.assertTrue(createLocation.verifyUnassignedChargerSectionisShowing());
        Assert.assertTrue(createLocation.verifyAssignedChargerSectionisShowing());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyToggleButtonIsOnByDefaultonEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.verifyToggleButtonisOn());

    }

   @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifylocationStatusisActiveonEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.verifyStatusisActive());


    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyDeactivateLocationButtonisShowingonEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.verifDeactivateLocationButtonIsShowing());


    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyErrorMessageIsShowingAfterRemovingLocationTitileFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
         /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyBlankLocationTitleErrorMessage(msg.BlankLocationTitleErrorMsg()));


    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-12,13"})
    public void TC_12_13_VerifyErrorMessageIsShowingAfterProvidingInvalidLongitudeandLatitudeFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(createLocation.RemoveLongitude());
        Assert.assertTrue(createLocation.enterLocationLongitude(prop.getProperty("Alphabates")));
        Assert.assertTrue(createLocation.RemoveLatitude());
        Assert.assertTrue(createLocation.enterLocationLatitude(prop.getProperty("Alphabates")));
        //Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.verifyErrorMessageisShowingAfterEnteringInvalidLongitudeandLatitude());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_VerifyUpdatedLocationisShowingontheLocationTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
         Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(createLocation.clickSaveLocationButton());
       // Assert.assertTrue(createLocation.verifyBlankLocationTitleErrorMessage(msg.BlankLocationTitleErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckWhathappensWhenAdminChangetheLocationTitileFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation= new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(editLocation.removeLocationFromSearchBar());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.verifyUpdatedLocationNameIsShowing());
    }


   /* @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhathappensWhenAdminChangetheAssignchargersFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        CreateProperty properties = new CreateProperty(driver);
        SearchLocation searchLocation= new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.clickonEditbuttonFromPropertyInfoSection());
        Assert.assertTrue(editLocation.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.SelectChargers());
        Assert.assertTrue(createLocation.clickonRightSwapArrow());
        Assert.assertTrue(createLocation.verifyUnassignedChargersHaveMovedtoAssignedChargerSection());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
    }*/


    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_VerifyErrorMessageIsNotShowingAfterProvidingValidLongitudeandLatitudeFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(createLocation.RemoveLongitude());
        Assert.assertTrue(createLocation.enterLocationLongitude(prop.getProperty("ValidLongitude")));
        Assert.assertTrue(createLocation.RemoveLatitude());
        Assert.assertTrue(createLocation.enterLocationLatitude(prop.getProperty("ValidLatitude")));
        Assert.assertTrue(editLocation.verifyErrorMessageIsNotShowingAfterEnteringInvalidLongitudeandLatitude());

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckWhatHappensWhenAdminClicksConfirmLocatinbuttonAfterProvidingValidLongitudeandLatitudeFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        EditLocation editLocation= new EditLocation(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(createLocation.RemoveLongitude());
        Assert.assertTrue(createLocation.enterLocationLongitude(prop.getProperty("ValidLongitude")));
        Assert.assertTrue(createLocation.RemoveLatitude());
        Assert.assertTrue(createLocation.enterLocationLatitude(prop.getProperty("ValidLatitude")));
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisNotShowing());

    }

   /* @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckWhathappensWhenAdminChangetheAssignchargersFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        CreateProperty properties = new CreateProperty(driver);
        SearchLocation searchLocation= new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.clickonEditbuttonFromPropertyInfoSection());
        Assert.assertTrue(editLocation.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(editLocation.verifyChargersareShowinginUnassignedChrgerSection());
    }*/

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_Checkwhathappenstotheassignedchargersectionwhenadminchangethepropertyoflocation  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        CreateProperty properties = new CreateProperty(driver);
        SearchLocation searchLocation= new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("Locationwithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.clickonEditbuttonFromPropertyInfoSection());
        Assert.assertTrue(editLocation.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(editLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(editLocation.verifyAssignedChargerSectionIsShowingEmpty());


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckWhatHappensWhenAdminEntersValidDataOnEditLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.clickonEditbuttonFromPropertyInfoSection());
        Assert.assertTrue(editLocation.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(editLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(editLocation.verifyEditLocationDrawerHasClosed());

    }


    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckWhatHappensWhenAdminClicksonCancelButtonAfterEnteringValidDataOnEditLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editLocation.verifyALertisShowingAfterPressingCancelButton());

    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_VerifyContinueandDiscardButtonsAreShowingAfterPressingCancelButtonFromOnEditLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editLocation.verifyContinueandDiscardButtonsareShowinOnConfirmationPopup());

    }


    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckWhatappensWhenAdminClicksonDiscardButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(editLocation.verifyEditLocationDrawerHasClosed());

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckWhatappensWhenAdminClicksonContinueButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(editLocation.verifyConfirmationPopupHasClosed());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_VerifyEditLocationDraawerIsShowingAfterPressingContinueButtonFromConfirmationPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
//        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(editLocation.verifyLocationInformationareShowing());

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_ChekAuditLogSectionAfterupdatingInformation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("UpdatedLocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonDetailsButton());
        Assert.assertTrue(editProperty.verifyUpdatedInformationisShowinginAuditlog());

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminChangetheStatusofLocatiFromOntoOfflineonEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation  searchLocation = new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editLocation.clickonToggleButton());
        Assert.assertTrue(editLocation.verifyToggleButtonHasDisabled());
        Assert.assertTrue(createLocation.clickSaveLocationButton());

    }


    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyLocationStatusisShowingOfflineAfterMaingItOfflineFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation  searchLocation = new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editLocation.verifyToggleButtonHasDisabled());

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_ChecktheLocationStatusAftermakingitOnlineAgainonEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation  searchLocation = new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editLocation.clickonToggleButton());
        Assert.assertTrue(editLocation.verifyToggleButtonisOn());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
       /* Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.verifyToggleButtonHasDisabled());*/

    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyLocationStatusisShowingOnAfterMakingItOnFromEditLocationDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation  searchLocation = new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editLocation.verifyToggleButtonisOn());
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_ChekAuditLogSectionAfterupdatingInformation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());*/
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editProperty.verifyUpdatedInformationisShowinginAuditlog());

    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_ChekAuditLogSectionAfterupdatingInformation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditLocation editLocation=new EditLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("ToggleLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
       /* Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editLocation.clickonEditbuttonFromPropertyInfoSection());
        Assert.assertTrue(editLocation.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(editLocation.removeLocationTitile());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editLocation.removeLocationLandmark());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickSaveLocationButton());*/
        Assert.assertTrue(editLocation.clickonEditbutton());
        Assert.assertTrue(editProperty.verifyUpdatedInformationisShowinginAuditlog());

    }





}
