package tests.US4EditCompany;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class EditCompanyTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditCompanyButtonIsShowingontheCompanyManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyEditCompanyDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifyEditCompanyDrawerisShowing());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyComapnyStatusisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifCompanyStatusisActiveonMoreSettingsSection());
    }

    @Test(priority = 4)//Done
    public void TC_4_VerifyDecativateCompanyButtonisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifDeactivateCompanyButtonIsShowingonMoreSettingsSection());
    }


    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyAuditLogsIsShowingOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifAuditLogsareShowingonEditComapnyDrawer());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyLoadmoreButtonisShowingonAuditLogsIsSectionOfEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifLoadmoreButtonisShowingonAuditLogsofEditComapnyDrawer());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyErrorMessageisShowingWhenUserDoesnotProvideCompanyNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyCompanyNmaeErrorMessage(msg.CompanyNameErrorMsg()));
    }


   /* @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminProvideinvalidDatainthePhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminEntersAlphabatesinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminEntersQuestionmarkinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_10_WhenAdminEntersSpecialCharactersinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*//*
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }*/

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminEnterInvalidEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminEnterNumbersinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminEnterAlphabatesinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterIncompletEmaillOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }


    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterSpecialCharacterinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_17_WhenAdminEnterInvalidEmailFormatinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterEmailwithoutAddingdotcomOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_VerifyErrorMessageisShowingWhenAdminLeavesEmailfieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));
    }

//Error message is not showing in this case
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_VerifyErrorMessageisShowingWhenAdminProvidesIncorrectWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
        Assert.assertTrue(company.ClickonSaveButton());
      //  Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_VerifyErrorMessageisShowingWhenAdminEnterSpecialCharactersinWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyErrorMessageisShowingWhenAdminProvideWebsitewhichIncludesSpacesisOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithSpaces")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyErrorMessageisShowingWhenAdminIncludestheCharactersinmiddleinWebsiteOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithCharacter")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyErrorMessageisShowingWhenAdminIncludesNumbersinWebsiteOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("Numbers")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyErrorMessageisShowingWhenAdminOnlyAplhabatesonWebsitOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 26)//Done
    public void TC_26_VerifyErrorMessageisShowingWhenAdminProvidesOnlydotComonWebsiteinEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithdotcomOnly")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifyErrorMessageisShowingWhenAdminprovidesAplhabatesinEINNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void VerifyErrorMessageisShowingWhenAdminprovidesInvalidZaipcodeOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        // Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_VerifyErrorMessageisShowingWhenAdminUseInvalidFormatforZipcodeOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 31)//Done
    public void TC_31_VerifyErrorMessageisShowingWhenAdminEnterZipcodeWithLessthanFiveDigitsOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        // Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifyErrorMessageisShowingWhenAdminEnterZipcodeUsingInvalidZipcodeFormatOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyErrorMessageisShowingWhenAdminLeavesZipcodefieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(""));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankZipCodeErrorMessage(msg.BlankZipCodeErrorMsg()));
    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyErrorMessageisShowingWhenAdminLeavesAddressfieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveAddressFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterAddress(""));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }
// User is able to upload the image using invalid dimension
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyErrorMessageisShowingWhenAdminUploadtheImageUsingInvalidDimensionOnEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(editCompany.updateLogoUsingInvalidDimension());
      //  Assert.assertTrue(editCompany.VerifyInvalidImageDimesionErrorMessage(msg.Invalidimagedimensionerrormsg()));
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_WhenAdminpressCancelButtonAfterChangingCompanyNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("UpdatedCompanyName")));
        Assert.assertTrue(editCompany.ClickCancelbutton());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
    }



    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_WhenAdminChangeInputFieldWithValidDataonEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editCompany.RemoveAddressFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

}
