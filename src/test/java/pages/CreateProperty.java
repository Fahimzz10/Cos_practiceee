package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateProperty extends BasePage {
    public CreateProperty(WebDriver driver) {

        super(driver);
    }


    By createnewpropertyybtn = By.xpath("//button[contains(.,'Create New Property')]");
    By createpropertydrawer = By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Property')]");
    By createcompanybtn = By.xpath("//span[contains(.,'Create Company')]");
    By createentity = By.xpath("//span[contains(.,'Create Entity')]");
    By continuebtn = By.xpath("//button[@type='button'][contains(.,'Continue')]");
    By leavebtn = By.xpath("//button[contains(.,'Discard')]");
    By dropdown = By.xpath("(//input[@class='ant-select-selection-search-input'])[1]");
    By entitydropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]");
    By compnayname = By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[1]");
    By cname = By.xpath("(//div[@class='ant-select-item-option-content'])[2]");
    By ename = By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[12]");
    By entityname = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Unknown Entity')]");
    By propertyname = By.xpath("//input[contains(@placeholder,'Property Name')]");
    By equipmentfee = By.xpath("(//input[@placeholder='0'])[1]");
    By chargerfee = By.xpath("(//input[@placeholder='0'])[2]");
    By installationfee = By.xpath("(//input[@placeholder='0'])[3]");
    By flatbase = By.xpath("//span[contains(@title,'Flat Base')]");
    By percentagebase= By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Percentage Base')]");
    By sessionfee = By.xpath("(//input[@placeholder='0'])[4]");
    By sessionminimumfee = By.xpath("(//input[@placeholder='0'])[5]");
    By transactiondropdown = By.xpath("//span[contains(@title,'Flat Base')]");
    By hardwaredropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[5]");
    By otherproviderropdown = By.xpath("//input[@id='basic_otherProviders_0']");
    By hardwareprovidername = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Atom Power')]");
    By otherprovidername = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Johnnie Gibson')]");
    By providerropdown = By.xpath("//input[@id='basic_otherProviders_1']");
    By minusbtn = By.xpath("(//span[@aria-label='minus-circle'])[1]");
    By createbtn = By.xpath("//button[contains(.,'Create Property')]");
    By createpropertybtn = By.xpath("//button[contains(.,'Create Property')]");
    By savepropertybtn = By.xpath("//button[contains(.,'Save Property')]");
    By connectmoreproviderbtn = By.xpath("//button[contains(.,'Connect more provider')]");
    By proprtyerrmsg = By.xpath("//div[@role='alert'][contains(.,'Property Name is required')]");
    By blankzipcodeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Zip Code is required')]");
    By newpropertymsg = By.xpath("//span[contains(.,'Property created successfully')]");
    By equipmenterrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid equipment fee')]");
    By blankequipmenterrmsg = By.xpath("//div[@role='alert'][contains(.,'Equipment Fee is required')]");
    By chargererrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid per charger fee')]");
    By blankechargererrmsg = By.xpath("//div[@role='alert'][contains(.,'Per Charger Fee is required')]");
    By installaaitonfeeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid installation fee')]");
    By blankeinstallaationfeeererrmsg = By.xpath("//div[@role='alert'][contains(.,'Installation Fee is required')]");
    By chargersessionerrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid charging session fee')]");
    By blankechargersessionererrmsg = By.xpath("//div[@role='alert'][contains(.,'Charging Session Fee is required')]");
    By minimumfeeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid minimum fee')]");
    By blankeminimumfeeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Minimum Fee per session is required')]");
    By searchbar = By.xpath("//input[@placeholder='Search by property, entity and company name']");
    By unknowncompnay = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Unknown Company')]");
    By equipmentdropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[8]");
    By chargerfeedropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[9]");
    By installationfeedropdown = By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[10]");
    By onetimefee = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'One Time')]");
    By installationonetimefee = By.xpath("//div[@aria-selected='false'][contains(.,'One Time')]");
    By monthlyfee = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Monthly')]");
    By chargermonthlyfee = By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'Monthly')])[2]");
    By installationmonthlyfee = By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'Monthly')])[3]");
    By yearlyfee = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Yearly')]");
    By chargeryearlyfee = By.xpath("//div[@aria-selected='false'][contains(.,'Yearly')]");
    By installationyearlyfee = By.xpath("//div[@aria-selected='false'][contains(.,'Yearly')]");
    By imageerr = By.xpath("//div[@role='alert'][contains(.,'Maximum image size is 3 MB')]");

    CreateCompany company=new CreateCompany(driver);
    SearchCompany searchCompany= new SearchCompany(driver);

    public boolean clickonCreateNewPropertyButton() throws InterruptedException {
     //   company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(createnewpropertyybtn);
        click(createnewpropertyybtn);
        return true;
    }

    public boolean searchPropertyByName(String PropertyName) {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        company.waitForSpinner();
     //   waitelemtclickable(searchbar);
        waitVisibility(searchbar);
        click(searchbar);
        writeText(searchbar,PropertyName);
        return true;
    }

    public boolean clickonCreateCompanyLink() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(createcompanybtn);
        click(createcompanybtn);
        return true;
    }

    public boolean clickonCreateEntityLink() throws InterruptedException {
        waitVisibility(createentity);
        click(createentity);
        return true;
    }

    public boolean clickonContinueButton() throws InterruptedException {
        waitVisibility(continuebtn);
        click(continuebtn);
        return true;
    }

    public boolean selectFlatBaseFromTransactionFeeDropdown() throws InterruptedException {
        waitVisibility(flatbase);
        click(flatbase);
        return true;
    }

    public boolean selectpercentageBaseFromTransactionFeeDropdown() throws InterruptedException {
        waitVisibility(percentagebase);
        click(percentagebase);
        return true;
    }

    public boolean clickonLeaveButton() throws InterruptedException {

        waitVisibility(leavebtn);
        waitelemtclickable(leavebtn);
        click(leavebtn);
        return true;
    }

    public boolean clickonCompanyDropdown() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(4000);
        waitelementtobedisplayed(dropdown);
        waitelemtclickable(dropdown);
        click(dropdown);
        return true;
    }

    public boolean clickonTransactionFeeDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(transactiondropdown);
        click(transactiondropdown);
        return true;
    }

    public boolean clickonUnknownCompanyName() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(unknowncompnay);
        click(unknowncompnay);
        return true;
    }

    public boolean writeCompnayName(String CompanyName) throws InterruptedException {
        Thread.sleep(3000);
        writeText(dropdown,CompanyName);
        return true;
    }

    public boolean writePropertyName(String PropertyName) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(propertyname);
        writeText(propertyname, PropertyName);
        return true;
    }

    public boolean writeEntityName(String EntityName) throws InterruptedException {
        Thread.sleep(3000);
        writeText(entitydropdown,EntityName);
        return true;
    }

    public boolean clickonCompanyName() throws InterruptedException {
      //  company.waitForSpinner();
        Thread.sleep(3000);
        waitelementtobedisplayed(compnayname);
        waitVisibility(compnayname);
        click(compnayname);
        return true;
    }

    public boolean clickonCreatePropertyButton () throws InterruptedException {
        Thread.sleep(3000);
        waitelemtclickable(createpropertybtn);
        click(createpropertybtn);
        return true;
    }

    public boolean clickonSavePropertyButton () throws InterruptedException {
        Thread.sleep(3000);
        waitelemtclickable(savepropertybtn);
        click(savepropertybtn);
        return true;
    }

    public boolean enterEquimentFees(String EquipmentFee) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(equipmentfee);
        writeText(equipmentfee, EquipmentFee);
        return true;
    }

    public boolean clickChargerFeeFrequencyDropdown() throws InterruptedException {
        waitelementtobedisplayed(chargerfeedropdown);
        waitVisibility(chargerfeedropdown);
        click(chargerfeedropdown);
        return true;
    }

    public boolean clickEquipmentFeeFrequencyDropdown() throws InterruptedException {
        waitVisibility(equipmentdropdown);
        click(equipmentdropdown);
        return true;
    }

    public boolean clickInstallationFeeFrequencyDropdown() throws InterruptedException {
        waitVisibility(installationfeedropdown);
        click(installationfeedropdown);
        return true;
    }

    public boolean selectOneTimeFeefromEquipmentDropdown() throws InterruptedException {
        waitVisibility(onetimefee);
        click(onetimefee);
        return true;
    }

    public boolean selectOneTimeFeefromInstallationDropdown() throws InterruptedException {
        waitVisibility(installationonetimefee);
        click(installationonetimefee);
        return true;
    }

    public boolean selectMonthlyFeefromDropdown() throws InterruptedException {
        waitVisibility(monthlyfee);
        click(monthlyfee);
        return true;
    }

    public boolean selectMonthlyFeefromChargerFeeDropdown() throws InterruptedException {
        waitVisibility(chargermonthlyfee);
        click(chargermonthlyfee);
        return true;
    }

    public boolean selectMontlyFrequencyfromInstallationFeeDropdown() throws InterruptedException {
        waitVisibility(installationmonthlyfee);
        click(installationmonthlyfee);
        return true;
    }

    public boolean selectYearlyFrequencyfromEquipmentFee() throws InterruptedException {
        waitVisibility(yearlyfee);
        click(yearlyfee);
        return true;
    }

    public boolean selectYearlyFrequencyfromChargerFee() throws InterruptedException {
        waitelementtobedisplayed(chargeryearlyfee);
        click(chargeryearlyfee);
        return true;
    }

    public boolean selectYearlyFrequencyfromInstallationFee() throws InterruptedException {
        waitVisibility(installationyearlyfee);
        click(installationyearlyfee);
        return true;
    }

    public boolean enterInstallationFees(String InstallationFee) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(installationfee);
        writeText(installationfee, InstallationFee);
        return true;
    }

    public boolean enterSessionFees(String SessionFee) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(sessionfee);
        writeText(sessionfee, SessionFee);
        return true;
    }

    public boolean enterPerChargerFees(String ChargerFee) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(chargerfee);
        writeText(chargerfee, ChargerFee);
        return true;
    }

    public boolean enterSessionMinimumFees(String SessionMinimumFees) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(sessionminimumfee);
        writeText(sessionminimumfee, SessionMinimumFees);
        return true;
    }

    public boolean clickSelectEntityDropdown() throws InterruptedException {
        Thread.sleep(2000);
        waitelementtobeEnabled(entitydropdown);
        waitelemtclickable(entitydropdown);
        click(entitydropdown);
        return true;
    }

    public boolean clickHardwareProviderDropdown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(hardwaredropdown);
        click(hardwaredropdown);
        return true;
    }

    public boolean clickOtherProviderDropdown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(otherproviderropdown);
        click(otherproviderropdown);
        return true;
    }

    public boolean clickOnConnectWithOtherProviderDropdown() throws InterruptedException {
        waitVisibility(providerropdown);
        if (driver.findElement(By.xpath("//input[@id='basic_otherProviders_1']")).isDisplayed()) {
            click(providerropdown);
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean clickOnRemoveButton() throws InterruptedException {
        if (driver.findElement(By.xpath("(//span[@aria-label='minus-circle'])[1]")).isDisplayed()) {
            click(minusbtn);
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean selectCompanyNameFromSelectCompanyDropdown() throws InterruptedException {
        Thread.sleep(4000);
        waitelementtobedisplayed(cname);
      //  waitelemtclickable(cname);
        click(cname);
        return true;
    }

    public boolean selectEntityNameFromSelectEntityDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(ename);
        waitelemtclickable(ename);
        click(ename);
        return true;
    }

    public boolean selectUnknownEntityFromSelectEntityDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(entityname);
        click(entityname);
        return true;
    }

    public boolean selectHardwareProviderNameFromHardwareProviderDropdown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(hardwareprovidername);
        click(hardwareprovidername);
        return true;
    }

    public boolean selectOtherProviderNameFromDropdown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(otherprovidername);
        click(otherprovidername);
        return true;
    }

    public boolean clickOnConnectMoreProviderButton() throws InterruptedException {
        if (driver.findElement(By.xpath("//button[contains(.,'Connect more provider')]")).isDisplayed()) {
            click(connectmoreproviderbtn);
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }


    public boolean uploadImageMorethan2Mb() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String workingDir = System.getProperty("user.dir");
        Runtime.getRuntime().exec(workingDir + "\\resources\\picupload.exe");
        return true;
    }

    public boolean verifyCreateNewPropertyButtonHasDisplayed() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(createnewpropertyybtn);
        if (driver.findElement(By.xpath("//button[contains(.,'Create New Property')]")).isDisplayed()) {
            System.out.println("Create New Property button has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCreateNewPropertyyDrawerDisplayed() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Property')]")).isDisplayed()) {
            System.out.println("Create New Company Property Drawer has displayed");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyResponsiblePartiesInformationareShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("Select Company") && driver.getPageSource().contains("Select Entity")) {
            System.out.println("Verification Successful - Select Company and Select Entity Fields are Showing in Respondible Parties Section");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyPropertyformationareShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("Property Name")) {
            System.out.println("Verification Successful - Property name field is Showing in Property Information Section");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyConnectwitHardwareProviderFieldIsShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//input[@aria-activedescendant='rc_select_4_list_0']")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Hardware Provider Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyFlatBaseOptionIsShowinginTransactionFeeDropdown() {
        waitVisibility(transactiondropdown);
        if (driver.findElement(By.xpath("//span[contains(@title,'Flat Base')]")).isDisplayed()) {
            System.out.println("Verification Successful - Flat Base is Showing in Transaction Dropdown");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPercentageBaseOptionIsShowinginTransactionFeeDropdown() {
        //waitVisibility(transactiondropdown);
        if (driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Percentage Base')]")).isDisplayed()) {
            System.out.println("Verification Successful - Percentage Base is Showing in Transaction Dropdown");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyDollarSignisShowingWhenadminSelectsFlatBaseOptionFromTransactionFeeDropdown() {
        waitVisibility(transactiondropdown);
        if (driver.findElement(By.xpath("(//span[@class='ant-input-prefix'][contains(.,'$')])[4]")).isDisplayed()) {
            System.out.println("Verification Successful - Dollar $ sign is Showing After Selecting the Flat Base Option from dropdwon");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyPercentageSignisShowingWhenadminSelectsFlatBaseOptionFromTransactionFeeDropdown() {
        if (driver.findElement(By.xpath("(//span[@class='ant-input-prefix'][contains(.,'%')])[1]")).isDisplayed()) {
            System.out.println("Verification Successful - Percentage % sign is Showing After Selecting the Flat Base Option from dropdwon");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyConnectwitSiteFieldIsShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//input[@aria-activedescendant='rc_select_5_list_0']")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Site Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyConnectwiththeOtherProviderFieldIsShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//input[@aria-activedescendant='basic_otherProviders_0_list_0']")).isDisplayed()) {
            System.out.println("Verification Successful - Connect With Other Provider Field is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyCreatePropertyButtonIsShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//span[contains(.,'Create Property')]")).isDisplayed()) {
            System.out.println("Verification Successful - Save Property Button is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyContinueButtonisShowingonPopup() {
        waitelementtobedisplayed(continuebtn);
        if (driver.findElement(By.xpath("//button[contains(.,'Continue')]")).isDisplayed()) {
            System.out.println("Verification Successful - Continue Button is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyLeveButtonisShowingonPopup() {
        waitVisibility(leavebtn);
        if (driver.findElement(By.xpath("//button[contains(.,'Discard')]")).isDisplayed()) {
            System.out.println("Verification Successful - Continue Button is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifySelectEntityFieldisEnabledAfterSelectingCompany() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]")).isEnabled();
        System.out.println("Verification Successful!!!.Select Entity Field is Enabled");
        return true;
    }

    public boolean verifySelectEntityFieldIsDisabled() {
        WebElement selectentity= driver.findElement(By.xpath("(//input[contains(@class,'ant-select-selection-search-input')])[2]"));
        if(!selectentity.isEnabled())
        {
            System.out.println("Verification Successful!!!Select Entity Field is disabled!!");
            return true;
        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;

        }

    }

    public boolean VerifNoDatayisShowinginEntityDropdownAfterSelectingNewlyCreatedCompnay() throws InterruptedException {
        //waitVisibility(nodataimg);
        Thread.sleep(2000);
        if( driver.findElement(By.xpath("//div[@class='ant-empty-description'][contains(.,'No Data')]")).isDisplayed())
        {
            System.out.println("Verification Successful!! No Entity is showing ");
        }else{
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifySaveandCreateAnotherPropertyButtonIsShowingonCreateNewPropertDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//span[contains(.,'Save & Create Another Property')]")).isDisplayed()) {
            System.out.println("Verification Successful - Save and Create Another Property Button is Showing");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyCompanyNameIsShowingonIntheSelectCompanyDropdown() {
        waitVisibility(compnayname);
        if (driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'My Property Company')])[1]")).isDisplayed()) {
            System.out.println("Verification Successful - Newly Created Company is Showing in the Dropdown");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyPopuphasdisplayedafterClickingonCreateCompanyLink() throws InterruptedException {
        Thread.sleep(2000);
        WebElement text= driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'All unsaved information will be lost')]"));
        if (text.isDisplayed()) {
            System.out.println("Verification Successful - Popup Has Displayed. text on Popup is:"+ '\n' +text.getText());

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyFessInformationareShowinginFeesSectionofCreateNewDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("Property Fees") && driver.getPageSource().contains("Transaction Fees")) {
            System.out.println("Verification Successful - Property Fees and Transaction Fess Information are Showing in Fees Section of Create New Drawer");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyPropertyFessInformationareShowinginFeesSectionofCreateNewDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("Equipment Fee") && driver.getPageSource().contains("Per Charger Fee") && driver.getPageSource().contains("Installation Fee")) {
            System.out.println("Verification Successful - Property Fees Information are Showing in Fees Section of Create New Drawer");
            return true;
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyTransactionFessInformationareShowinginFeesSectionofCreateNewDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("Charging Session Fee") && driver.getPageSource().contains("Minimum Fee/ Session")) {
            System.out.println("Verification Successful - Transaction Fees Information are Showing in Fees Section of Create New Drawer");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyBrandInformationareShowingOnCreateNewDrawer() {
        waitVisibility(createpropertydrawer);
        if (driver.getPageSource().contains("For updating click on the logo.") && driver.getPageSource().contains("Company logo found by selecting company. You cannot update the logo")) {
            System.out.println("Verification Successful - Brand Information are Showing On Create New Drawer");

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyCreateCompanyOptionsisShowing() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//span[contains(.,'Create Company')]")).isDisplayed()) {
            System.out.println("Verification Successful - Create Company option is Showing");
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyBlankZipCodeErrorMessage(String expectedText) {
        assertEquals(blankzipcodeerrmsg, expectedText);
        return true;
    }

    public boolean verifyNewPropertyHasCreated(String expectedText) {
        assertEquals(newpropertymsg, expectedText);
        return true;
    }

    public boolean verifyCreateEntityOptionsisShowing() {
        waitVisibility(createpropertydrawer);
        if (driver.findElement(By.xpath("//span[contains(.,'Create Entity')]")).isDisplayed()) {
            System.out.println("Verification Successful - Create Entity option is Showing");
        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean verifyBlankPropertyErrorMessage(String expectedText) {
        try {
            assertEquals(proprtyerrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyStateFieldisDisabled() {
        WebElement State= driver.findElement(By.xpath("//input[@id='rc_select_2']"));
        if(!State.isEnabled())
        {
            System.out.println("State field is Empty and Disabled.");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPreviouslySelectedProviderNameisDisabled() {
        WebElement providername= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'Jenna Corwin')])[1]"));
        if(!providername.isEnabled())
        {
            System.out.println("Provider Name is Disabled.");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCityFieldisDisabled() {
        WebElement City= driver.findElement(By.xpath("//input[@placeholder='City']"));
        if(!City.isEnabled())
        {
            System.out.println("City Field is Empty and Disabled");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountryFieldisDisabled() {
        WebElement City= driver.findElement(By.xpath("//input[@id='rc_select_3']"));
        if(!City.isEnabled())
        {
            System.out.println("Country Field is Empty and Disabled");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyConnectWithSiteFieldisDisabled() {
        WebElement City= driver.findElement(By.xpath("//input[@id='rc_select_5']"));
        if(!City.isEnabled())
        {
            System.out.println("Connect With Site Field is Disabled");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCreateNewPropertyDrawerHasClosed() throws InterruptedException {
        Thread.sleep(2000);
        WebElement propertydrawer= driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Property')]"));
        if (!propertydrawer.isDisplayed()) {
            System.out.println("Create New Property Drawer has closed");
        } else {
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyNewlyCreatedPropertisShowingonPropertyPage() {
        company.waitForSpinner();
       // waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//div[contains(.,'My New Property')])[9]")).isDisplayed())
        {
            System.out.println("Newly Created property is Showing on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCompanywithOneTimeFrequencyFeeisShowingonPropertyPage() {
        company.waitForSpinner();
        // waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//td[contains(.,'One Time Fee Property')])[1]")).isDisplayed())
        {
            System.out.println("Property With the One Time Frequency Fee Has Been Created and Showing on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPropertywithYearlyFrequencyFeeisShowingonPropertyPage() {
        company.waitForSpinner();
        // waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//td[contains(.,'Property with Yearly Fee')])[1]")).isDisplayed())
        {
            System.out.println("Property With Yeaarly Frequency Fee Has Been Created and Showing on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUnknownCompanyisShowingUnderCompanyColumnonPropertyPage() {
        company.waitForSpinner();
        // waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//div[contains(.,'Unknown Company')])[10]")).isDisplayed())
        {
            System.out.println("Unknown Company is Showing in Company Column on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUnknownEntityisShowingUnderEntityColumnonPropertyPage() {
        if( driver.findElement(By.xpath("(//div[contains(.,'Unknown Entity')])[8]")).isDisplayed())
        {
            System.out.println("Unknown Entity is Showing in Entity Column on All properties Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifyEquipmantFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(equipmenterrmsg);
        assertEquals(equipmenterrmsg, expectedText);
        return true;
    }

    public boolean verifyBlankEquipmantFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(blankequipmenterrmsg);
        assertEquals(blankequipmenterrmsg, expectedText);
        return true;
    }

    public boolean verifyPerChargerFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(chargererrmsg);
        assertEquals(chargererrmsg, expectedText);
        return true;
    }

    public boolean verifyBlankPerChargerFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(blankechargererrmsg);
        assertEquals(blankechargererrmsg, expectedText);
        return true;
    }

    public boolean verifyInstallationFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(installaaitonfeeerrmsg);
        assertEquals(installaaitonfeeerrmsg, expectedText);
        return true;
    }

    public boolean verifyBlankPerInstallationFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(blankeinstallaationfeeererrmsg);
        assertEquals(blankeinstallaationfeeererrmsg, expectedText);
        return true;
    }

    public boolean verifyChargerSessionFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(chargersessionerrmsg);
        assertEquals(chargersessionerrmsg, expectedText);
        return true;
    }

    public boolean verifyBlankChargerSessionFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(blankechargersessionererrmsg);
        assertEquals(blankechargersessionererrmsg, expectedText);
        return true;
    }

    public boolean verifyMinimumSessionFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(minimumfeeerrmsg);
        assertEquals(minimumfeeerrmsg, expectedText);
        return true;
    }

    public boolean verifyBlankMinimumSessionFeerrorMessage(String expectedText) {
        waitelementtobedisplayed(blankeminimumfeeerrmsg);
        assertEquals(blankeminimumfeeerrmsg, expectedText);
        return true;
    }

    public boolean verifyErrorMessageisShowingAfterUploadingImageMorethan3Mb(String expectedText) {

            waitelementtobedisplayed(imageerr);
            assertEquals(imageerr, expectedText);
            return true;


    }


}
