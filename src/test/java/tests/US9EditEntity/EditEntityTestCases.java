package tests.US9EditEntity;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import pages.*;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class EditEntityTestCases extends BaseTest{
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditEntityButtonIsShowingontheEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
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
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.VerifyEntityInformationareShowing());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyAuditLogsSectionIsShowingOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_VerifyErrorMessageisShowingWhenAdminDoesnotProvideEntityNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminProvideInvalidPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminEnterAlphabatesinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminEnterQuestionMarkinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminEnterSpecialCharactersinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminEnterInvalidEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }


    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_WhenAdminEnterNumbersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-27_28"})
    public void TC_27_WhenAdminEnterAlphabatesinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminEnterIncompleteEmailinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterSpecialCharactersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdminEnterinvalidEmailFormatinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminAddEmaiwithoutdotcominEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminLeavesEmailFieldBlankOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));    }



    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyErrorMessageisShowingWhenAdminprovidesAlphabatesinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyErrorMessageisShowingWhenAdminprovidesInvalidZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyErrorMessageisShowingWhenAdminEnterInvalidFromatInZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_VerifyErrorMessageisShowingWhenAdminEnterZipcodewithlessthanfivedigitsOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyErrorMessageisShowingWhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_WhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_WhenAdminChangeInputFieldWithValidDataonEditEntityDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editEntity.RemoveAddressFromEditEntityDrawer());
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_VerifyUpdatedInformationsisShowingAfterUpdatingtheEntity() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editEntity.VerifyUpdatedEntityisShowinginEntityTable());
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminpressCancelButtonAfterChangingEntityNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickCancelbutton());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());
    }

   /* @Test(priority = 130)//Done
    public void VerifyErrorMessageIsShowingWenAdminDoesnotEnterCompanyNameonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditEntity entity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        //Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.WriteCompanyName(""));

        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.verifyCompanyNameErrorMessage(msg.BlankCompanyErrorMsg()));

    }*/

   /* @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void WhenAdminprovideInvalidCompanyNameonEntiysameasCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*//*
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.ClickoEntitysameasCompany());
        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        Assert.assertTrue(createentity.WriteCompanyName(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.VerifyNoSugessuionISShowingAfterProvidingInvalidCompanyNameonEntitySameasCompanyDrawer());

    }*/

}
