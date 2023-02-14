package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

     By email = By.xpath("//input[@placeholder='Email']");
     By password = By.xpath("//input[@placeholder='Password']");
     By loginbutton = By.xpath("//span[contains(.,'Login')]");
     By forgotpasslink = By.xpath("//span[contains(.,'Forgot password?')]");
    By forgotpasswordemail = By.xpath("//input[@placeholder='Email']");
     By errormessagepassrequire = By.xpath("//div[@role='alert'][contains(.,'Password field is required')]");
     By errormessageemailRequire = By.xpath("//div[@role='alert'][contains(.,'Email field is required')]");
     By invalidpasserrormsg = By.xpath("//div[@class='ant-message-notice-content']");
     By invalidemailerrormsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email')]");
     By incompletemailerrormsg = By.xpath("//span[contains(.,'Something went wrong. Try again later')]");
     By unregisteremailerrmsg = By.xpath("//div[contains(@class,'ant-form-item-explain-error')]");
     By showpass = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
     By hidepass = By.xpath("//span[@aria-label='eye']//*[name()='svg']");
     By resetpasswordbtn = By.xpath("//button[contains(.,'Send password reset link')]");
     By resetpasswordlink = By.xpath("//span[contains(.,'Reset password link sent')]");
    By resendemaillink = By.xpath("//span[contains(.,'Resend Email')]");

    public boolean EnterEmail(String Email) {
        try {
           waitVisibility(email);
            writeText(email,Email);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean EnterPassword(String Password) {
        try {
            waitVisibility(password);
            writeText(password, Password);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean enterForgotPasswordEmail(String Email) {
        try {
            waitVisibility(email);
            writeText(email,Email);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean ClickLoginButton () {
        waitVisibility(loginbutton);
        click(loginbutton);
        return true;
    }

    public boolean clickresetPasswordButtonButton () {
        waitVisibility(resetpasswordbtn);
        click(resetpasswordbtn);
        return true;
    }

    public boolean clickResendEmailButton() {
        waitVisibility(resendemaillink);
        click(resendemaillink);
        return true;
    }

    public boolean ClickForgotPassword()  {
            waitVisibility(forgotpasslink);
            click(forgotpasslink);

        return true;
    }

    public boolean ClickonEyetoShowthePassword() {
        waitVisibility(showpass);
        click(showpass);
        return true;
    }

    public boolean ClickonEyetoHidethePassword() {
        waitVisibility(hidepass);
        click(hidepass);
        return true;
    }

    public boolean VerifyPasswordISShowingAfterClickingonEyeIcon() {

        WebElement PasswordText= driver.findElement(By.xpath("//input[contains(@value,'2&57DyhUTH1c')]"));
        if(PasswordText.isDisplayed())
        {
            System.out.println("Verification Successful. Password is showing");
        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyPasswordHasHideAfterClickingonEyeIcon() {
        WebElement showpass= driver.findElement(By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']"));
        if(showpass.isDisplayed())
        {
            System.out.println("Verification Successful. Password is not showing");
        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }


    public void VerifyValidLogin()  {
        String home = prop.getProperty("HomeURL");
        String signin = prop.getProperty("BaseURL");
        String Dashboard = prop.getProperty("DashboardURL");
        String currURL = driver.getCurrentUrl();
        System.out.println();
        System.out.println(currURL);
        if (currURL.equals(home) || currURL.equals(signin) || currURL.equals("data:,") ) {
            HomePage homePage = new HomePage(driver);
            Dashboard dashboard=new Dashboard(driver);
            homePage.geturl();
            Assert.assertTrue(EnterEmail(prop.getProperty("validEmail")));
            Assert.assertTrue(EnterPassword(prop.getProperty("validPassword")));
            Assert.assertTrue(ClickLoginButton());
            Assert.assertTrue(dashboard.VerifyLoginMessage(msg.SuccessfulLoginMessage()));
            Assert.assertTrue(VerifyUserLandsonDashboardAfterLogin());
            System.out.println("Diverted to Login!");
        } else {
            System.out.println("Good To Go!");
        }
    }

    public boolean VerifyBlankPasswordErrorMessage(String expectedText) {
        try {
            assertEquals(errormessagepassrequire, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean VerifyBlankEmailErrorMessage(String expectedText) {
        try {
            assertEquals(errormessageemailRequire, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean verifySendPasswordresetButtonisShowing() {
       // company.waitForSpinner();
        waitVisibility(resetpasswordbtn);
        if( driver.findElement(By.xpath("(//button[contains(.,'Send password reset link')])[1]")).isDisplayed())
        {
            System.out.println("Verification Successfull!!!Send password reset link button is showing on forgot password page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyOptiontoResendFrogotPasswordEmailisShowing() {

        waitVisibility(resendemaillink);
        if( driver.findElement(By.xpath("//span[contains(.,'Resend Email')]")).isDisplayed())
        {
            System.out.println("Verification Successfull!!!Resend Password link is showing.");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyInvalidPasswordErrorMessage(String expectedText) {
        driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
        waitVisibility(invalidpasserrormsg);
        assertEquals(invalidpasserrormsg, expectedText);
        return true;
    }

    public boolean VerifyInvalidEmailErrorMessage(String expectedText) {
        waitVisibility(invalidemailerrormsg);
        waitelementtobedisplayed(invalidemailerrormsg);
        assertEquals(invalidemailerrormsg, expectedText);
        return true;
    }

    public boolean verifyUnRegisteredEmailErrorMessage(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(unregisteremailerrmsg);
        assertEquals(unregisteremailerrmsg, expectedText);
        return true;
        }

    public boolean verifyResetPasswordLinkHasSentSuccessfully(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(resetpasswordlink);
        assertEquals(resetpasswordlink, expectedText);
        return true;
    }




    public boolean VerifyUserLandsonDashboardAfterLogin() {
        urlCheck(prop.getProperty("DashboardURL"));
        return true;
    }

    public boolean verifyUserHasRedirectedTowardtheForgptPasswordPage() {
        urlCheck(prop.getProperty("ForgotPasswordURL"));
        return true;
    }


}


