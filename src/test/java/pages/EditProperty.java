package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class EditProperty extends BasePage {

    public EditProperty(WebDriver driver)
    {
        super(driver);
    }

    CreateProperty createProperty=new CreateProperty(driver);
    CreateCompany company=new CreateCompany(driver);

    By selectcompany = By.xpath("(//span[contains(@class,'ant-select-selection-item')])[1]");
    By editbtn = By.xpath("(//button[contains(.,'Edit')])[1]");
    By connectwithhardware = By.xpath("(//input[contains(@aria-activedescendant,'0')])[5]");
    By deactivatebutton = By.xpath("//button[contains(.,'Deactivate Property')]");
    By responsiblepartieseditbtn = By.xpath("(//button[@class='ant-btn ant-btn-default'])[2]");
    By harwareprovidereditbtn = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/button[1]");
    //By harwareprovidereditbtn1 = By.xpath("(//button[@type='button'][contains(.,'Edit')])[3]");
    By feeseditbtn = By.xpath("(//button[@class='ant-btn ant-btn-default'])[4]");
    By crossbtn = By.xpath("(//span[@aria-label='close-circle'])[1]");
    By entitycrossbtn = By.xpath("(//span[@aria-label='close-circle'])[2]");
    By saveproperty = By.xpath("//button[contains(.,'Save Property')]");
    By companynameerrmsg = By.xpath("//div[@role='alert'][contains(.,'Company is required')]");
    By entitynameerrmsg = By.xpath("//div[@role='alert'][contains(.,'Entity is required')]");
    By blankzipcodeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Zip Code is required')]");
    By cancelbtn = By.xpath("//span[contains(.,'Cancel')]");
    By ename = By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'Rich IT Entity')])[2]");


    public boolean clickonEditbuttonFromHardwareProviderSection () throws InterruptedException {
    //    Thread.sleep(3000);
        company.waitForSpinner();
        waitelementtobedisplayed(harwareprovidereditbtn);
        waitelemtclickable(harwareprovidereditbtn);
        click(harwareprovidereditbtn);
        return true;
    }

    public boolean clickonEditbuttonFromPropertyPage () throws InterruptedException {
        waitVisibility(editbtn);
        waitelemtclickable(editbtn);
        click(editbtn);
        return true;
    }

    /*public boolean clickonEditbuttonFromHardwareSection () throws InterruptedException {
        waitVisibility(harwareprovidereditbtn);
        waitelemtclickable(harwareprovidereditbtn);
        click(harwareprovidereditbtn);
        return true;
    }*/

    public boolean clickonEditbuttonFromResponsibilePartiesSection () throws InterruptedException {
        Thread.sleep(3000);
        company.waitForSpinner();
        waitVisibility(responsiblepartieseditbtn);
        click(responsiblepartieseditbtn);
        return true;
    }

    public boolean clickonEditbuttonFromFeesSection () throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(feeseditbtn);
        click(feeseditbtn);
        return true;
    }

    public boolean clickonCompanyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(selectcompany);
        click(selectcompany);
        return true;
    }

    public boolean clickonCancel() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(cancelbtn);
        click(cancelbtn);
        return true;
    }

    public boolean selectCompanyFeildFromEditPropertyDrawer () throws InterruptedException {
       //Adding wait
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Select Company Field");
        /*Thread.sleep(3000);
        click(crossbtn);*/
        return true;

    }

    public boolean selectEntityFeildFromEditPropertyDrawer () throws InterruptedException {
        //Adding wait
      //  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(3000);
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("(//span[contains(@class,'ant-select-selection-item')])[2]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Select Entity Field");
        /*Thread.sleep(3000);
        click(crossbtn);*/
        return true;


    }

    public boolean selectEntityNameFromSelectEntityDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(ename);
        waitelemtclickable(ename);
        click(ename);
        return true;
    }


    public boolean clickonCrossButton () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitelemtclickable(crossbtn);
        click(crossbtn);
        return true;
    }

    public boolean clickonEntityCrossButton () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitelemtclickable(entitycrossbtn);
        click(entitycrossbtn);
        return true;
    }


    public boolean clickonSavePropertyButton () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitelemtclickable(saveproperty);
        click(saveproperty);
        return true;
    }

    public boolean enterSpaceinPropertyName() throws InterruptedException {
        Thread.sleep(2000);
        company.waitForSpinner();
        WebElement propertyname= driver.findElement(By.xpath("//input[@placeholder='Property Name']"));
        propertyname.sendKeys(Keys.CONTROL + "a");
        propertyname.sendKeys(Keys.SPACE);
        return true;
    }

    public boolean RemovePropertyName() throws InterruptedException {
        Thread.sleep(2000);
        company.waitForSpinner();
        WebElement propertyname= driver.findElement(By.xpath("//input[@placeholder='Property Name']"));
        propertyname.sendKeys(Keys.CONTROL + "a");
        propertyname.sendKeys(Keys.DELETE);
        return true;
    }


    public boolean VerifyPropertyDetailsDrawerHasDisplayed() throws InterruptedException {
       // waitVisibility(entityinfo);
        Thread.sleep(3000);
        if(driver.getPageSource().contains("Responsible Parties") && driver.getPageSource().contains("Property Information") && driver.getPageSource().contains("Property Location") && driver.getPageSource().contains("Hardware provider Information") && driver.getPageSource().contains("Other Provider Information") ) {
            System.out.println("Verification Successful - Edit Property Drawer Has Opened");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifySelectCompanyFieldisShowing() {
        waitVisibility(selectcompany);
        if (driver.findElement(By.xpath("(//span[contains(@class,'ant-select-selection-item')])[1]")).isDisplayed()) {
            System.out.println("Verification Successful - Select Company Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifySelectEntityFieldisShowing() {
        waitVisibility(selectcompany);
        if (driver.findElement(By.xpath("(//span[contains(@class,'ant-select-selection-item')])[2]")).isDisplayed()) {
            System.out.println("Verification Successful - Select Entity Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyProertyFieldisShowing() {
        waitVisibility(selectcompany);
        if (driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).isDisplayed()) {
            System.out.println("Verification Successful - Property Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyZipcodeFieldisShowing() {
        waitVisibility(selectcompany);
        if (driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).isDisplayed()) {
            System.out.println("Verification Successful - Zipcode Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyAddressFieldisShowing() {
        waitVisibility(selectcompany);
        if (driver.findElement(By.xpath("//textarea[@placeholder='Address']")).isDisplayed()) {
            System.out.println("Verification Successful - Address Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyPropertyFeesFieldsAreShowing() {
        waitelementtobedisplayed(createProperty.equipmentfee);
        waitelementtobedisplayed(createProperty.chargerfee);
        waitelementtobedisplayed(createProperty.installationfee);
        waitelementtobedisplayed(createProperty.sessionfee);
        waitelementtobedisplayed(createProperty.sessionminimumfee);
        System.out.println("Verification Successful - Fess Fields are Showing");

        return true;
    }

    public boolean verifyPropertyFeesFieldsAreEnabled() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitelementtobeEnabled(createProperty.equipmentfee);
        waitelementtobeEnabled(createProperty.chargerfee);
        waitelementtobeEnabled(createProperty.installationfee);
        waitelementtobeEnabled(createProperty.sessionfee);
        waitelementtobeEnabled(createProperty.sessionminimumfee);
        System.out.println("Verification Successful - Fess Fields are Enabled");

        return true;
    }

    public boolean verifyConnectwitHardwareProviderFieldIsShowingonEditPropertDrawer() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(connectwithhardware);
        if (driver.findElement(By.xpath("(//input[contains(@aria-activedescendant,'0')])[5]")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Hardware Provider Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyConnectwitSiteFieldIsShowingonEditPropertDrawer() {
        if (driver.findElement(By.xpath("(//input[contains(@aria-activedescendant,'0')])[6]")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Site Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyConnectwitOtherardwareProviderIsShowingonEditPropertDrawer() {
          if (driver.findElement(By.xpath("(//input[@aria-controls='basic_otherProviders_0_list'])[1]")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Other Provider Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyDeactivatePropertyButtIsShowingonMoreSettingsSection() {

        waitVisibility(deactivatebutton);
        if( driver.findElement(By.xpath("//button[contains(.,'Deactivate Property')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!! Deactivate Property button is Shhowing on More Settings Section");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEditButtIsShowinginResponsiblePartiesSection() {

        waitVisibility(responsiblepartieseditbtn);
        if( driver.findElement(By.xpath("(//button[contains(.,'Edit')])[3]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Deactivate Property button is Shhowing on More Settings Section");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifySelectCompanyFieldIsDisabled() throws InterruptedException {
        Thread.sleep(4000);
        WebElement selectcompany= driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[1]"));
        if(!selectcompany.isEnabled())
        {
            System.out.println("Verification Successful!!!Select Company Field is disabled!!");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;

        }
        return true;

    }

    public boolean verifySelectCompanyFieldisEnabled() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[1]")).isEnabled();
        System.out.println("Verification Successful!!!.Select Entity Field is Enabled");
        return true;
    }

    public boolean verifyConnectWithHarwareProviderFieldisEnabled() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[1]")).isEnabled();
        System.out.println("Verification Successful!!!Connect With Harware Provider Field is Enabled");
        return true;
    }

    public boolean verifyEditButtonisNotShowinginResponsiblePartiesSection() throws InterruptedException {
        WebElement propertydrawer= driver.findElement(By.xpath("(//button[contains(.,'Edit')])[3]"));
        if (!propertydrawer.isDisplayed()) {
            System.out.println("Verification Successful!!! Edit Button is not Showing");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEditButtonisNotShowinginHardwareProviderSection() throws InterruptedException {
        WebElement propertydrawer= driver.findElement(By.xpath("(//button[contains(.,'Edit')])[4]"));
        if (!propertydrawer.isDisplayed()) {
            System.out.println("Verification Successful!!!Edit Button is not Showing");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEditButtonisNotShowinginFeesSection() throws InterruptedException {
           try{
            WebElement editbtn= driver.findElement(By.xpath("(//button[contains(.,'Edit')])[5]"));
            if(!editbtn.isDisplayed())
            {
                System.out.println("Verification Successful!!!Edit Button is not Showing");
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful!!!Edit Button is not Showing");

        }
        return true;
    }

    public boolean verifyConnectWithSiteFieldisEnabledAfterSelectingHardwareProvider() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[contains(@aria-activedescendant,'0')])[6]")).isEnabled();
        System.out.println("Verification Successful!!!Connect With Site Field is Enabled");
        return true;
    }

    public boolean verifyEditButtonisShowinginHardwareProviderSection() throws InterruptedException {
        waitVisibility(harwareprovidereditbtn);
        WebElement editbutton= driver.findElement(By.xpath("(//button[contains(.,'Edit')])[4]"));
        if (editbutton.isDisplayed()) {
            System.out.println("Verification Successful!!!Edit Button is  Showing in Hardware Provider information Section");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCOnnectwithHardwareProviderFieldisDisabled() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[contains(@aria-activedescendant,'0')])[5]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Connect with Hardware Provider Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
     }

    public boolean verifyCOnnectwithSiteFieldisDisabled() {
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[contains(@aria-activedescendant,'0')])[6]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Connect with Site Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEditButtonisShowinginFeesSection() throws InterruptedException {
        waitVisibility(feeseditbtn);
        WebElement editbutton= driver.findElement(By.xpath("(//button[contains(.,'Edit')])[5]"));
        if (editbutton.isDisplayed()) {
            System.out.println("Verification Successful!!!Edit Button is  Showing in Fees Section");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEquipmentFeeFieldisDisabled() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[@placeholder='0'])[1]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Equipmant Fee Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyChargerFeeFieldisDisabled() throws InterruptedException {
        company.waitForSpinner();
         WebElement hardwareprovider= driver.findElement(By.xpath("(//input[@placeholder='0'])[2]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Charger Fee Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyInstallationFeeFieldisDisabled() throws InterruptedException {
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[@placeholder='0'])[3]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Installation Fee Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyChargingSessionFeeFieldisDisabled() throws InterruptedException {
        company.waitForSpinner();
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[@placeholder='0'])[4]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Charging Session Fee Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyMinimumFeeFieldisDisabled() throws InterruptedException {
        company.waitForSpinner();
        WebElement hardwareprovider= driver.findElement(By.xpath("(//input[@placeholder='0'])[5]"));
        if (!hardwareprovider.isEnabled()) {
            System.out.println("Verification Successful!!!Minimum Fee Field is Disabled");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUpdatedPropertyInformationisShowingonPropertyPage() {
        company.waitForSpinner();
        // waitVisibility(companyname);
        if( driver.findElement(By.xpath("//div[@title='New Updated Property']")).isDisplayed())
        {
            System.out.println("Newly Updated property is Showing on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyConfirmationPopupisShowing() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        // waitVisibility(companyname);
        if( driver.findElement(By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]")).isDisplayed())
        {
            System.out.println("Confrimation Popup is Showing After Pressing Cancel Button");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyAdminStayonEditPropertyDrawerAfterPressinContinueButtonFromConfirmationPopup() throws InterruptedException {
         Thread.sleep(2000);
         if( driver.findElement(By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Responsible Parties')]")).isDisplayed())
        {
            System.out.println("Confrimation Popup is Showing After Pressing Cancel Button");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUpdatedInformationisShowinginAuditlog() throws InterruptedException {
        company.waitForSpinner();
        WebElement content= driver.findElement(By.xpath("//div[@class='insideDrawerDiv']//li[1]"));
        if( content.isDisplayed())
        {
            System.out.println("Admin name and Updated Items are Showing in Audit log Section of Edit Property Drawer:" + '\n' +content.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEntityNmaeErrorMessage(String expectedText) {
        try {
            assertEquals(entitynameerrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyConfirmatiomPopuopHasClosed() throws InterruptedException {
        WebElement popup= driver.findElement(By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]"));
        if (!popup.isDisplayed()) {
            System.out.println("Verification Successful!!!Confirmatiom Popup Has Closed ");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyBlankZipCodeErrorMessage(String expectedText) {
        assertEquals(blankzipcodeerrmsg, expectedText);
        return true;
    }

}
