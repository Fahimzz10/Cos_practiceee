package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import tests.US57UpdateChargerPropertyAdmin.PropertyAdminUpdateChargerTestCases;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class EditChargerCosAdminUpdated extends BasePage {

    public EditChargerCosAdminUpdated(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By EditDrawerChargerInfoTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Information')]");
    public static By EditDrawerOfflineOnline = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Offline/Online')]");
    public static By EditDrawerPropertyInfo = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Property Information')]");
    public static By EditDrawerLocationInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Location Information')]");
    public static By EditDrawerAuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By EditDrawerMoreSettings = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'More Settings')]");
    public static By DrawerTitle = By.xpath("//div[@class='drawerTitle wordBreak']");
    public static By WelcomePageTitleChargingFee = By.xpath("//div[@class='ant-col ant-col-16']//div[@class='pageTitle'][normalize-space()='Charging Fee']");
    public static By LocationFieldCrossButton = By.xpath("//span[@class='ant-select-clear']");
    public static By SelectedLocationField = By.xpath("//span[@class='ant-select-selection-item']");
    public static By CreateNewLocation = By.xpath("//span[normalize-space()='Or, create a new location']");
    public static By CreateLocationDrawerTitle = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create New Location')]");
    public static By PopUpMsgDeactivateCharger = By.xpath("//div[@class='mt-5'][contains(text(),'Are you sure you want to deactivate this charger? This will impact on multiple areas.')]");
    public static By CancelButtonDeactivateCharger = By.xpath("//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Cancel')]");
    public static By DeactivateChargerButton = By.xpath("//span[text()=' Deactivate Charger']");
    public static By RequestDeactivationButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-dangerous']//span[contains(text(),'Request for Deactivation')]");
    public static By ViewLocation = By.xpath("//span[@class='underline cursor'][contains(text(),'View location')]");
    public static By ProfileTop = By.xpath("//div[@class='primary-color mr-10 capitalizeIt']");
    public static By ProfileOption = By.xpath("//div[normalize-space()='Profile']");
    public static By AccountHolderName = By.xpath("//*[@id=\"rc-tabs-1-panel-1\"]/div/div/div[2]/div/span[1]");
    public static By AuditLogAccName= By.xpath("//*[@id=\"basic\"]/div[6]/div[2]/div/ul/li[1]/div[4]/span");
    public static By FirstName = By.xpath("//input[@placeholder='First Name']");
    public static By LastName = By.xpath("//input[@placeholder='Last Name']");
    public static By ChangeNameAuditLog = By.xpath("//*[@id=\"basic\"]/div[6]/div[2]/div/ul/li[2]/div[4]/span/div/div/span[4]");




    public boolean verifyEditButton() throws InterruptedException {
        Thread.sleep(1000);
        if (driver.findElement(CosAdminChargerList.EditButton).isDisplayed()){
            System.out.println("Edit Button is Showing");
            return true;
        }
        else {
            System.out.println("NoT Visible");
            return false;

        }
    }
    public boolean writeInSearchBar(By element, String text, int delay) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(CosAdminChargerList.EditButton);
        writeText(element, text);
        return true;
    }
    public boolean verifyChargerTitleAboveEditDrawer() throws InterruptedException {
        waitforPresence(CosAdminChargerList.EditButton);
        String ChargerTitle = driver.findElement(ChargerListPropertyAdmin.ChargerTitle).getText();
        System.out.println(ChargerTitle);
        driver.findElement(CosAdminChargerList.EditButton).click();
        String Title = driver.findElement(DrawerTitle).getText();
        if (ChargerTitle.equals(Title)){
            System.out.println("Title is Correct");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public boolean verifyEditDrawerNecessarySection() throws InterruptedException {
        Thread.sleep(1000);
        String ChargerTitleInformation = driver.findElement(EditDrawerChargerInfoTitle).getText();
        String OnlineOfflineSection = driver.findElement(EditDrawerOfflineOnline).getText();
        String PropertyInfoSection = driver.findElement(EditDrawerPropertyInfo).getText();
        String LocationInformation =driver.findElement(EditDrawerLocationInformation).getText();
        String AuditLogSection = driver.findElement(EditDrawerAuditLog).getText();
        String MoreSettingsSection= driver.findElement(EditDrawerMoreSettings).getText();
        if (ChargerTitleInformation.contains("Charger Information") && OnlineOfflineSection.contains("Offline/Online") && PropertyInfoSection.contains("Property Information") && LocationInformation.contains("Location Information") && AuditLogSection.contains("Audit Log") && MoreSettingsSection.contains("More Settings") ) {
            System.out.println("Verification Successful - All the Necessary Section of drawer is Showing");
            return true;

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
    }

    public boolean verifyCopyPasteUrl() throws InterruptedException, IOException, UnsupportedFlavorException {
        waitVisibility(UpdateChargerPropertyAdmin.ChargerUrl);
        driver.findElement(UpdateChargerPropertyAdmin.CopyButton).click();
        Thread.sleep(1500);
// Open a new tab
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
        ((JavascriptExecutor) driver).executeScript("window.open(\""+myText+"\")");// launching a new tab window.location = \'"+url+"\'
//        String clickonlink = Keys.chord(Keys.CONTROL,"v");
//        ((JavascriptExecutor) driver).executeScript("window.open((arguments[0])",clickonlink);
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "v").sendKeys(Keys.ENTER).build().perform();//sending the paste command
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
// Switch to the new tab
        driver.switchTo().window(newTab.get(1));
        waitforPresence(WelcomePageTitleChargingFee);
        String CommonTitle = driver.findElement(WelcomePageTitleChargingFee).getText();
        Thread.sleep(4000);
        driver.close();
        driver.switchTo().window(newTab.get(0));
        if (CommonTitle.contains("Charging Fee")){
            System.out.println("Clipboard URL successfully navigate to expected TAB");
            return true;
        }
        else {
            System.out.println("Clipboard URL is not navigating to expected TAB");
            return false;
        }
    }

    public boolean verifyCrossButtonInsideLocationField(){
//        WebElement LocationField = driver.findElement(SelectedLocationField);
        WebElement CrossButton = driver.findElement(LocationFieldCrossButton);
//        Actions builder = new Actions(driver);
//        builder.moveToElement(LocationField).build().perform();
//        builder.moveToElement(CrossButton).build().perform();
        CrossButton.click();
        String EmptyLocationField = driver.findElement(CreateCharger.selectlocation).getText();
        System.out.println(EmptyLocationField);
        if (EmptyLocationField.isEmpty()){
            System.out.println("Cross Button Applied Perfectly");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean verifyInputFieldEditble() throws InterruptedException{
        WebElement ChargerNameField = driver.findElement(CreateCharger.Chargername);
        String EditedText = "Selenium";
//        ChargerNameField.click();
        ChargerNameField.sendKeys(Keys.CONTROL,"a");
        ChargerNameField.sendKeys(Keys.DELETE);
        ChargerNameField.sendKeys(EditedText);
        return true;
    }
    public boolean verifySearchLocationAndSelectFromDropdown() throws InterruptedException{
        WebElement ChargerNameField = driver.findElement(CreateCharger.selectlocation);
        String Location = "Ritchie";
        Thread.sleep(1000);
        click(LocationFieldCrossButton);
//        ChargerNameField.click();
        Thread.sleep(3000);
        ChargerNameField.sendKeys(Location);
        Thread.sleep(2000);
        ChargerNameField.sendKeys(Keys.DOWN,Keys.ENTER);
        String SelectedChargerNameField = driver.findElement(ChargerListPropertyAdmin.SelectedLocationName).getText();
        System.out.println(SelectedChargerNameField);
        if (SelectedChargerNameField.contains("Ritchie Avenue ")){
            System.out.println("Successfully Changed");
            return true;
        }
        else {
            System.out.println("Not Changed");
            return false;

        }
    }

    public boolean verifyCreateNewLocationDrawerFromEditDrawer() throws InterruptedException{
        Thread.sleep(3000);
        if (driver.findElement(CreateLocationDrawerTitle).isDisplayed()){
            System.out.println("Create Location Drawer Opened");
            Thread.sleep(1500);
            click(CreateCharger.crossbtnofdrawer);
            return true;
        }
        else{
            System.out.println("Create Location Drawer is not Opened ");
            return false;
        }
    }

    public boolean verifyGoogleMapLink() throws InterruptedException{
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
// Switch to the new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(10000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(newTab.get(0));
        if (url.contains("https://www.google.com/maps/place/")){
            System.out.println("Navigate to Google Map");
            return true;
        }
        else {
            System.out.println("Google Map is not showing");
            return false;
        }
    }
    public boolean verifyTheEditedInfoInTable() throws InterruptedException{
//        String ToogleButtonStatusAfter = driver.findElement(UpdateChargerPropertyAdmin.ToggleButton).getAttribute(aria-checked);
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(1000);
        click(CreateCharger.Chargername);
        WebElement ChargerNameField = driver.findElement(CreateCharger.Chargername);
        String EditedCharger = "Selenium "+randomNumber;
        click(CreateCharger.Chargername);;
        ChargerNameField.sendKeys(Keys.CONTROL,"a");
        ChargerNameField.sendKeys(Keys.DELETE);
        ChargerNameField.sendKeys(EditedCharger);
        WebElement ChargerLocationField = driver.findElement(CreateCharger.selectlocation);
        String Location = "Ritchie Avenue 57892504";
        click(ChargerListPropertyAdmin.SelectedLocationName);
        Thread.sleep(1500);
        ChargerLocationField.sendKeys(Location);
        ChargerLocationField.sendKeys(Keys.ENTER);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2000);
        String EdcharTable = driver.findElement(ChargerListPropertyAdmin.ChargerTitle).getText();
        String EdLocTable = driver.findElement(ChargerListPropertyAdmin.LocationName).getText();
        if (EdcharTable.equals(EditedCharger) && EdLocTable.equals(Location)){
            System.out.println("All Edited Successfully");
            return true;
        }
        else {
            System.out.println("Fishy");
            return false;
        }
    }
    public boolean verifyTheEditedInfoInDrawer() throws InterruptedException{
        String ToogleButtonStatusBefore = driver.findElement(UpdateChargerPropertyAdmin.ToggleButton).getAttribute("aria-checked");
        System.out.println(ToogleButtonStatusBefore);
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(100);
        click(UpdateChargerPropertyAdmin.ToggleButton);
        click(CreateCharger.Chargername);
        WebElement ChargerNameField = driver.findElement(CreateCharger.Chargername);
        String EditedCharger = "Selenium "+randomNumber;
        click(CreateCharger.Chargername);;
        ChargerNameField.sendKeys(Keys.CONTROL,"a");
        ChargerNameField.sendKeys(Keys.DELETE);
        ChargerNameField.sendKeys(EditedCharger);
        WebElement ChargerLocationField = driver.findElement(CreateCharger.selectlocation);
        String Location = "Rolfson Avenue 48474824";
        click(ChargerListPropertyAdmin.SelectedLocationName);
        Thread.sleep(1500);
        ChargerLocationField.sendKeys(Location);
        ChargerLocationField.sendKeys(Keys.ENTER);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(1000);
        click(CosAdminChargerList.EditButton);
        Thread.sleep(2000);
        String ToogleButtonStatusAfter = driver.findElement(UpdateChargerPropertyAdmin.ToggleButton).getAttribute("aria-checked");
        System.out.println(ToogleButtonStatusAfter);
        String Edchar = driver.findElement(CreateCharger.Chargername).getAttribute("value");
        System.out.println(Edchar);
        String EdLoc = driver.findElement(ChargerListPropertyAdmin.SelectedLocationName).getText();
        System.out.println(EdLoc);
        if (Edchar.equals(EditedCharger) && EdLoc.equals(Location) && !ToogleButtonStatusAfter.equals(ToogleButtonStatusBefore)){
            System.out.println("All Edited Successfully");
            return true;
        }
        else {
            System.out.println("Fishy");
            return false;
        }
    }

    public boolean verifyErrorMsgForInvalidData() throws InterruptedException{
        WebElement ChargerNameField = driver.findElement(CreateCharger.Chargername);
        click(CreateCharger.Chargername);
        ChargerNameField.sendKeys(Keys.CONTROL,"a");
        ChargerNameField.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(1000);
        String ErrorMsg= driver.findElement(CreateCharger.Chargernameerrormsg).getText();
        String ExpectedErrorMsg = "Charger name is required";
        if (ErrorMsg.equals(ExpectedErrorMsg)){
            System.out.println("Alert Message is showing for Mandatory field");
            return true;
        }
        else {
            System.out.println("Fishy");
            return false;
        }
    }

    public boolean verifyNoDataMsgForSearchingInvalidData() throws InterruptedException{
        WebElement ChargerNameField = driver.findElement(CreateCharger.selectlocation);
        String Location = "dfssdfsd";
        Thread.sleep(3500);
        click(ChargerListPropertyAdmin.SelectedLocationName);
//        ChargerNameField.click();
        click(LocationFieldCrossButton);
        Thread.sleep(1500);
        ChargerNameField.sendKeys(Location);
        Thread.sleep(1000);
        if (driver.findElement(CreateCharger.nodatafromsearch).isDisplayed()){
            System.out.println("NO data is Showing");
            return true;
        }
        else{
            System.out.println("Wrong");
            return false;
        }


    }


    public boolean verifyPopUpMsgWithTwoButtonsOfDeactivateCharger() throws InterruptedException {
        Thread.sleep(2000);
        String PopUpMsg = driver.findElement(PopUpMsgDeactivateCharger).getText();
        System.out.println(PopUpMsg);
        String Expected = "Are you sure you want to deactivate this charger? This will impact on multiple areas.";
        if (PopUpMsg.equals(Expected) && driver.findElement(CancelButtonDeactivateCharger).isDisplayed() && driver.findElement(RequestDeactivationButton).isDisplayed()){
            System.out.println("Pop Up Message, Cancel and Request deactivation button is displaying");
            return true;
        }
        else{
            System.out.println("Ghapla Ase");
            return false;
        }
    }
    public boolean verifyUpdatedTime() throws InterruptedException{
        click(ChargerListPropertyAdmin.SaveChargerButton);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("h:mm aa");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        String time= dateFormat.format(date);
        // Print the Date
        System.out.println(time);
        Thread.sleep(1000);
        click(CosAdminChargerList.EditButton);
        Thread.sleep(10000);
        String webDate = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[6]/div[2]/div/ul/li[1]/div[1]/div[2]")).getText();
        System.out.println(webDate);
        if (time.equals(webDate)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyUpdatedDate() throws InterruptedException{
        click(ChargerListPropertyAdmin.SaveChargerButton);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        String date1= dateFormat.format(date);
        // Print the Date
        System.out.println(date1);
        Thread.sleep(6000);
        click(CosAdminChargerList.EditButton);
        Thread.sleep(10000);
        String webDate = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[6]/div[2]/div/ul/li/div[1]/div[1]")).getText();
        System.out.println(webDate);
        if (date1.equals(webDate)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyAccountNameInAuditLog() throws InterruptedException {
        String ProfileNameAudiLog = driver.findElement(AuditLogAccName).getText();
        System.out.println(ProfileNameAudiLog);
        click(ChargerListPropertyAdmin.SaveChargerButton);
        Thread.sleep(2000);
        click(ProfileTop);
        click(ProfileOption);
        waitforPresence(FirstName);
        waitforPresence(LastName);
        String FName = driver.findElement(FirstName).getAttribute("value");
        String LName = driver.findElement(LastName).getAttribute("value");
        String FullName = FName+" "+LName;
        System.out.println(FullName);
        if (ProfileNameAudiLog.contains(FullName)){
            System.out.println("GG");
            return true;
        }
        else {
            System.out.println("NOt WORKING");
            return false;
        }

    }
    public boolean verifyChangeNameInAuditLog() throws InterruptedException{
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(10000);
        click(UpdateChargerPropertyAdmin.ToggleButton);
        click(CreateCharger.Chargername);
        WebElement ChargerNameField = driver.findElement(CreateCharger.Chargername);
        String EditedCharger = "Selenium "+randomNumber;
        click(CreateCharger.Chargername);;
        ChargerNameField.sendKeys(Keys.CONTROL,"a");
        ChargerNameField.sendKeys(Keys.DELETE);
        ChargerNameField.sendKeys(EditedCharger);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(1000);
        click(CosAdminChargerList.EditButton);
        Thread.sleep(2000);
        String Edchar = driver.findElement(ChangeNameAuditLog).getText();
        System.out.println(Edchar);
        if (Edchar.equals(EditedCharger)){
            System.out.println("Edited Name is Showing in Audit Log Successfully");
            return true;
        }
        else {
            System.out.println("Fishy");
            return false;
        }
    }
}
