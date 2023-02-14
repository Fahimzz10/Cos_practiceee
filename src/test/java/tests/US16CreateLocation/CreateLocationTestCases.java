package tests.US16CreateLocation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class CreateLocationTestCases extends BaseTest {


    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewLocationButtonIsShowingtoAdminonLocationManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.verifyCreateNewLocationButtonHasDisplayed());

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewLocationDraweHasDisplayedAfterClickingonCreateNewLocationButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.verifyCreateNewLocationButtonHasDisplayed());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifySelectCompanyandSelectPropertyFieldsareShowinginPropertyInfoeSectionofCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifySelectCompanyFieldisShowing());
        Assert.assertTrue(createLocation.verifySelectPropertyFieldisShowing());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyCreateNewPropertyOptionIsShowinginLocationInfoeSectionofCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyCreateNewPropertyOptionsisShowing());

   }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyLocationTitleandLocationLandmarkFieldsareShowingOnCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLocationTitleFieldisShowing());
        Assert.assertTrue(createLocation.verifyLocationlandmarkFieldisShowing());



    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyMessageisShowingUnderLocationTitilOnCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLocationTitleMessage(msg.LocationTitleMsg()));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyMessageisSowingUnderLocationLandmarkOnCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLocationLandmarkMessage(msg.LocationlandmarkMsg()));

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyLocationMapisShowingOnCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLocationMapisShowing());
        Assert.assertTrue(createLocation.verifyLocationCoordinateMessage(msg.LocationCoordinateMsg()));
        Assert.assertTrue(createLocation.verifyLatitudeFieldisShowing());
        Assert.assertTrue(createLocation.verifyLongitudeFieldisShowing());
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());

    }

   /* @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyMessageisShowingUnderLocationCoordinateSectionOnCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       *//* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*//*
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLocationCoordinateMessage(msg.LocationCoordinateMsg()));

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyLatitudeandLongitudeFieldsareShowinginLocationCoordinateSectionOfCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyLatitudeFieldisShowing());
        Assert.assertTrue(createLocation.verifyLongitudeFieldisShowing());

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyConfirmLocationButtonisShowinginLocationCoordinateSectionOfCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        //  Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());


    }
*/
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyAssignedandUnassignedChargersareShowinginAssignChargersSectiofOfCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyUnassignedChargerSectionisShowing());
        Assert.assertTrue(createLocation.verifyAssignedChargerSectionisShowing());


    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_VerifySaveLocationandCancelButonsareShowingonCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company=new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(company.VerifyCancelButtonsisShowing());
        Assert.assertTrue(createLocation.verifyCreateLocationButtonisShowing());


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_VerifySelectPropertyFieldIsDisabledWhenadminHasnoSelectedCompanyonCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company=new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifySelectPropertyFieldIsDisabled());


    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_VerifySelectPropertyFieldisEnabledAfterSelectingCompnayfromCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company=new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.verifySelectPropertyFieldisEnabledAfterSelectingCompany());


    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_VerifyPropertiesareShowinginSelectPropertyDropdowndAfterSelectingCompnayfromCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company=new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.verifyPropertiesOptionIsShowing());

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_VerifyCreateNewPropertyOptionIsShowingUnderPropertyFieldofCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.verifyCreateNewPropertyOptionsisShowing());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_VerifyPopuphasDisplyedAfterClickingonCreateNewPropertyOptionFromCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.clickonCreateNewPropertyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());


    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_VerifyLeaveandContinueButtonsareShowingonthePopuWhichHasDisplyedAfterClickingonCreateNewPropertyOptionFromCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.clickonCreateNewPropertyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.verifyLeveButtonisShowingonPopup());


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_VerifyAdminStaysonCreateNewLocationDrawerAfterClickingonContinueFromCreatePropertyPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.clickonCreateNewPropertyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasDisplayed());


    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_VerifyAdminhasRedirectedToCreateNewPropertyDrawerAfterClickingonLeaveFromCreatePropertyPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.clickonCreateNewPropertyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonLeaveButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyyDrawerDisplayed());

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckWatHappensAfterClickingonCreateNewPropertyLink() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(createLocation.clickonCreateNewPropertyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonLeaveButton());
     //   Assert.assertTrue(properties.verifyCreateNewPropertyyDrawerDisplayed());
      //  Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("NewPropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
       /* Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonSavePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));


   }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyNewlyCreatedPropertyisShowinginDropdownonMenuofPropertyonCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("NewPropertyName")));
        Assert.assertTrue(createLocation.verifyPropertyNameIsShowingonIntheSelectPropertyDropdown());

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyPropertyAddressHasAddedAutomaticallyAfterSelectingPropertyFromCreateNewLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("NewPropertyName")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.verifyPropertyAddressFieldisShowing());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_WhenAdminEnterSpaceinLocationtitleFieldofCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterSpaceinLocationTitle());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyBlankLocationTitleErrorMessage(msg.BlankLocationTitleErrorMsg()));


    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminLeavesLocationtitleFieldBlankonCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(""));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyBlankLocationTitleErrorMessage(msg.BlankLocationTitleErrorMsg()));


    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterSpaceinLocationLandmarkFieldofCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterSpaceinLocationLandmark());
        Assert.assertTrue(createLocation.clickSaveLocationButton());


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminLeavesLocationLandmarkFieldBlankonCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
      /*  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(""));
        Assert.assertTrue(createLocation.clickSaveLocationButton());


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckwhathappenswhenadmindoesnotconfirmthelocationandclicksonsavelocationButtonfromCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(""));
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyAlertIsShowingWhenAdminDoesNotConfirmtheLocation());



    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckWhatHappensWhenAdminEntersInvalidLongitudeandLatitudeonCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
      /*  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.enterLocationLongitude(prop.getProperty("InvalidLongitude")));
        Assert.assertTrue(createLocation.enterLocationLatitude(prop.getProperty("InvalidLatitude")));
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.verifyErrorMessageisShowingAfterEnteringInvalidLongitudeandLatitude());



    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckWhatHappensWhenAdminEntersValidLongitudeandLatitudeonCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.RemoveLongitude());
        Assert.assertTrue(createLocation.enterLocationLongitude(prop.getProperty("ValidLongitude")));
        Assert.assertTrue(createLocation.RemoveLatitude());
        Assert.assertTrue(createLocation.enterLocationLatitude(prop.getProperty("ValidLatitude")));
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisNotShowing());

    }

   /* @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckWhatHappensWhenAdminEntersValidDatanCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle2")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.SelectChargers());
        Assert.assertTrue(createLocation.clickonRightSwapArrow());
        Assert.assertTrue(createLocation.verifyUnassignedChargersHaveMovedtoAssignedChargerSection());


    }

*/
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenAdminPressSaveLocationButtonAfterEntersValidDatanCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckWhatHappensWhenAdminPressCancelButtonAfterEntersValidDatanCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
         Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle1")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());

    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_VerifyPropertyFieldisEnabledandUnknownPropertyisShowinginDropdownAfterSelectingUnknwoncompanyFromdropdownmenuonCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
      /*  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(properties.clickonUnknownCompanyName());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.verifySelectPropertyFieldisEnabledAfterSelectingCompany());
        Assert.assertTrue(createLocation.verifyUnknownPropertyisShowingAferSelectingUnknownCompany());

    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_WhenAdminSelectsUnknownPropertyFromSelectCompanyDropdownonCreateLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(properties.clickonUnknownCompanyName());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        //   Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Unknown Property")));
        Assert.assertTrue(createLocation.clickOnUnknownPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("UnknownLocation")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());
        Assert.assertTrue(createLocation.clickonLocationSearchbar());
        Assert.assertTrue(createLocation.WriteLcationName(prop.getProperty("UnknownLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createLocation.verifyUnknownPropertyisShowingUnderPropertyColumnonLocationsPage());

    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_CheckLocationTableisShowingAlltheRqeuiredInformationTableUndertheColumnsforEachLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
         EditCompany editCompany=new EditCompany(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(properties.clickonUnknownCompanyName());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
     //   Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Unknown Property")));
        Assert.assertTrue(createLocation.clickOnUnknownPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("UnknownLocation")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyCreateNewLocationDrawerHasClosed());*/
        Assert.assertTrue(createLocation.clickonLocationSearchbar());
        Assert.assertTrue(createLocation.WriteLcationName(prop.getProperty("UnknownLocation")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createLocation.verifyLocationTitleColumnisShowingonLocationsTable());
        Assert.assertTrue(createLocation.verifyUnknownPropertyisShowingUnderPropertyColumnonLocationsPage());
        Assert.assertTrue(createLocation.verifyChargersColumnisShowingonLocationsTable());
        Assert.assertTrue(createLocation.verifyactionsColumnisShowingonLocationsTable());

    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_VerifyChargerCountisZeroWhenAdminHasNotAssignedAnyChargertToTheLocationfromCreateNewlocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());*/
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.clickonLocationSearchbar());
        Assert.assertTrue(createLocation.WriteLcationName(prop.getProperty("LocationTitle")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createLocation.verifyChrgerCountonisZero());

    }

     /* @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_ChecktheChargerColumnWhenAdminAssignTwoChargersFromCreateNewLocationDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        *//*Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle2")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.SelectChargers());
        Assert.assertTrue(createLocation.clickonRightSwapArrow());
        Assert.assertTrue(createLocation.clickSaveLocationButton());*//*
        Assert.assertTrue(createLocation.clickonLocationSearchbar());
        Assert.assertTrue(createLocation.WriteLcationName(prop.getProperty("LocationTitle2")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createLocation.verifytheChrgerCountonLocationtableAfterAssigningUnassignedChargers());
        Assert.assertTrue(createLocation.ClickonEditbutton());
        Assert.assertTrue(createLocation.SelectChargers());
        Assert.assertTrue(createLocation.clickonLeftSwapArrow());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.clickonPropertyDropdown());
        Assert.assertTrue(createLocation.writePropertyName(prop.getProperty("Propertywithchargers")));
        Assert.assertTrue(createLocation.clickOnPropertyName());
        Assert.assertTrue(createLocation.enterLocationTitle(prop.getProperty("LocationTitle2")));
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.SelectChargers());
        Assert.assertTrue(createLocation.clickonRightSwapArrow());
        Assert.assertTrue(createLocation.clickSaveLocationButton());

    }*/







}
