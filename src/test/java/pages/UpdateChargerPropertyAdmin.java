package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.collections.ListUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.US57UpdateChargerPropertyAdmin.PropertyAdminUpdateChargerTestCases;

import java.sql.Driver;
import java.util.ArrayList;

public class UpdateChargerPropertyAdmin extends BasePage {

    public UpdateChargerPropertyAdmin(WebDriver driver) {

        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By ChargerInfoTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Information')]");
    public static By DetailsDrawerOfflineOnline = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Offline/Online')]");
    public static By DetailsDrawerPropertyInfo = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Property Information')]");
    public static By DetailsDrawerLocationInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Location Information')]");
    public static By DetailsDrawerAuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By ToggleButton = By.xpath("//button[@role='switch']");

    public static By ChargerUrl = By.xpath("//*[@id=\"basic\"]/div[2]/div[4]/div/div[2]/div");
    public static By CopyButton = By.xpath("//*[@id=\"basic\"]/div[2]/div[4]/div/div[2]/button");
    public static By SaveCharger = By.xpath("//button[@type='button']//span[contains(text(),'Save Charger')]");
    public static By CancelButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
    public static By NewTabPageTitle = By.xpath("//div[@class='ant-col ant-col-16']/div/div[@class='pageTitle']");
    public static By PopUpBoxText = By.xpath("//div[contains(@class,'ant-modal-confirm-content')]");

    public static By DiscardBtn = By.xpath("//button[@class='ant-btn ant-btn-default'][contains(.,'Discard')]");
    public static By ContinueBtn = By.xpath("//button[@class='ant-btn ant-btn-primary'][contains(.,'Continue')]");
    public static By AlertBox = By.xpath("//div[@class='ant-modal-body']");













    public boolean verifyDetailsButtonUnderActionColumn(){
        if (driver.findElement(ChargerListPropertyAdmin.detailsbutton).isDisplayed()){
            System.out.println("Details Button is Visible");
            return true;
        }
        else {
            System.out.println("Details Button is not Visible");
            return false;
        }
    }

    public boolean verifyDrawerOpeningForDetailsButton(){
        waitVisibility(ChargerInfoTitle);
        String ChargerTitleInformation = driver.findElement(ChargerInfoTitle).getText();
        System.out.println(ChargerTitleInformation);
        if (driver.findElement(ChargerInfoTitle).isDisplayed()){
            System.out.println("Drawer opened");
            return true;
        }
        else {
            System.out.println("Not Opened");
            return false;
        }
    }
    public boolean verifyDrawerNecessarySection() throws InterruptedException {
        Thread.sleep(1000);
        String ChargerTitleInformation = driver.findElement(ChargerInfoTitle).getText();
        String OnlineOfflineSection = driver.findElement(DetailsDrawerOfflineOnline).getText();
        String PropertyInfoSection = driver.findElement(DetailsDrawerPropertyInfo).getText();
        String LocationInformation =driver.findElement(DetailsDrawerLocationInformation).getText();
        String AuditLogSection = driver.findElement(DetailsDrawerAuditLog).getText();
        if (ChargerTitleInformation.contains("Charger Information") && OnlineOfflineSection.contains("Offline/Online") && PropertyInfoSection.contains("Property Information") && LocationInformation.contains("Location Information") && AuditLogSection.contains("Audit Log") ) {
            System.out.println("Verification Successful - All the Necessary Section of drawer is Showing");
            return true;

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
    }
    public boolean verifyToggleButtonDefaultState() {
        String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        if (ToggleButtonStatus.contains("true")) {
            System.out.println("Verification Successful!!! Toggle button has Set to Online By Default");
            return true;
        }
        else {
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }
    }
    public boolean verifyUrlAndCopyButtonExist(){
        waitVisibility(ChargerUrl);
        String getUrl = driver.findElement(ChargerUrl).getText();
        System.out.println(getUrl);
        String expectedUrl = "https://test-app.chargeonsite.com/charger/drpWVC";
        if (getUrl.equals(expectedUrl) && driver.findElement(CopyButton).isDisplayed()){
            System.out.println("URL and Copy Button is visible");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }
    }
    public boolean verifyChargerStatusAfterChanging() {

        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("false")) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Toggle button has Set to Offline!!");
            return true;

        }
    }

    public boolean verifyChargerStatusAfterMakingItOffline() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();

        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("false")) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Toggle button has Set to Offline!!");
            return true;

        }
    }
    public boolean verifyChargerStatusAfterMakingItOnlineFromOffline() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("true")) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification UnSuccessful.Toggle button has Set to Online!!");
            return false;

        }

    }

    public boolean verifyChargerStatusInWelcomePage() throws InterruptedException{
        waitVisibility(ChargerUrl);
        String url = driver.findElement(ChargerUrl).getText();
        System.out.println(url);//copying the URL
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open(\'"+url+"\')");// launching a new tab window.location = \'"+url+"\'
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "v").sendKeys(Keys.ENTER).build().perform();//sending the paste command
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(3000);
        String s =driver.findElement(NewTabPageTitle).getText();
        System.out.println(s);
        //switch to parent window
        driver.switchTo().window(newTab.get(0));
        if (s.contains("Thanks For Scanning")){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
    public boolean verifyChargerStatusInWelcomePageWhenToggleButtonIsOff() throws InterruptedException{
        waitVisibility(ChargerUrl);
        String url = driver.findElement(ChargerUrl).getText();
        System.out.println(url);//copying the URL
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open(\'"+url+"\')");// launching a new tab window.location = \'"+url+"\'
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "v").sendKeys(Keys.ENTER).build().perform();//sending the paste command
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(3000);
        String s =driver.findElement(NewTabPageTitle).getText();
        System.out.println(s);
        Thread.sleep(1000);
        //switch to parent window
        driver.switchTo().window(newTab.get(0));
        if (s.contains("We Are Sorry!")){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
    public boolean verifyUpdatesOfChanges() throws InterruptedException{
        Thread.sleep(1000);
        String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        if (ToggleButtonStatus.equals("false") && driver.findElement(ChargerListPropertyAdmin.SelectedLocationName).getText().contains("Charger Location")){
            System.out.println("Changes Updated");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean verifyAlertMessage() throws InterruptedException{
        Thread.sleep(1000);
        String PopupBoxMsg = driver.findElement(PopUpBoxText).getText();
        System.out.println(PopupBoxMsg);
        String Expected = "Do you want to discard or continue?";
        if (PopupBoxMsg.equals(Expected)){
            System.out.println("Pop Up Box Text is Showing");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }

    }

    public boolean verifyDiscardAndContinueButton() throws InterruptedException{
        Thread.sleep(1000);
        if (driver.findElement(DiscardBtn).isDisplayed() && driver.findElement(ContinueBtn).isDisplayed()){
            System.out.println("Discard and Continue Button Are Displayed");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }

    }
    public boolean VerifyingChangesNotSavedAfterPressingDiscardButton() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(ToggleButton).click();
        String BeforeToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        driver.findElement(CancelButton).click();
        Thread.sleep(1500);
        driver.findElement(DiscardBtn).click();
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        String AfterToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        if (!BeforeToggleButtonStatus.equals(AfterToggleButtonStatus)){
            System.out.println("Congo!!!Changes has not been made");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean verifyPopUpBoxIsNotShowingAfterClickOnContinue() throws InterruptedException{
        Thread.sleep(1000);
        WebElement AlertBoxPortion =driver.findElement(AlertBox);
        driver.findElement(ContinueBtn);
        if (AlertBoxPortion.isDisplayed()){
            System.out.println("pop Up Box is showing");
            return false;
        }
        else {
            System.out.println("PopUp Box Gone");
            return true;
        }

    }





}
