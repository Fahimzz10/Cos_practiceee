package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateCompany extends BasePage {

    public CreateCompany(WebDriver driver)
    {
        super(driver);
    }


    RandomData rdata = new RandomData();

    By createcompanybtn = By.xpath("//button[contains(.,'Create New Company')]");
    By companyname = By.xpath("//input[@placeholder='Company Name']");
    By phone = By.xpath("//input[@placeholder='Phone']");
    By email = By.xpath("//input[@placeholder='Email']");
    By website = By.xpath("//input[@placeholder='Website']");
    By ein = By.xpath("//input[@placeholder='EIN']");
    By zipcode = By.xpath("//input[@placeholder='Zip Code']");
    By address = By.xpath("//textarea[contains(@placeholder,'Address')]");
    By savebtn = By.xpath("//button[contains(.,'Save Company')]");
    By crossbtn = By.xpath("//*[name()='path' and contains(@d,'M563.8 512')]");
    By companynameerrmsg = By.xpath("//div[@role='alert'][contains(.,'Company Name is required')]");
    By phoneerrormsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid Phone number')]");
    By invalidemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email address')]");
    By blankemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Email is required')]");
    By websiteerrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid Website')]");
    By einerrmsg = By.xpath("//div[@role='alert'][contains(.,'EIN is required')]");
    By zipcodeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid Zip Code')]");
    By blankzipcodeerrmsg = By.xpath("//div[@role='alert'][contains(.,'Zip code is required')]");
    By blankaddresseerrmsg = By.xpath("//div[@role='alert'][contains(.,'Address is required')]");
    By spinner = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div/span");




    public boolean ClickonCreateCompanybutton () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitforInVisibility(spinner);
        waitVisibility(createcompanybtn);
        click(createcompanybtn);

        return true;
    }

    public boolean waitForSpinner ()  {
      //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    //    waitforInVisibility(spinner);
        waitForElementNotVisible(20,driver,"//span[@class='ant-spin-dot ant-spin-dot-spin']");
     //   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
        return true;
    }

    public static String waitForElementNotVisible(int timeOutInSeconds, WebDriver driver, String elementXPath) {
        if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

            return "Wrong usage of WaitforElementNotVisible()";
        }
        try {
            (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.invisibilityOfElementLocated(By
                    .xpath(elementXPath)));
            return null;
        } catch (TimeoutException e) {
            return "Build your own errormessage...";
        }
    }

    public boolean ClickonSaveButton () throws InterruptedException {
       Thread.sleep(3000);
        waitelemtclickable(savebtn);
        click(savebtn);
        return true;
    }

    public boolean ClickonCrossbutton () throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(crossbtn);
        click(crossbtn);
        return true;
    }

    public boolean WriteCompanyName(String CompanyName) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(companyname);
        writeText(companyname, CompanyName);
        return true;
    }

    public boolean WriteCompanyPhoneNumber(String Phone) {
        writeText(phone, Phone);
        return true;
    }

    public boolean WriteCompanyEmail(String Email) {
        waitVisibility(email);
        clear(email);
        writeText(email, Email);
        return true;
    }

    public boolean WriteRandomCompanyEmail() {
        waitVisibility(email);
        clear(email);
        writeText(email, rdata.RandomEmail());
        return true;
    }

    public boolean WriteRandomCompanyAddress() {
        waitVisibility(address);
        writeText(address, rdata.Randomaddress());
        return true;
    }

    public boolean WriteRandomEINNumber() {
        waitVisibility(ein);
        clear(ein);
        writeText(ein, rdata.generateRandomNumber(9));
        return true;
    }

    public boolean EnterCompanyWebsite(String Website) {
        writeText(website, Website);
        return true;
    }

    public boolean EnterEINNumber(String EIN) {
        waitVisibility(ein);
        writeText(ein, EIN);
        return true;
    }

    public boolean EnterZipCode(String ZipCode) throws InterruptedException {
        waitelementtobedisplayed(zipcode);
        writeText(zipcode, ZipCode);
        Thread.sleep(2000);
        return true;
    }

    public boolean EnterAddress(String Address) throws InterruptedException {
        waitVisibility(address);
        waitelementtobedisplayed(address);
        writeText(address, Address);
        Thread.sleep(3000);
        return true;
    }

    public boolean VerifyCompanyNmaeErrorMessage(String expectedText) {
        waitelementtobedisplayed(companynameerrmsg);
        assertEquals(companynameerrmsg, expectedText);
            return true;

    }

    public boolean VerifyPhoneNumberErrorMessage(String expectedText) {
        waitelementtobedisplayed(phoneerrormsg);
            assertEquals(phoneerrormsg, expectedText);
            return true;

    }

    public boolean VerifyInvalidEmailErrorMessage(String expectedText) {
        waitelementtobedisplayed(invalidemailerrmsg);
        assertEquals(invalidemailerrmsg, expectedText);
        return true;
    }

    public boolean VerifyBlankEmailErrorMessage(String expectedText) {

            waitelementtobedisplayed(blankemailerrmsg);
            assertEquals(blankemailerrmsg, expectedText);
            return true;

    }

    public boolean VerifyInvalidWebsiteErrorMessage(String expectedText) {
        waitelementtobedisplayed(websiteerrmsg);
         assertEquals(websiteerrmsg, expectedText);
            return true;

    }

    public boolean VerifyInvalidEINNumberErrorMessage(String expectedText) {
            waitelementtobedisplayed(einerrmsg);
            assertEquals(einerrmsg, expectedText);
            System.out.println("EIN error message has displayed");
            return true;
        }


    public boolean VerifyInvalidZipCodeErrorMessage(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(zipcodeerrmsg);
        waitVisibility(zipcodeerrmsg);
        assertEquals(zipcodeerrmsg, expectedText);
        return true;

    }

    public boolean VerifyBlankZipCodeErrorMessage(String expectedText) throws InterruptedException {
       Thread.sleep(3000);
        waitelementtobedisplayed(blankzipcodeerrmsg);
        assertEquals(blankzipcodeerrmsg, expectedText);
            return true;
    }

    public boolean VerifyBlankAddressErrorMessage(String expectedText) {
        waitelementtobedisplayed(blankaddresseerrmsg);
        assertEquals(blankaddresseerrmsg, expectedText);
       return true;
    }



    public boolean VerifyCreateNewCompanyButtonHasDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(createcompanybtn);
        if( driver.findElement(By.xpath("//button[contains(.,'Create New Company')]")).isDisplayed())
        {
            System.out.println("Create New Company button has displayed");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean VerifyCreateNewCompanyDrawerDisplayed() {
        waitVisibility(createcompanybtn);
        if( driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Create New Company')]")).isDisplayed())
        {
            System.out.println("Create New Company drawer has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCompanyInformationareShowingonCreateNewCompanyDrawer() throws InterruptedException {
        waitForSpinner();
        Thread.sleep(3000);
        if(driver.getPageSource().contains("Company Name") && driver.getPageSource().contains("Phone") && driver.getPageSource().contains("Email") && driver.getPageSource().contains("Website") && driver.getPageSource().contains("EIN") ) {
            System.out.println("Verification Successful - Company Name,Phone,Email,Website,EIN are Showing On Company Information Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer() {
        waitForSpinner();
        if(driver.getPageSource().contains("Zip Code") && driver.getPageSource().contains("State") && driver.getPageSource().contains("City") && driver.getPageSource().contains("Country")) {
            System.out.println("Verification Successful - Zip Code,State,City,Country are Showing On Company Location Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean VerifyUploadButtonisShowing() {
        if( driver.findElement(By.xpath("//span[@tabindex='0'][contains(.,'Upload')]")).isDisplayed())
        {
            System.out.println("Upload Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCancelButtonsisShowing() {
        WebElement Cancelbtn= driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        if(Cancelbtn.isDisplayed())
        {
            System.out.println("Cancel Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifySaveCompanyButtonsareShowingonCreateCompanyDrawer() {
        WebElement Savebtn= driver.findElement(By.xpath("//span[contains(.,'Save Company')]"));
        if(Savebtn.isDisplayed())
        {
            System.out.println("Save Company Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCreateCompanyDrawerHasClosedfterpressingtheSaveButton() {
        try{
            WebElement crossbtn= driver.findElement(By.xpath("//span[@aria-label='close']//*[name()='svg']"));
            if(!crossbtn.isDisplayed())
            {
                System.out.println("Verification Successful.Create Company Drawer has closed!!");
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            }
        }catch (NoSuchElementException e) {
            System.out.println("You are on add company listing page");

        }
        return true;
    }

    public boolean VerifyBrandInformationareShowingonCreateNewCompanyDrawer() {
        if(driver.getPageSource().contains("Max limit 2 MB. Upload 300x40 px size logo for proper viewing experience.") ) {
            System.out.println("Verification Successful - Brand Information is Showing On Company Location Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

}
