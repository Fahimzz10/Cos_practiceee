package tests.US14EditProperty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class EditPropertyCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditPropertyButtonIsShowingonthePropertyManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyEditEntityDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.VerifyPropertyDetailsDrawerHasDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyAllTheRequiredFieldsHasPopulatedonEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifySelectCompanyFieldisShowing());
        Assert.assertTrue(editProperty.verifySelectEntityFieldisShowing());
        Assert.assertTrue(editProperty.verifyProertyFieldisShowing());
        Assert.assertTrue(editProperty.verifyZipcodeFieldisShowing());
        Assert.assertTrue(editProperty.verifyAddressFieldisShowing());
        Assert.assertTrue(editProperty.verifyPropertyFeesFieldsAreShowing());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyAllTheOptionalFieldsHasPopulatedonEditPropertyDrawer() throws InterruptedException {
       CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyConnectwitHardwareProviderFieldIsShowingonEditPropertDrawer());
        Assert.assertTrue(editProperty.verifyConnectwitSiteFieldIsShowingonEditPropertDrawer());
        Assert.assertTrue(editProperty.verifyConnectwitOtherardwareProviderIsShowingonEditPropertDrawer());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminCheckMoreSettingsSectiononEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifCompanyStatusisActiveonMoreSettingsSection());

    }

  /*  @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyDecativatePropertyButtonisShowingOnMoreSettingsSectionsOfEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       *//* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyDeactivatePropertyButtIsShowingonMoreSettingsSection());

    }
*/

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_VerifyAuditLogsIsShowingOnEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifAuditLogsareShowingonEditComapnyDrawer());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_VerifyEditButtonisShowinginResponsibiltiesSectionOnEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyEditButtIsShowinginResponsiblePartiesSection());

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_VerifySelectCompanyandSelectEntityFieldsareDisabledWhenAdminHasnotClickedOnEditButtonFromResponsiblePartiesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifySelectCompanyFieldIsDisabled());
        Assert.assertTrue(createProperty.verifySelectEntityFieldIsDisabled());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_VerifySelectCompanyandSelectEntityFieldsareEnabledAfterClickingOnEditButtonFromResponsiblePartiesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromResponsibilePartiesSection());
        Assert.assertTrue(editProperty.verifySelectCompanyFieldisEnabled());
        Assert.assertTrue(createProperty.verifySelectEntityFieldisEnabledAfterSelectingCompany());


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_VerifyEditButtonIsNotSowingAfterClickingOnEditButtonFromResponsiblePartiesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromResponsibilePartiesSection());
        Assert.assertTrue(editProperty.verifyEditButtonisNotShowinginResponsiblePartiesSection());

   }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyEditButtonisShowinginHardwareProviderSectionOnEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyEditButtonisShowinginHardwareProviderSection());

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyHardwareProviderFieldsareDisabledWhenAdminHasnotClickedOnEditButtonFromResponsiblePartiesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyCOnnectwithHardwareProviderFieldisDisabled());
        Assert.assertTrue(editProperty.verifyCOnnectwithSiteFieldisDisabled());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyConnectWithHardwareProviderFieldisEnabledAfterClickingOnEditButtonFromHardwareProviderSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromHardwareProviderSection());
        Assert.assertTrue(editProperty.verifyConnectWithHarwareProviderFieldisEnabled());
        Assert.assertTrue(editProperty.verifyCOnnectwithSiteFieldisDisabled());
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_VerifyCOnnectwithSiteFieldisEnabledAfterSelectingHardwareProviderFromEditPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromHardwareProviderSection());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        Assert.assertTrue(editProperty.verifyConnectWithSiteFieldisEnabledAfterSelectingHardwareProvider());
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifyEditButtonisNotShowinginHardwareProviderSectionOnEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromHardwareProviderSection());
        Assert.assertTrue(editProperty.verifyEditButtonisNotShowinginHardwareProviderSection());

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyEditButtonisShowinginFeesSectionOfEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyEditButtonisShowinginFeesSection());

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_23_VerifyAllFieldsofFeesSectionareDisabledWhenAdminHasnotClickedOnEditButtonFromFeesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.verifyEquipmentFeeFieldisDisabled());
        Assert.assertTrue(editProperty.verifyChargerFeeFieldisDisabled());
        Assert.assertTrue(editProperty.verifyInstallationFeeFieldisDisabled());
        Assert.assertTrue(editProperty.verifyChargingSessionFeeFieldisDisabled());
        Assert.assertTrue(editProperty.verifyMinimumFeeFieldisDisabled());

    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_23_VerifyAllFieldsofFeesSectionareEnabledWhenAdminClickedOnEditButtonFromFeesSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromFeesSection());
        Assert.assertTrue(editProperty.verifyPropertyFeesFieldsAreEnabled());


    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyEditButtonisNotShowinginFeesSectionOfEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromFeesSection());
        Assert.assertTrue(editProperty.verifyEditButtonisNotShowinginFeesSection());

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyErrorMessageisShowingAfterRemovingCompanyandEntityNamesfromEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity=new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromResponsibilePartiesSection());
        Assert.assertTrue(editProperty.selectEntityFeildFromEditPropertyDrawer());
        Assert.assertTrue(editProperty.clickonEntityCrossButton());
        Assert.assertTrue(editProperty.selectCompanyFeildFromEditPropertyDrawer());
        Assert.assertTrue(editProperty.clickonCrossButton());
        Assert.assertTrue(editProperty.clickonSavePropertyButton());
        Assert.assertTrue(createEntity.verifyCompanyNameErrorMessage(msg.BlankCompanyErrorMsg()));
        Assert.assertTrue(editProperty.verifyEntityNmaeErrorMessage(msg.BlankEntityErrorMsg()));


    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyErrorMessaeisShowingWhenAdminProvidesSpaceinPropertyNameFieldonEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.enterSpaceinPropertyName());
        Assert.assertTrue(editProperty.clickonSavePropertyButton());
        Assert.assertTrue(createProperty.verifyBlankPropertyErrorMessage(msg.BlankPropertyErrorMsg()));

   }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_VerifyErrorMessaeisShowingWhenAdmindoesnotProvidesPropertyNameonEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(editProperty.clickonSavePropertyButton());
        Assert.assertTrue(createProperty.verifyBlankPropertyErrorMessage(msg.BlankPropertyErrorMsg()));

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyErrorMessageisShowingWhenAdminprovidesInvalidZipcodeOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyErrorMessageisShowingWhenAdminEnterZipcodeWithoutRemovingPreviousZipcodeOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_VerifyErrorMessageisShowingWhenAdminEnterZipcodewithlessthanfivedigitsOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_VerifyErrorMessageisShowingWhenAdminEnterInvalidFromatInZipcodeOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_VerifyErrorMessageisShowingWhenAdminEnterInvalidZipcodeFormatOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_WhenAdminEnterInvalidZipcodeFormatOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_WhenAdminLeavesZipcodeFieldBlankOnEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditProperty editProperty=new EditProperty(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(editProperty.clickonSavePropertyButton());
        Assert.assertTrue(properties.verifyBlankZipCodeErrorMessage(msg.BlankZipErrorMsg()));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_VerifyStateFieldisDisabledonCreateNewPropertyDrawer() throws InterruptedException {
        CreateEntity createentity = new CreateEntity(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(properties.verifyStateFieldisDisabled());
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_VerifyStateFieldisDisabledAfterProvidingInvalidZipCodeonCreateNewPropertyDrawer() throws InterruptedException {
        CreateEntity createentity = new CreateEntity(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyStateFieldisDisabled());
    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_VerifyCityFieldisDisabledonEditPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(properties.verifyCityFieldisDisabled());
    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_VerifyCityFieldisDisabledAfterProvidingInvalidZipCodeonEditPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyCityFieldisDisabled());
    }


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_VerifyCountryFieldisDisableonEditPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(properties.verifyCountryFieldisDisabled());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_VerifyCountryFieldisDisabledAfterProvidingInvalidZipCodeonEditPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyCountryFieldisDisabled());
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_WhenAdmindoesnotEnterAddressonEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveAddressFromEditEntityDrawer());
        Assert.assertTrue(company.EnterAddress(""));
       Assert.assertTrue(properties.clickonSavePropertyButton());
        Assert.assertTrue(company.VerifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }

    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_VerifyErrormessageisShowingWhenAdminUploadImagemorethan3MbsonEditPropertyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(properties.uploadImageMorethan2Mb());
        Assert.assertTrue(properties.verifyErrorMessageisShowingAfterUploadingImageMorethan3Mb(msg.Maximumimagesizeerrormsg()));

    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-66"})
    public void TC_66_WhenAdminProvidesValidDatainEditPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        EditCompany editCompany=new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
       /* Assert.assertTrue(editProperty.clickonEditbuttonFromResponsibilePartiesSection());
        Assert.assertTrue(editProperty.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());*/
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editEntity.RemoveAddressFromEditEntityDrawer());
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(editProperty.clickonEditbuttonFromHardwareProviderSection());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        Assert.assertTrue(properties.clickonSavePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyButtonHasDisplayed());

    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-76"})
    public void TC_76_VerifyUpdatedinformationisShowingonPropertyTab() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        EditCompany editCompany=new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editProperty.verifyUpdatedPropertyInformationisShowingonPropertyPage());

    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-78"})
    public void TC_78_VerifyUpdatedInformationisShowinginActivityLogSectionofEditPropertyDrawer() throws InterruptedException {
        CreateProperty createProperty=new CreateProperty(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty= new EditProperty(driver);
        CreateProperty properties= new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editProperty.clickonEditbuttonFromPropertyPage());
        Assert.assertTrue(editProperty.verifyUpdatedInformationisShowinginAuditlog());

    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-86"})
    public void TC_86_WhenAdminpressCancelButtonAfterChangingPropertyNameFromEditPropertyDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateProperty properties= new CreateProperty(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editProperty.verifyConfirmationPopupisShowing());


    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_VerifyDiscardandContinueButtonsareShowingonConfirmationPopup() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateProperty properties= new CreateProperty(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editProperty.verifyConfirmationPopupisShowing());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());


    }

    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-90"})
    public void TC_90_WenAdminClickonContinueButtonFromConfirmationPopup() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateProperty properties= new CreateProperty(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editProperty.verifyConfirmationPopupisShowing());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(editProperty.verifyConfirmatiomPopuopHasClosed());
        Assert.assertTrue(editProperty.verifyAdminStayonEditPropertyDrawerAfterPressinContinueButtonFromConfirmationPopup());

    }


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-88"})
    public void TC_88_VerifyEditPropertyDrawerClosedAfterPressingDiscardbuttonFromConfirmationPopup() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditProperty editProperty=new EditProperty(driver);
        CreateProperty properties= new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editProperty.RemovePropertyName());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UpdatedProperty")));
        Assert.assertTrue(editProperty.clickonCancel());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyButtonHasDisplayed());

    }






}
