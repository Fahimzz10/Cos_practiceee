package tests.US1AdminLogin;

import com.aventstack.extentreports.ExtentTest;
import com.google.inject.name.Named;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;

import java.util.Properties;

public class LoginTests extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminProvidesInvalidEmailbutCorrectPassword() {
       HomePage homePage=  new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("EmailwithoutCom")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_WhenAdminProvidesincomplateEmailbutCorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("incompletedEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminEnteresNumberintheEmailField() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_WhenAdminEntersInvalidEmailbutCorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_ShowAndHidePassFromLoginPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickonEyetoShowthePassword());
        Assert.assertTrue(loginPage.VerifyPasswordISShowingAfterClickingonEyeIcon());
        Assert.assertTrue(loginPage.ClickonEyetoHidethePassword());
        Assert.assertTrue(loginPage.VerifyPasswordHasHideAfterClickingonEyeIcon());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminEntersValidEmailandInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_WhenAdminEnterValidEmailandbracketsinPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword1")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminEnterValidEmailandincorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword2")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminEnterValidEmailandunderscoreinPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword3")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminLeavesEmailFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(""));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyBlankEmailErrorMessage(msg.BlanklEmailErrorMsg()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_WhenAdminLoginusingInvalidEmailandInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("Numbers")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminLeavesBothEmailandPasswordFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(""));
        Assert.assertTrue(loginPage.EnterPassword(""));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyBlankEmailErrorMessage(msg.BlanklEmailErrorMsg()));
        Assert.assertTrue(loginPage.VerifyBlankPasswordErrorMessage(msg.BlanklPassErrorMsg()));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminLeavesPasswordFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(loginPage.EnterPassword(""));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.VerifyBlankPasswordErrorMessage(msg.BlanklPassErrorMsg()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_VerifyAdminHasRedirectedtoTheForgotPasswordPageAferClickingonForgoPasswordLinkFromLoginPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_VerifySendResetPasswordLinkButtonisShowingOnForgotPasswordPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());
        Assert.assertTrue(loginPage.verifySendPasswordresetButtonisShowing());
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminprovidesEmailwithotComOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard= new Dashboard(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        //Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("EmailwithoutCom")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminprovidesSpecialCharactersinEmailFieldOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminprovidesNumbersinEmailFieldOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_WhenAdminprovideIncompleteEmaildOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("incompletedEmail")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.verifyUnRegisteredEmailErrorMessage(msg.UnregsiteredEmailErrorMessage()));
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminprovideWrongEmaildOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.VerifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminprovideUnregisteredEmailAddressOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("UnregisteredEmailAddress")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.verifyUnRegisteredEmailErrorMessage(msg.UnregsiteredEmailErrorMessage()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminprovideValidEmailAddressOnForgotPasswordPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.verifyResetPasswordLinkHasSentSuccessfully(msg.ResetPasswordLinkSentMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyResendEmailOptionisShowingAfterProvidingtheValidEmailAddress() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());
        Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.verifyResetPasswordLinkHasSentSuccessfully(msg.ResetPasswordLinkSentMsg()));
        Assert.assertTrue(loginPage.verifyOptiontoResendFrogotPasswordEmailisShowing());
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyEmailhasSentAgainAfterClickingonResendEmailOption() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        /*homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
        Assert.assertTrue(loginPage.verifyUserHasRedirectedTowardtheForgptPasswordPage());*/
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(loginPage.enterForgotPasswordEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.clickresetPasswordButtonButton());
        Assert.assertTrue(loginPage.verifyResetPasswordLinkHasSentSuccessfully(msg.ResetPasswordLinkSentMsg()));*/
        Assert.assertTrue(loginPage.clickResendEmailButton());
        Assert.assertTrue(loginPage.verifyOptiontoResendFrogotPasswordEmailisShowing());

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_15_WhenAdminLoginUsingValidEmailandValidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.geturl();
        loginPage.VerifyValidLogin();

    }

    @Test(priority = 27)//Done
    public void LogoutfromtheSystem() throws InterruptedException {
        Dashboard dashboard=new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonDropdownArrow());
        Assert.assertTrue(dashboard.ClickonLogout());
        Assert.assertTrue(dashboard.VerifyUSerHasLogoutFromtheSystem());

    }

}
