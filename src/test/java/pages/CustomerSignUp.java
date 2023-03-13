package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

public class CustomerSignUp extends BasePage{
    public CustomerSignUp(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    //    public static By PhoneNumber = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-15 mb-15 guestButton']");
//    public static By InvalidQrAlertmsg = By.xpath("//div[@class='ant-alert-description']");
//    public static By title = By.xpath("//div[@class='pageTitle']");
    public static By ProvidePhnNum = By.xpath("(//div[@class='providePhone'])[2]");
    public static By SignUpPageTitle = By.xpath("//div[@class='titleLogin mt-15']");
    public static By SignUpBtn = By.xpath("//div[@class='ant-col ant-col-16']//span[contains(text(),'Sign up')]");
    public static By SignUpWithEmail = By.xpath("//button[@class='ant-btn ant-btn-default email-button']");
    public static By FirstName = By.xpath("//input[@id='basic_fName']");
    public static By LastName = By.xpath("//input[@id='basic_lName']");
    public static By EmailField = By.xpath("//input[@id='basic_email']");
    public static By ZipField = By.xpath("//input[@id='basic_zip']");
    public static By Password = By.xpath("//input[@id='basic_password']");
    public static By ConfirmPassword = By.xpath("//input[@placeholder='Confirm password']");
    public static By AgreeCheckBox= By.xpath("//span[@class='ant-checkbox']");
    public static By AgreeCheckBoxChecked= By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']");
    public static By SignUpConfirm = By.xpath("//button[@type='submit']");
    public static By ErrorMsgFName = By.xpath("//div[contains(text(),'First Name is required')]");
    public static By ErrorMsgLName = By.xpath("//div[contains(text(),'Last Name is required')]");
    public static By ErrorMsgInvalidFname = By.xpath("//div[contains(text(),'Invalid first name')]");
    public static By ErrorMsgInvalidLname = By.xpath("//div[@role='alert'][contains(text(),'Invalid last name')]");
    public static By ErrorMsgNoEmail = By.xpath("//div[@role='alert'][contains(text(),'Email is required')]");
    public static By ErrorMsgInvalidEmail = By.xpath("//div[@role='alert'][contains(text(),'Invalid email')]");
    public static By ErrorMsgInvalidZipCode = By.xpath("//div[@role='alert'][contains(text(),'Please provide a valid Zip Code')]");
    public static By ErrorMsgNoPassword = By.xpath("//div[@role='alert'][contains(text(),'Password is required')]");
    public static By ErrorMsgNotSelectingTC = By.xpath("//div[@role='alert'][contains(text(),'Accepting terms and conditions is required')]");
    public static By ErrorForLessDigitPass = By.xpath("//div[@class='text-left mt-10 wrongPassSuggestion']");
    public static By VerifyEmailTitle = By.xpath("//div[@class='h1-text titleLogin mt-30']");






    public boolean GoToAvailableCharger () throws InterruptedException{
        driver.get("https://beta-app.chargeonsite.com/charger/bz8-jP");
        urlCheck("https://beta-app.chargeonsite.com/charger/bz8-jP");
        return true;
    }
    public boolean FieldClear(By element) throws InterruptedException{
        driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return true;
    }

    public boolean VerifyNumberVerificationPage() throws InterruptedException{
        Thread.sleep(5000);
        waitforPresence(ProvidePhnNum);
        String s = driver.findElement(ProvidePhnNum).getText();
        System.out.println(s);
        if (driver.findElement(ProvidePhnNum).isDisplayed()){
            System.out.println("Verification Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }
    public boolean VerifyUserIsInRegistrationPage() throws InterruptedException {
        Thread.sleep(5000);
        if (driver.findElement(SignUpPageTitle).isDisplayed()){
            System.out.println("Verification Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }
    public boolean VerifyFirstNameErrorMsg() throws InterruptedException{
        Thread.sleep(1500);
        String FnameErrMsg = driver.findElement(ErrorMsgFName).getText();
        System.out.println(FnameErrMsg);
        String Expected = "First Name is required";
        if (FnameErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyLastNameErrorMsg() throws InterruptedException{
        Thread.sleep(1500);
        String FnameErrMsg = driver.findElement(ErrorMsgLName).getText();
        System.out.println(FnameErrMsg);
        String Expected = "Last Name is required";
        if (FnameErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyFirstNameErrorMsgForInvalidInput() throws InterruptedException{
        Thread.sleep(1500);
        String FnameErrMsg = driver.findElement(ErrorMsgInvalidFname).getText();
        System.out.println(FnameErrMsg);
        String Expected = "Invalid first name";
        if (FnameErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyLastNameErrorMsgForInvalidInput() throws InterruptedException{
        Thread.sleep(1500);
        String LnameErrMsg = driver.findElement(ErrorMsgInvalidLname).getText();
        System.out.println(LnameErrMsg);
        String Expected = "Invalid last name";
        if (LnameErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyNoEmailErrorMsg() throws InterruptedException{
        Thread.sleep(1500);
        String EmailFieldErrMsg = driver.findElement(ErrorMsgNoEmail).getText();
        System.out.println(EmailFieldErrMsg);
        String Expected = "Email is required";
        if (EmailFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyInvalidEmailErrorMsg() throws InterruptedException{
        Thread.sleep(1000);
        String EmailFieldErrMsg = driver.findElement(ErrorMsgInvalidEmail).getText();
        System.out.println(EmailFieldErrMsg);
        String Expected = "Invalid email";
        if (EmailFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyInvalidZipCode() throws InterruptedException{
        Thread.sleep(1000);
        String ZipFieldErrMsg = driver.findElement(ErrorMsgInvalidZipCode).getText();
        System.out.println(ZipFieldErrMsg);
        String Expected = "Please provide a valid Zip Code";
        if (ZipFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyWithNoPassword() throws InterruptedException{
        Thread.sleep(1000);
        String PasswordFieldErrMsg = driver.findElement(ErrorMsgNoPassword).getText();
        System.out.println(PasswordFieldErrMsg);
        String Expected = "Password is required";
        if (PasswordFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyWithLessThanEightDigitPassword() throws InterruptedException{
        Thread.sleep(1000);
        String PasswordFieldErrMsg = driver.findElement(ErrorForLessDigitPass).getAttribute("class");
        System.out.println(PasswordFieldErrMsg);
        if (driver.findElement(ErrorForLessDigitPass).isDisplayed()){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyWithoutSelectingCheckboxOfTC() throws InterruptedException{
        Thread.sleep(1000);
        String ErrorMsg = driver.findElement(ErrorMsgNotSelectingTC).getText();
        System.out.println(ErrorMsg);
        String Expected = "Accepting terms and conditions is required";
        if (ErrorMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }

    public boolean VerifyEmailVerificationTitle() throws InterruptedException{
        Thread.sleep(1000);
        waitforPresence(VerifyEmailTitle);
        if (driver.findElement(VerifyEmailTitle).isDisplayed()){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }


}
