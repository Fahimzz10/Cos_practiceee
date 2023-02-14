package tests.US7CreateEntity;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import pages.*;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class CreateEntityTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewEntityButtonIsShowingtoAdminonEntityManagementPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewEntityDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyEntityInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyEntitySameasCompanyLinkisShowinginEntityInformationsectiononCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntitySameasCompanyLinkisShowingonEntityInformationSection());


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyCompnayLocationInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminDoesnotProvideEntityNameaonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(""));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminProvideInvalidPhoneNumberonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterAplhabatesinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterQuestionmarkinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminEnterSpecialCharactersinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterIvlaidEmailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminEnterNumbersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-21_22"})
    public void TC_21_22_WhenAdminEnterAplhabtesinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_WhenAdminprovidesincompletemailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminEnterSpecialCharactersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterInvalidEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_WhenAdminEnterWrongEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminLeavesEmailFieldBlankonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));


    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminEnterSpecialCharctersinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminEnterAlphabatesinEINFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }
// Error message is not showing
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_WhenAdminEnterInvalidNumbersinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdminEnterInvalidZipcodeFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminEnterInvalidZipcodeFromatonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }


    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminProvidesFourDigitsZaipcodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyStateFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyStateFieldisDisabled());
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyCityFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCityFieldisDisabled());
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_VerifyCountryFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCountryFieldisDisabled());
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-3,4"})
    public void TC_3_VerifyCompanyInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.verifyinputFieldIsShowingForCompanyInformationOnCreateNewEntityDrawer());
        Assert.assertTrue(createentity.verifyinputTypeisSerachOnCompanyInformationsectionOnCreateNewEntityDrawer());


    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdmindoesnotprovideCompanyNameonEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        // Assert.assertTrue(createentity.WriteCompanyName(""));
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.verifyCompanyNameErrorMessage(msg.BlankCompanyErrorMsg()));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_WhenAdminProvidesValidDataonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntityDrawer());
        Assert.assertTrue(createentity.SelectCompanyNamefromDropdown());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
    }

    /*@Test(priority = 31)//Done
    public void WhenAdminChoosetheCompanyNamefromDropdownonEntiysameasCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        Assert.assertTrue(createentity.SelectCompanyNamefromDropdown());
        Assert.assertTrue(createentity.VerifyAlertMessageisShowingAfterSelectingtheCopmayfromCompanyList());
        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());
        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasClosed());
        Assert.assertTrue(createentity.VerifyEntityNameisShowinginEntityTable());

    }*/
}
