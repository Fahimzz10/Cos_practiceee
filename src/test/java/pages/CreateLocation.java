package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CreateLocation extends BasePage {

    public CreateLocation(WebDriver driver)
    {
        super(driver);
    }

    CreateCompany createCompany=new CreateCompany(driver);
    RandomData rdata= new RandomData();

    By createlocationbtn = By.xpath("//button[contains(.,'Create New Location')]");
    By selectcompanydropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[1]");
    By selectpropertydropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]");
    By locationtitle = By.xpath("//textarea[@placeholder='Location Title']");
    By landmark = By.xpath("//textarea[@placeholder='Location landmark']");
    By locationmsg = By.xpath("//div[@class='locInfoText'][contains(.,'Customers will see this title when searching for a charging station')]");
    By locationlandmarkmsg = By.xpath("//div[@class='locInfoText'][contains(.,'For example, The location is just south of the front entrance. Etc. Use this area to give the first time users more context.')]");
    By locationcoordinatemsg = By.xpath("//div[@class='drawerInputTitle'][contains(.,'Confirm your location coordinates by using map')]");
    By confirmlocationbtn = By.xpath("//button[contains(.,'Confirm Location')]");
    By savelocationbtn = By.xpath("//button[contains(.,'Create Location')]");
    By createpropertylink = By.xpath("//span[contains(.,'Or, create a new property')]");
    By propertyname = By.xpath("(//div[@class='ant-select-item-option-content'])[11]");
    By locationtitlerrrms = By.xpath("//div[@role='alert'][contains(.,'Location Title is required')]");
    By locationlandmarkerrrmsg = By.xpath("//div[@role='alert'][contains(.,'Location Landmark is required')]");
    By coordinateerrrmsg = By.xpath("//span[contains(.,'Confirm the location first')]");
    By longitude = By.xpath("//input[@placeholder='Longitude']");
    By latitude = By.xpath("//input[@placeholder='Latitude']");
    By longitudelatitudeerrmsg = By.xpath("//input[@placeholder='Latitude']");
    By charger1 = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(.,'Space 5')]");
    By charger2 = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(.,'Space 3')]");
    By rightarrow = By.xpath("//span[@class='anticon anticon-right']");
    By leftarrow = By.xpath("//span[@aria-label='left']");
    By searchbar = By.xpath("//input[@placeholder='Search by location title & property name']");
    By unknownpropertyname = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Unknown Property')]");
    By editbtn = By.xpath("(//span[contains(.,'Edit')])[1]");



    public boolean clickonCreateNewLocationbutton () throws InterruptedException {
       Thread.sleep(3000);
        createCompany.waitForSpinner();
        waitVisibility(createlocationbtn);
        waitelementtobedisplayed(createlocationbtn);
        click(createlocationbtn);
        return true;
    }

 public boolean clickonCreateNewPropertyLink() throws InterruptedException {
     //   Thread.sleep(3000);
        waitVisibility(createpropertylink);
        waitelemtclickable(createpropertylink);
        click(createpropertylink);
        return true;
    }

    public boolean clickonPropertyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobeEnabled(selectpropertydropdown);
        waitelemtclickable(selectpropertydropdown);
        waitVisibility(selectpropertydropdown);
        click(selectpropertydropdown);
        return true;
    }

    public boolean ClickonEditbutton () throws InterruptedException {
        waitelemtclickable(editbtn);
        waitVisibility(editbtn);
        click(editbtn);
        return true;
    }

    public boolean clickonLocationSearchbar() throws InterruptedException {
        createCompany.waitForSpinner();
        //Thread.sleep(3000);
        waitelementtobedisplayed(searchbar);
        waitVisibility(searchbar);
        waitelemtclickable(searchbar);
        click(searchbar);
        return true;
    }

    public boolean WriteLcationName(String LocationName) {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitVisibility(searchbar);
        writeText(searchbar,LocationName);
        return true;
    }

    public boolean writePropertyName(String PropertyName) throws InterruptedException {
       Thread.sleep(5000);
        waitelementtobeEnabled(selectpropertydropdown);
       waitelementtobedisplayed(selectpropertydropdown);
        writeText(selectpropertydropdown,PropertyName);
        return true;
    }

    public boolean enterLocationLandmark(String Landmark) throws InterruptedException {
        waitVisibility(landmark);
      //  waitelementtobedisplayed(landmark);
       // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        writeText(landmark,Landmark);
        return true;
    }

    public boolean enterLocationTitle(String LocationTitle) throws InterruptedException {
    //    Thread.sleep(3000);
       // createCompany.waitForSpinner();
        waitVisibility(locationtitle);
     //   waitelementtobedisplayed(locationtitle);
      //  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        writeText(locationtitle,LocationTitle);
        return true;
    }

    public boolean enterSpaceinLocationTitle() throws InterruptedException {
        Thread.sleep(2000);
        WebElement locationtitle= driver.findElement(By.xpath("//textarea[@placeholder='Location Title']"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.SPACE);
        return true;
    }

    public boolean enterSpaceinLocationLandmark() throws InterruptedException {
        Thread.sleep(3000);
        WebElement locationtitle= driver.findElement(By.xpath("//textarea[@placeholder='Location landmark']"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.SPACE);
        return true;
    }


    public boolean clickOnPropertyName() throws InterruptedException {
       Thread.sleep(3000);
        waitVisibility(propertyname);
        waitelemtclickable(propertyname);
        click(propertyname);
        return true;
    }

    public boolean clickOnUnknownPropertyName() throws InterruptedException {
    //    Thread.sleep(3000);
        waitelementtobedisplayed(unknownpropertyname);
        waitelemtclickable(unknownpropertyname);
        click(unknownpropertyname);
        return true;
    }



    public boolean clickSaveLocationButton() throws InterruptedException {
        Thread.sleep(3000);
        //waitVisibility(savelocationbtn);
        //waitelemtclickable(savelocationbtn);
        click(savelocationbtn);
        return true;
    }

    public boolean clickConfirmLocationButton() throws InterruptedException {
        waitVisibility(confirmlocationbtn);
        waitelemtclickable(confirmlocationbtn);
        click(confirmlocationbtn);
        return true;
    }

    public boolean clickonRightSwapArrow() throws InterruptedException {
        waitVisibility(rightarrow);
        click(rightarrow);
        return true;
    }

    public boolean clickonLeftSwapArrow() throws InterruptedException {
        waitVisibility(leftarrow);
        click(leftarrow);
        return true;
    }

    public boolean RemoveLongitude() throws InterruptedException {
        Thread.sleep(2000);
        WebElement propertyname= driver.findElement(By.xpath("//input[@placeholder='Longitude']"));
        propertyname.sendKeys(Keys.CONTROL + "a");
        propertyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveLatitude() throws InterruptedException {
        Thread.sleep(2000);
        WebElement propertyname= driver.findElement(By.xpath("//input[@placeholder='Latitude']"));
        propertyname.sendKeys(Keys.CONTROL + "a");
        propertyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean enterLocationLongitude(String Longitude) throws InterruptedException {
       waitelementtobedisplayed(longitude);
        waitVisibility(longitude);
        writeText(longitude,Longitude);
        return true;
    }

    public boolean enterLocationLatitude(String Latitude) throws InterruptedException {
     //   Thread.sleep(3000);
        waitelementtobedisplayed(latitude);
       // waitVisibility(latitude);
        writeText(latitude,Latitude);
        return true;
    }

    public boolean SelectChargers() throws InterruptedException {
        waitVisibility(charger1);
        click(charger1);
        waitVisibility(charger2);
        click(charger2);
        return true;
    }


    public boolean verifyLocationTitleMessage(String expectedText) {
        createCompany.waitForSpinner();
        waitVisibility(locationmsg);
        assertEquals(locationmsg, expectedText);
        return true;
    }

    public boolean verifyLocationLandmarkMessage(String expectedText) {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitVisibility(locationlandmarkmsg);
        assertEquals(locationlandmarkmsg, expectedText);
        return true;
    }

    public boolean verifyLocationCoordinateMessage(String expectedText) {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitVisibility(locationcoordinatemsg);
        assertEquals(locationcoordinatemsg, expectedText);
        return true;
    }

    public boolean verifyCreateNewLocationButtonHasDisplayed() {
        createCompany.waitForSpinner();
        waitVisibility(createlocationbtn);
        waitelementtobeDisabled(createlocationbtn);
        if( driver.findElement(By.xpath("//button[contains(.,'Create New Location')]")).isDisplayed())
        {
            System.out.println("Create New Location button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCreateNewLocationDrawerHasDisplayed() {
        createCompany.waitForSpinner();
        if (driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Location')]")).isDisplayed()) {
            System.out.println("Create New Location Drawer has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifySelectCompanyFieldisShowing() {
        waitVisibility(selectcompanydropdown);
        if (driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[1]")).isDisplayed()) {
            System.out.println("Verification Successful - Select Company Field is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifySelectPropertyFieldisShowing() {
        waitVisibility(selectpropertydropdown);
        if (driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]")).isDisplayed()) {
            System.out.println("Verification Successful - Select Property Field is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCreateNewPropertyOptionsisShowing() {
        waitVisibility(selectpropertydropdown);
        if (driver.findElement(By.xpath("//span[contains(.,'Or, create a new property')]")).isDisplayed()) {
            System.out.println("Verification Successful - Create Property option is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLocationTitleFieldisShowing() {
        waitVisibility(locationtitle);
        if (driver.findElement(By.xpath("//textarea[@placeholder='Location Title']")).isDisplayed()) {
            System.out.println("Verification Successful - Location Title Field is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLocationMapisShowing() {
        waitVisibility(locationtitle);
        if (driver.findElement(By.xpath("//div[@aria-label='Map']")).isDisplayed()) {
            System.out.println("Verification Successful - Location Map is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLocationlandmarkFieldisShowing() throws InterruptedException {
        Thread.sleep(2000);
        //waitVisibility(landmark);
        if (driver.findElement(By.xpath("//textarea[@placeholder='Location Landmark']")).isDisplayed()) {
            System.out.println("Verification Successful - Location Landmark Field is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLatitudeFieldisShowing() {
        //waitVisibility(landmark);
        if (driver.findElement(By.xpath("//input[@placeholder='Latitude']")).isDisplayed()) {
            System.out.println("Verification Successful - Latitude Field is Showing in Location Coordinate Section");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLongitudeFieldisShowing() {
//        waitVisibility(landmark);
        if (driver.findElement(By.xpath("//input[@placeholder='Longitude']")).isDisplayed()) {
            System.out.println("Verification Successful - Longitude Field is Showing in Location Coordinate Section");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyConfirmLocationButtonisShowingandEnabled() {
        //waitVisibility(landmark);
        waitelementtobedisplayed(confirmlocationbtn);
        waitelementtobeEnabled(confirmlocationbtn);
        if (driver.findElement(By.xpath("//button[contains(.,'Confirm Location')]")).isDisplayed()) {
            System.out.println("Verification Successful - Confirm location Button is Showing and Enabled in Location Coordinate Section");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyUnassignedChargerSectionisShowing() {
      //  waitVisibility(landmark);
        if (driver.findElement(By.xpath("//span[contains(.,'Unassigned Chargers (0)')]")).isDisplayed()) {
            System.out.println("Verification Successful - Unassigned Chargers section is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyAssignedChargerSectionisShowing() {
        waitVisibility(landmark);
        if (driver.findElement(By.xpath("//span[@class='ant-transfer-list-header-title'][contains(.,'Assigned Chargers (0)')]")).isDisplayed()) {
            System.out.println("Verification Successful - Assigned Chargers section is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCreateLocationButtonisShowing() {
        waitVisibility(savelocationbtn);
        WebElement savelocation= driver.findElement(By.xpath("//button[contains(.,'Create Location')]"));
        if(savelocation.isDisplayed())
        {
            System.out.println("Save Location Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifySelectPropertyFieldIsDisabled() throws InterruptedException {
        Thread.sleep(4000);
        WebElement selectcompany= driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]"));
        if(!selectcompany.isEnabled())
        {
            System.out.println("Verification Successful!!!Select Property Field is disabled!!");
            return true;
        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;

        }


    }

    public boolean verifySelectPropertyFieldisEnabledAfterSelectingCompany() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]")).isEnabled();
        System.out.println("Verification Successful!!!.Select Property Field is Enabled");
        return true;
    }

    public boolean verifyPropertiesOptionIsShowing() {
        waitVisibility(landmark);
        if (driver.findElement(By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[11]")).isDisplayed()) {
            System.out.println("Verification Successful - Property Options are Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyPropertyNameIsShowingonIntheSelectPropertyDropdown() {
        waitVisibility(propertyname);
        if (driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Property From Location')]")).isDisplayed()) {
            System.out.println("Verification Successful - Newly Created Property is Showing in the Dropdown");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyPropertyAddressFieldisShowing() {
        waitVisibility(propertyname);
        if (driver.findElement(By.xpath("//div[@class='propertyAddress']")).isDisplayed()) {
            System.out.println("Verification Successful - Property Address is Showing After Selecting Property");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyAlertIsShowingWhenAdminDoesNotConfirmtheLocation() {
        waitVisibility(landmark);
        if (driver.findElement(By.xpath("//span[contains(.,'Confirm the location first')]")).isDisplayed()) {
            System.out.println("Verification Successful - Alert is Showing");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyErrorMessageisShowingAfterEnteringInvalidLongitudeandLatitude() {
        waitVisibility(longitudelatitudeerrmsg);
        WebElement latitudeerrmsg= driver.findElement(By.xpath("//div[@role='alert'][contains(.,'Provide a valid Latitude')]"));
        WebElement longitudeerrmsg= driver.findElement(By.xpath("//div[@role='alert'][contains(.,'Provide a valid Longitude')]"));
        if (latitudeerrmsg.isDisplayed() && longitudeerrmsg.isDisplayed()) {
            System.out.println("Verification Successful - Error Message is Showing after entering Invalid Longitude and Latitude:"+ latitudeerrmsg.getText()  + "/n" + longitudeerrmsg.getText());
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyConfirmLocationButtonisNotShowing() throws InterruptedException {
        WebElement propertydrawer= driver.findElement(By.xpath("//button[contains(.,'Confirm Location')]"));
        if (!propertydrawer.isDisplayed()) {
            System.out.println("Verification Successful!!! Confirm Location Button is not Showing");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUnassignedChargersHaveMovedtoAssignedChargerSection() throws InterruptedException {
        Thread.sleep(3000);
        if (driver.findElement(By.xpath("//span[contains(.,'Assigned Chargers (2)')]")).isDisplayed()) {
            System.out.println("Verification Successful - Unassigned Chargers are Showing in Assigned Chargers Section ");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCreateNewLocationDrawerHasClosed() throws InterruptedException {
        Thread.sleep(2000);
        WebElement locationdrawer= driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Location')]"));
        if (!locationdrawer.isDisplayed()) {
            System.out.println("Verification Successful!!! Create New Location Drawer is not Showing");

        } else {
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyUnknownPropertyisShowingAferSelectingUnknownCompany() {
        waitVisibility(landmark);
        if (driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Unknown Property')]")).isDisplayed()) {
            System.out.println("Verification Successful - Unknown Property is Showing Afer Selecting UnknownCompany ");
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUnknownPropertyisShowingUnderPropertyColumnonLocationsPage() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Unknown Property')])[1]")).isDisplayed())
        {
            System.out.println("Unknown Property is Showing in property Column on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyLocationTitleColumnisShowingonLocationsTable() {
        if( driver.findElement(By.xpath("//th[@class='ant-table-cell'][contains(.,'Location Title')]")).isDisplayed())
        {
            System.out.println("Location Title is Showing on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyChargersColumnisShowingonLocationsTable() {
        if( driver.findElement(By.xpath("//th[@class='ant-table-cell'][contains(.,'Chargers')]")).isDisplayed())
        {
            System.out.println("Chargers Column is Showing on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyactionsColumnisShowingonLocationsTable() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//th[contains(.,'Action')]")).isDisplayed())
        {
            System.out.println("Actiomnm Colmummnm is Showing on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifytheChrgerCountonLocationtableAfterAssigningUnassignedChargers() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='wordBreak'][contains(.,'2')]")).isDisplayed())
        {
            System.out.println("Charger Count is 2 on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyChrgerCountonisZero() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='wordBreak'][contains(.,'0')]")).isDisplayed())
        {
            System.out.println("Charger Count is 2 on Locations Page");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }


    public boolean verifyBlankLocationTitleErrorMessage(String expectedText) {
        waitelementtobedisplayed(locationtitlerrrms);
         assertEquals(locationtitlerrrms, expectedText);
          return true;

    }

    public boolean verifyLocationCoordinateErrorMessage(String expectedText) {
        try {
            waitVisibility(coordinateerrrmsg);
            assertEquals(coordinateerrrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
