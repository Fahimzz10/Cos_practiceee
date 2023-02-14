package pages;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class CreateEntity extends BasePage {

    public CreateEntity(WebDriver driver)
    {

        super(driver);
    }


    RandomData rdata = new RandomData();

    By createentitybtn = By.xpath("//button[contains(.,'Create New Entity')]");
    By enttitydrawer = By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Entity')]");
    By entityname = By.xpath("//input[@placeholder='Name']");
    By phone = By.xpath("//input[@placeholder='Phone Number']");
    By notes = By.xpath("//textarea[contains(@placeholder,'Note')]");
    By entityascompany = By.xpath("//div[@class='entityHeader'][contains(.,'Entity Same as a company?')]");
  //  By dropdown = By.xpath("//span[@class='ant-select-selection-item']");
    By selectcompany = By.xpath("(//div[@class='ant-select-item-option-content'])[5]");
    By companyname = By.id("rc_select_2");
    By dropdown = By.id("rc_select_0");
    By address = By.xpath("//input[contains(@placeholder,'Address')]");
    By savebtn = By.xpath("//button[contains(.,'Save Entity')]");
    By alertmsg = By.xpath("//div[@class='companySelectConfirmation'][contains(.,'The information below is populated by company-selected results')]");
    By entitynameerrmsg = By.xpath("//div[@role='alert'][contains(.,'Entity Name is required')]");
    By enttityname = By.xpath("(//div[contains(.,'New Entity')])[10]");
    By invalidemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email')]");
    By companyemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Company is required')]");
    By loader = By.xpath("(//i[@class='ant-spin-dot-item'])[3]");




    public boolean ClickonCreateEntitybutton () {
        waitforInVisibility(loader);
        waitelementtobedisplayed(createentitybtn);
        click(createentitybtn);
        return true;
    }

    public boolean waitforLoadertoLoadData () {
        waitforInVisibility(loader);
        return true;
    }

    public boolean ClickonSaveButton () throws InterruptedException {
        Thread.sleep(3000);
        waitelemtclickable(savebtn);
        click(savebtn);
        return true;
    }

    public boolean ClickoEntitysameasCompany () throws InterruptedException {
        waitVisibility(entityascompany);
        click(entityascompany);
        return true;
    }

    public boolean ClickonSelectCompanydropdownFromEntityDrawer () throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(dropdown);
        click(dropdown);
        return true;
    }

    public boolean WriteCompanyName(String CompanyName) throws InterruptedException {
       // WebElement ele= driver.findElement(By.id("rc_select_2"));
        waitVisibility(dropdown);
        click(dropdown);
        writeText(companyname,CompanyName);
        //ele.sendKeys("abcd");
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('rc_select_2').value='TestingEntity';");*/
        return true;
    }

    public boolean SelectCompanyNamefromDropdown() {
        waitVisibility(selectcompany);
        click(selectcompany);
        click(enttitydrawer);
        return true;
    }

    public boolean WriteEntityName(String EntityName) throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(entityname);
        writeText(entityname, EntityName);
        return true;
    }

    public boolean WriteEntityPhoneNumber(String Phone) {
        writeText(phone, Phone);
        return true;
    }

    public boolean EnterNotesinEntityInformation() {
        writeText(notes, rdata.RandomString());
        return true;
    }

    public boolean EnterAddress(String Address) throws InterruptedException {
        waitVisibility(address);
        waitelementtobedisplayed(address);
        writeText(address, Address);
        Thread.sleep(3000);
        return true;
    }

    public boolean VerifyCreateNewEntityButtonHasDisplayed() {
        waitVisibility(createentitybtn);
        if( driver.findElement(By.xpath("//span[contains(.,'Create New Entity')]")).isDisplayed())
        {
            System.out.println("Create New Entity button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntitySameasCompanyLinkisShowingonEntityInformationSection() {
        waitVisibility(enttitydrawer);
        if( driver.findElement(By.xpath("//span[contains(.,'Entity Same as a company')]")).isDisplayed())
        {
            System.out.println("Create New Entity button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean VerifyEnttityNmaeErrorMessage(String expectedText) {
        try {
            assertEquals(entitynameerrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean VerifyInvalidEmailErrorMessage(String expectedText) {
            waitVisibility(invalidemailerrmsg);
            assertEquals(invalidemailerrmsg, expectedText);
        return true;
    }

    public boolean verifyCompanyNameErrorMessage(String expectedText) {
        waitVisibility(companyemailerrmsg);
        assertEquals(companyemailerrmsg, expectedText);
        return true;
    }




    public boolean VerifyCreateNewEntityDrawerHasDisplayed() {
        waitVisibility(enttitydrawer);
        if( driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Entity')]")).isDisplayed())
        {
            System.out.println("Create New Entity drawer has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCreateNewEntityDrawerHasClosed() {
        waitVisibility(createentitybtn);
        WebElement drawer= driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Entity')]"));
        if( !drawer.isDisplayed())
        {
            System.out.println("Create New Entity drawer is closed. You are now on Entity Management page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntityNameisShowinginEntityTable() {
        waitVisibility(enttityname);
        WebElement entity= driver.findElement(By.xpath("(//div[contains(.,'New Entity')])[10]"));
        if( entity.isDisplayed())
        {
            System.out.println("Newly Created Entity is showing Entity Management page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntityInformationareShowingonCreateNewEntityDrawer() {
        waitVisibility(enttitydrawer);
        if(driver.getPageSource().contains("Company Name") && driver.getPageSource().contains("Phone") && driver.getPageSource().contains("Email") && driver.getPageSource().contains("Note") && driver.getPageSource().contains("EIN") ) {
            System.out.println("Verification Successful - Company Name,Phone,Email,Notes,EIN are Showing On Company Information Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer() {
        if(driver.getPageSource().contains("Zip Code") && driver.getPageSource().contains("State") && driver.getPageSource().contains("City") && driver.getPageSource().contains("Country")) {
            System.out.println("Verification Successful - Zip Code,State,City,Country are Showing On Company Location Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean VerifyStateFieldisDisabled() throws InterruptedException {
        Thread.sleep(3000);
        WebElement State= driver.findElement(By.xpath("//span[contains(@title,'Alaska')]"));
        if(!State.isEnabled())
        {
            System.out.println("State field is Disabled.");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCityFieldisDisabled() throws InterruptedException {
        Thread.sleep(3000);
        WebElement City= driver.findElement(By.xpath("//input[contains(@value,'Ketchikan')]"));
        if(!City.isEnabled())
        {
            System.out.println("City Field is Disabled");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCountryFieldisDisabled() throws InterruptedException {
        Thread.sleep(3000);
        WebElement City= driver.findElement(By.xpath("//span[@title='US']"));
        if(!City.isEnabled())
        {
            System.out.println("Country Field is Disabled");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyinputTypeisSerachOnCompanyInformationsectionOnCreateNewEntityDrawer() {
        waitVisibility(enttitydrawer);
        if( driver.findElement(By.xpath("//input[@type='search'][contains(@id,'2')]")).isDisplayed())
        {
            System.out.println("Create New Entity drawer has displayed and Empty ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyNoSugessuionISShowingAfterProvidingInvalidCompanyNameonEntitySameasCompanyDrawer() {
       // waitVisibility(enttitydrawer);
        if( driver.findElement(By.xpath("//div[@class='ant-empty-description'][contains(.,'No Data')]")).isDisplayed())
        {
            System.out.println("No Company with this name has found");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyinputFieldIsShowingForCompanyInformationOnCreateNewEntityDrawer() {
        waitVisibility(enttitydrawer);
        if( driver.findElement(By.xpath("//div[@class='drawerInputTitle'][contains(.,'*  Select Company')]")).isDisplayed())
        {
            System.out.println("Create New Entity drawer has displayed and Empty ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyAlertMessageisShowingAfterSelectingtheCopmayfromCompanyList() {
        waitVisibility(alertmsg);
        if( driver.findElement(By.xpath("//div[@class='companySelectConfirmation'][contains(.,'The information below is populated by company-selected results')]")).isDisplayed())
        {
            System.out.println("ALert Messagee has Displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

}
