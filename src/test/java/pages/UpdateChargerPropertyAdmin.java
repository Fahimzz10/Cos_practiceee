package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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





}
