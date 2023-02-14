package tests.US2CreateCompany;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class CreateCompanyTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewCompanyButtonIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewCompanyDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());


    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyCompanyInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.VerifyCompanyInformationareShowingonCreateNewCompanyDrawer());


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCompnayLocationInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyBrandInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
      /*  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.VerifyUploadButtonisShowing());
        Assert.assertTrue(company.VerifyBrandInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminDoesnotProvideCompanyNameaonCreateNewCompanyDrawer_TC_6() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(""));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyCompanyNmaeErrorMessage(msg.CompanyNameErrorMsg()));
    }


  /*  @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminProvideInvalidPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminEnterAlphabatesinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*//*
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminEnterQuestionMarkinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_WhenAdminEnterStarsinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }*/

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminProvideInvalidEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }


    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminEnterNumbersinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminEnterAlbhatesinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterincompleteEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        //Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterspecialcharacterinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminEnterinvalidEmailFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterinvalidFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_WhenAdminLeavesEmailFieldBlankIonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));
    }

   /* @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminIncludesHTMLattheEndofWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }
*/
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminProvidestheWebsitewhichIncludesSpacesinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithSpaces")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminIncludestheCharactersinmiddleonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithCharacter")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminIncludesNumbersonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_WhenAdminProvidesOnlySpecialCharacteronWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminProvidesOnlyAplhabatesonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminProvidesOnlydotComonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithdotcomOnly")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminProvidesInvalidDatainEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_WhenAdminProvidesAlphabatesinEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_WhenAdminProvideInValidDatainZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
      //  Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminProvideinvalidZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
     //   Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminProvideZipCodewithLessthanFiveDigitsonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        //Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdmindoesnotEnterZipCodeinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(""));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankZipCodeErrorMessage(msg.BlankZipCodeErrorMsg()));
    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdmindoesnotEnterAddressinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(""));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminProvideValidDataonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteRandomCompanyEmail());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.WriteRandomEINNumber());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifySaveandCancelButtonsareShowingontoSuperadminonCreateCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.VerifySaveCompanyButtonsareShowingonCreateCompanyDrawer());
        Assert.assertTrue(company.VerifyCancelButtonsisShowing());

    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_WhenAdminClickonCrossButtonAfterProvidingAllInformationonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonCrossbutton());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());
    }

}
