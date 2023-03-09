package pages;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class EditLocation extends BasePage{

      public EditLocation(WebDriver driver)
    {
        super(driver);
    }

    By deactivatebutton = By.xpath("//button[contains(.,'Deactivate Location')]");
    By propertyeditbtn = By.xpath("//button[@class='propertyEditBtn cursor']");
    By editbtn = By.xpath("(//span[contains(.,'Edit')])[1]");
    By detailsbtn = By.xpath("(//span[contains(.,'Details')])[2]");
    By companydropdown = By.xpath("(//span[contains(@class,'ant-select-selection-item')])[1]");
    By propertydropdown = By.xpath("(//span[contains(@class,'ant-select-selection-item')])[2]");
    By togglebtn = By.xpath("//button[@role='switch']");
    By Alert = By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]");

    CreateCompany createCompany= new CreateCompany(driver);
    CreateLocation createLocation=new CreateLocation(driver);

    public boolean clickonEditbuttonFromPropertyInfoSection () throws InterruptedException {
        createCompany.waitForSpinner();
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitVisibility(propertyeditbtn);
        waitelemtclickable(propertyeditbtn);
        click(propertyeditbtn);
        return true;
    }

    public boolean clickonDetailsButton () throws InterruptedException {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        // waitelementtobedisplayed(editcompanybtn);
        //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[contains(.,'Edit')])[2]")));
        click(editbtn);
        return true;
    }

    public boolean clickonEditbutton () throws InterruptedException {
        createCompany.waitForSpinner();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitVisibility(editbtn);
        click(editbtn);
        return true;
    }

    public boolean clickonToggleButton () throws InterruptedException {
         Thread.sleep(3000);
        createCompany.waitForSpinner();
        //   waitelementtobedisplayed(propertyeditbtn);
        waitelemtclickable(togglebtn);
        click(togglebtn);
        return true;
    }

    public boolean clickonCompanyDropdown() throws InterruptedException {
     // createCompany.waitForSpinner();
        waitelementtobedisplayed(companydropdown);
        waitelemtclickable(companydropdown);
        click(companydropdown);
        return true;
    }

    public boolean clickonPropertyDropdown() throws InterruptedException {
        waitelementtobedisplayed(propertydropdown);
        waitelemtclickable(propertydropdown);
        click(propertydropdown);
        return true;
    }

    public boolean writePropertyName(String PropertyName) throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(propertydropdown);
        writeText(propertydropdown,PropertyName);
        return true;
    }

    public boolean removeLocationTitile () throws InterruptedException {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        waitVisibility(createLocation.locationtitle);
       /* driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
        clear(createLocation.locationtitle);*/
        WebElement locationtitle= driver.findElement(By.xpath("//textarea[@placeholder='Location Title']"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean removeLocationLandmark () throws InterruptedException {
     //   createCompany.waitForSpinner();
      //  waitelementtobedisplayed(createLocation.locationtitle);
       /* driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
        clear(createLocation.locationtitle);*/
        WebElement locationtitle= driver.findElement(By.xpath("//textarea[@placeholder='Location Landmark']"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.DELETE);

        return true;
    }

    public boolean removeLocationFromSearchBar() throws InterruptedException {
        Thread.sleep(2000);
        WebElement locationtitle= driver.findElement(By.xpath("//input[contains(@placeholder,'Search by location title & property name')]"));
        locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean verifyLocationInformationareShowing() {
        createCompany.waitForSpinner();
        if(driver.getPageSource().contains("Property Info") && driver.getPageSource().contains("Location Details") && driver.getPageSource().contains("Location Coordinates") && driver.getPageSource().contains("Assign Charger")) {
            System.out.println("Verification Successful - Location Details Drawer has Opened");
        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyToggleButtonisOn() {
     //   createCompany.waitForSpinner();
        WebElement toggleButton = driver.findElement(By.xpath("//button[@role='switch']"));
        if (toggleButton.isEnabled()) {
            System.out.println("Toggle button is enabled");
            return true;
        } else {
            System.out.println("Toggle button is disabled");
            return false;
        }

    }

    public boolean verifyStatusisActive() {
        waitforInVisibility(createCompany.spinner);
        WebElement locationstatus = driver.findElement(By.xpath("(//div[contains(@class,'mt-5')])[2]"));
        if( driver.findElement(By.xpath("(//div[contains(@class,'mt-5')])[2] ")).isDisplayed())
        {
            System.out.println("Location Status is :" +locationstatus.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifDeactivateLocationButtonIsShowing() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//button[contains(.,'Deactivate Location')]")).isDisplayed())
        {
            System.out.println("Deactivate Loation button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUpdatedLocationNameIsShowing() {
        createCompany.waitForSpinner();
        WebElement locationame= driver.findElement(By.xpath("(//div[contains(@class,' flex')])[3]"));
        if( locationame.isDisplayed())
        {
            System.out.println("Updated Location Name is Showing:"+locationame.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyAssignedChargerSectionIsShowingEmpty() throws InterruptedException {
        Thread.sleep(2000);
        WebElement assigncharger= driver.findElement(By.xpath("//span[contains(.,'Assigned Chargers (0)')]"));
        if( assigncharger.isDisplayed())
        {
            System.out.println("No Charger is Showing in Assigned Charger Section:"+assigncharger.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyALertisShowingAfterPressingCancelButton() throws InterruptedException {
        Thread.sleep(2000);
        waitelementtobedisplayed(Alert);
        WebElement alert= driver.findElement(By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]"));
        if( alert.isDisplayed())
        {
            System.out.println("Popup Alert Has Displayed:"+alert.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyChargersareShowinginUnassignedChrgerSection() {
        WebElement option1= driver.findElement(By.xpath("(//span[@class='ant-transfer-list-content-item-text'])[1]"));
        WebElement option2= driver.findElement(By.xpath("(//span[@class='ant-transfer-list-content-item-text'])[2]"));
        WebElement option3= driver.findElement(By.xpath("(//span[@class='ant-transfer-list-content-item-text'])[3]"));
        WebElement option4= driver.findElement(By.xpath("(//span[@class='ant-transfer-list-content-item-text'])[4]"));


        if(option1.isDisplayed() && option2.isDisplayed() && option3.isDisplayed() && option4.isDisplayed())
        {
            System.out.println("Following Options are showing in the Unassigned Chargers Section :" +option1.getText() + '\n' +option2.getText() + '\n'+option3.getText() + '\n' +option4.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyContinueandDiscardButtonsareShowinOnConfirmationPopup() {
        WebElement discardbtn= driver.findElement(By.xpath("//button[contains(.,'Discard')]"));
        WebElement continuebtn= driver.findElement(By.xpath("//button[contains(.,'Continue')]"));

        if(discardbtn.isDisplayed() && continuebtn.isDisplayed() )
        {
            System.out.println("Discard and Continue Buttons are Showin On Confirmation Popup");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifyErrorMessageIsNotShowingAfterEnteringInvalidLongitudeandLatitude() {
        try{
            WebElement latitudeerrmsg= driver.findElement(By.xpath("//div[@role='alert'][contains(.,'Provide a valid Latitude')]"));
            WebElement longitudeerrmsg= driver.findElement(By.xpath("//div[@role='alert'][contains(.,'Provide a valid Longitude')]"));

            if(!latitudeerrmsg.isDisplayed() &&!longitudeerrmsg.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Error Message Is Not Showing!!");

        }
        return true;
    }

    public boolean verifyEditDetailsButtonHasDisplayed() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//span[contains(.,'Edit')])[2]")).isDisplayed())
        {
            System.out.println("Edit button has displayed");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyEditLocationDrawerHasClosed() throws InterruptedException {
        Thread.sleep(2000);
        try{
            WebElement locationdrawer= driver.findElement(By.xpath("//span[contains(@class,'drawerTitle')]"));
            if (!locationdrawer.isDisplayed()) {
                System.out.println("Verification Successful!!! Edit Location Drawer is not Showing");

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Company tags has been removed!!");

        }
        return true;
    }

    public boolean verifyToggleButtonHasDisabled() {
        try{
            WebElement toggleButton = driver.findElement(By.xpath("//button[@role='switch']"));
            if (!toggleButton.isEnabled()) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Toggle button has Set to Offline!!");

        }
        return true;
    }

    public boolean verifyConfirmationPopupHasClosed() throws InterruptedException {
          try{
            WebElement confirmationpopup= driver.findElement(By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]"));
            if (!confirmationpopup.isDisplayed()) {
                System.out.println("Verification Successful!!! Confirmation Popup Has Closed ");

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Company tags has been removed!!");

        }
        return true;
    }


}
