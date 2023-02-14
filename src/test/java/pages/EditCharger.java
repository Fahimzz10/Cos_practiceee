package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EditCharger extends BasePage{

    public EditCharger(WebDriver driver)
    {
        super(driver);
    }

    CreateCompany company=new CreateCompany(driver);

    By savechargerbtn = By.xpath("//button[contains(.,'Save Charger')]");
    By cancelbtn = By.xpath("//button[contains(.,'Cancel')]");
    By deactivatechargerbtn = By.xpath("//button[contains(.,'Deactivate Charger')]");
    By locationdropdown = By.xpath("//span[@class='ant-select-selection-item']");
    By createlocationlink = By.xpath("//span[normalize-space()='Or, create a new location']");
    By locationname = By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'Location Created From Chargers')])[1]");
    By dropdown = By.xpath("//input[@role='combobox']");
    By actualtitle = By.xpath("//span[@class='ant-select-selection-item']");
    By expectedtitle = By.xpath("//span[@class='ant-select-selection-item']");
    By viewlocation = By.xpath("(//span[contains(.,'View location')])[2]");


    public boolean clickSaveChargerButton() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(savechargerbtn);
        waitelemtclickable(savechargerbtn);
        click(savechargerbtn);
        return true;
    }

    public boolean clickonLocationDropdown() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(5000);
       // waitelementtobedisplayed(locationdropdown);
        waitVisibility(locationdropdown);
        click(locationdropdown);
        return true;
    }

    public boolean clickonCreateNewLocation() throws InterruptedException {
        company.waitForSpinner();
        //Thread.sleep(2000);
        waitVisibility(createlocationlink);
        waitelementtobedisplayed(createlocationlink);
     //   waitelemtclickable(createlocation);
        click(createlocationlink);
        return true;
    }

    public boolean clickonLocationName() throws InterruptedException {
     //   company.waitForSpinner();
       Thread.sleep(3000);
        waitVisibility(locationname);
        waitelementtobedisplayed(locationname);
       // waitelemtclickable(locationname);
        click(locationname);
        return true;
    }

    public boolean clickonCancelButton() throws InterruptedException {
        //   company.waitForSpinner();
        //  Thread.sleep(2000);
        waitelementtobedisplayed(cancelbtn);
        waitelemtclickable(cancelbtn);
        click(cancelbtn);
        return true;
    }


    public boolean writeLocationName(String LocationName) {
        company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        waitVisibility(dropdown);
        writeText(dropdown,LocationName);
        return true;
    }

    public boolean clickonDeactivateCharerButton() throws InterruptedException {
        company.waitForSpinner();
        //  Thread.sleep(2000);
        waitelementtobedisplayed(deactivatechargerbtn);
        waitelemtclickable(deactivatechargerbtn);
        click(deactivatechargerbtn);
        return true;
    }

    public boolean clickOnViewLocation() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        //waitelementtobedisplayed(viewlocation);
        click(viewlocation);
        return true;
    }

    public boolean selectLocationFeildFromEditChargerDrawer () throws InterruptedException {
        company.waitForSpinner();
        //Adding wait
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Select Location Field");
         return true;

    }

    public boolean removeLocationFromEditChargerDrawer() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        WebElement locationtitle= driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')]"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.DELETE);
        return true;
    }


    public boolean verifyChargerDetailsDrawerHasDisplayed() throws InterruptedException {
        company.waitForSpinner();
    //    Thread.sleep(3000);
        if(driver.getPageSource().contains("Online/Offline") && driver.getPageSource().contains("Location Information") && driver.getPageSource().contains("Property Information") && driver.getPageSource().contains("Charger Details") && driver.getPageSource().contains("More Settings") ) {
            System.out.println("Verification Successful - Edit Charger Drawer Has Opened");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyAllRequiredFieldsareShowing() {
        company.waitForSpinner();
        if (driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')]")).isDisplayed()) {
            System.out.println("Verification Successful - All Required Fields are Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifDeactivateChargerButtonIsShowing() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//button[contains(.,'Deactivate Charger')]")).isDisplayed())
        {
            System.out.println("Deactivate Charger button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPopupHasDisplayedAfterClickingonDeactivateChargerButton() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Are you sure you want to deactivate this charger? This will impact on multiple areas.')]")).isDisplayed())
        {
            System.out.println("Deactivate Charger Popup has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyTextonPopupOfDeactivateChargerButton() throws InterruptedException {
       // Thread.sleep(2000);
        String expectedtext = "Are you sure you want to deactivate this charger? This will impact on multiple areas.";
        String actualtext = driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Are you sure you want to deactivate this charger? This will impact on multiple areas.')]")).getText();
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Are you sure you want to deactivate this charger? This will impact on multiple areas.')]")).isDisplayed())
        {
            Assert.assertEquals(actualtext, expectedtext);

        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationFieldIsAutoSelected() {
        company.waitForSpinner();
        WebElement locationnamw = driver.findElement(By.xpath("//button[@role='switch']"));
        if( driver.findElement(By.xpath("//button[contains(.,'Deactivate Charger')]")).isDisplayed())
        {
            System.out.println("Location Name is:" +locationnamw.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyNoDataisShowingAfterEntringInvalidLocationName() {
        company.waitForSpinner();
      //  WebElement locationnamw = driver.findElement(By.xpath("//button[@role='switch']"));
        if( driver.findElement(By.xpath("//div[@class='ant-empty-description']")).isDisplayed())
        {
            System.out.println("Verification Successfull!!! No Data is Showing After Entring Invalid Location Name");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyNewlyCreatedLocationIsShowingInCreateLocationDropdown() {
       // company.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[contains(.,'Location Created From Chargers')])[10]")).isDisplayed())
        {
            System.out.println("Verification Successfull!!!Newly Created Location Is Showing In Create Location Dropdown");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationLandmarkHasChangedAfterEntringValidLocationName() {
        company.waitForSpinner();
        //  WebElement locationnamw = driver.findElement(By.xpath("//button[@role='switch']"));
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'south of the front entrance')]")).isDisplayed())
        {
            System.out.println("Verification Successfull!!! Location Landmark HasChanged After Entring Valid Location Name");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyNewLocationLandmarkHasChangedAfterEntringValidLocationName() {
        company.waitForSpinner();
        //  WebElement locationnamw = driver.findElement(By.xpath("//button[@role='switch']"));
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Location From Chargers')]")).isDisplayed())
        {
            System.out.println("Verification Successfull!!! Location Landmark HasChanged After Entring Valid Location Name");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCancelandRequestForDeactivationButtonsAreShowingonDeactivateChargerButton() {
        company.waitForSpinner();
        WebElement cancelbtn=  driver.findElement(By.xpath("(//button[contains(.,'Cancel')])[2]"));
        WebElement deactivationbtn=  driver.findElement(By.xpath("//button[contains(.,'Request for Deactivation')]"));
        if( cancelbtn.isDisplayed() && deactivationbtn.isDisplayed())
        {
            System.out.println("Cancel and Request For Deactivation Buttons Are Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUpdatedLocationNameisShowingonChargerPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[@title='Location Created From Chargers'])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Updated Location Name is Showing on ChargerPage");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifyMessageIsShowingAfterMakingChargerOffline(){
        company.waitForSpinner();
            String expectedtext = "Total of 1 unassigned/offline chargers are shown below.";
            String actualText = driver.findElement(By.xpath("//div[@class='ant-alert-message'][contains(.,'Total of 1 unassigned/offline chargers are shown below.')]")).getText();
            Assert.assertEquals(actualText, expectedtext);
            return true;
    }

    public boolean verifyErrorMessageIsShowingAfterRemovingLocation(){
        company.waitForSpinner();
        String expectedtext = "Location is required";
        String actualText = driver.findElement(By.xpath("//div[@role='alert'][contains(.,'Location is required')]")).getText();
        Assert.assertEquals(actualText, expectedtext);
        return true;
    }

    public boolean verifyLocationTitleonEditDrawerIsSameasLocationTitleOnChargerTable() {
        company.waitForSpinner();
        WebElement actualname=  driver.findElement(By.xpath("(//div[@class='wordBreak'])[7]"));
        WebElement expectedname=  driver.findElement(By.xpath("(//input[contains(@class,'ant-input')])[2]"));
        Assert.assertEquals(actualtitle,expectedtitle);
        System.out.println("Location title on edit drawer matches with the location title shown on the table :"+'\n' +actualname.getText()+ '\n' +expectedname.getText());
         return true;
    }

    public boolean verifyPropertyTitleonEditDrawerIsSameasPropertyTitleOnChargerTable() {
        company.waitForSpinner();
        WebElement actualname=  driver.findElement(By.xpath("(//div[@class='wordBreak'])[6]"));
        WebElement expectedname=  driver.findElement(By.xpath("(//div[@class='mt-5'])[2]"));
        Assert.assertEquals(actualtitle,expectedtitle);
        System.out.println("Property title on edit drawer matches with the Property title shown on the table :"+'\n' +actualname.getText()+ '\n' +expectedname.getText());
        return true;
    }

    public boolean verifyPropertyAddressonEditDrawerIsSameasPropertyAddressOnChargerTable() {
        company.waitForSpinner();
        WebElement tableaddress=  driver.findElement(By.xpath("(//div[@class='wordBreak'])[7]"));
        WebElement draweradress=  driver.findElement(By.xpath("(//div[@class='mt-5'])[3]"));
        Assert.assertEquals(actualtitle,expectedtitle);
        System.out.println("Property Address on the table matches with the Property Address on edit drawer :"+'\n' +tableaddress.getText()+ '\n' +draweradress.getText());
        return true;
    }

    public boolean verifyEditChargerDrawerHasClosed() throws InterruptedException {
        Thread.sleep(2000);
        try{
            WebElement locationdrawer= driver.findElement(By.xpath("//span[contains(@class,'drawerTitle')]"));
            if (!locationdrawer.isDisplayed()) {
                System.out.println("Verification Successful!!! Edit Charger Drawer is not Showing");

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful!!! Edit Charger Drawer is not Showing");

        }
        return true;
    }

    public boolean verifyNewTabHasOpenedAfterClickingonViewLocationLink() throws InterruptedException {
        company.waitForSpinner();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        System.out.println("Page title is : " + driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return true;
    }
}
