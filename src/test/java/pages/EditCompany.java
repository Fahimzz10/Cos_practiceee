package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class EditCompany extends BasePage {

    public EditCompany(WebDriver driver)
    {
        super(driver);
    }


    CreateCompany company = new CreateCompany(driver);
    CreateEntity createEntity=new CreateEntity(driver);

    By editcompanybtn = By.xpath("(//span[contains(.,'Edit')])[2]");
    By activestatus = By.xpath("//div[@class='mt-5'][contains(.,'Active')]");
    By deactivatebutton = By.xpath("//span[contains(.,'Deactivate Company')]");
    By auditlogs = By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Audit Log')]");
    By loadmorebtn = By.xpath("//li[contains(@class,'ant-timeline-item ant-timeline-item-last ant-timeline-item-left')]");
    By invalidemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email address')]");
    By uploadbtn = By.xpath("//span[@class='ant-upload']");
    By invalidimesionerrmsg = By.xpath("//div[@role='alert'][contains(.,'Image resolution should be 300x40 px')]");
    By searchbar = By.xpath("//input[@placeholder='Search by name, email or phone no']");
    By searchbtn = By.xpath("//button[contains(.,'Search')]");
    By companyname = By.xpath("(//div[@class='wordBreak'][contains(.,'Walmart')])[1]");
    By cancelbtn = By.xpath("//button[@type='button'][contains(.,'Cancel')]");
    By discardbtn = By.xpath("//button[contains(.,'Discard')]");





    public boolean ClickonEditbutton () throws InterruptedException {
        company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(06, TimeUnit.SECONDS);
      // waitelementtobedisplayed(editcompanybtn);
        //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[contains(.,'Edit')])[2]")));
        click(editcompanybtn);
        return true;
    }

    public boolean ClickonUploadButton() {
        waitVisibility(uploadbtn);
        click(uploadbtn);
        return true;
    }

    public boolean SearchbyName(String CompanyName) {
        company.waitForSpinner();
        waitVisibility(searchbar);
        click(searchbar);
        writeText(searchbar,CompanyName);
        return true;
    }

    public boolean ClickCancelbutton () {
        waitVisibility(cancelbtn);
        click(cancelbtn);
        return true;
    }

    public boolean ClickonSearchButton() {
     //   company.waitForSpinner();
        waitelemtclickable(searchbtn);
      //  waitelementtobedisplayed(searchbtn);
        click(searchbtn);
        return true;
    }



    public boolean ClickonDiscardButton() {
        waitVisibility(discardbtn);
        click(discardbtn);
        return true;
    }

    public boolean updateLogoUsingInvalidDimension() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String workingDir = System.getProperty("user.dir");
        Runtime.getRuntime().exec(workingDir + "\\resources\\UploadImage.exe");
        return true;
    }


    public boolean ClearCompanyNameFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.companyname);
        WebElement companyname= driver.findElement(By.xpath("//input[@placeholder='Company Name']"));
       /* driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        clear(company.companyname);*/
        companyname.sendKeys(Keys.CONTROL + "a");
        companyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemovePhoneNumberFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.phone);
        WebElement phonenumber= driver.findElement(By.xpath("//input[@placeholder='Phone']"));
       /* driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        clear(company.companyname);*/
        phonenumber.sendKeys(Keys.CONTROL + "a");
        phonenumber.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEmailFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.email);
        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys(Keys.CONTROL + "a");
        driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        email.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        return true;
    }

    public boolean RemoveWebsiteFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.website);
        WebElement web= driver.findElement(By.xpath("//input[@placeholder='Website']"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEINFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.ein);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("(//input[contains(@class,'ant-input')])[5]"));
       // driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        //Thread.sleep(2000);
        return true;
    }


    public boolean RemoveZipcodeFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.zipcode);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveAddressFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.address);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address')]"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }



    public boolean VerifyEditButtonHasDisplayed() {
        company.waitForSpinner();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if( driver.findElement(By.xpath("(//button[contains(.,'Edit')])[2]")).isDisplayed())
        {
            System.out.println("Edit button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifCompanyStatusisActiveonMoreSettingsSection() {
        waitVisibility(activestatus);
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Active')]")).isDisplayed())
        {
            System.out.println("Company Status is Showing on Edit Company Drawer");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifDeactivateCompanyButtonIsShowingonMoreSettingsSection() {
        waitVisibility(deactivatebutton);
        if( driver.findElement(By.xpath("//span[contains(.,'Deactivate Company')]")).isDisplayed())
        {
            System.out.println("Deactivate Company button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifAuditLogsareShowingonEditComapnyDrawer() {
        waitVisibility(auditlogs);
        if( driver.findElement(By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Audit Log')]")).isDisplayed())
        {
            System.out.println("Audit log section is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifLoadmoreButtonisShowingonAuditLogsofEditComapnyDrawer() {
        waitVisibility(loadmorebtn);
        if( driver.findElement(By.xpath("//li[contains(@class,'ant-timeline-item ant-timeline-item-last ant-timeline-item-left')]")).isDisplayed())
        {
            System.out.println("Load more button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifUpdatedCompanyInformationIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Walmart')])[1]")).isDisplayed())
        {
            System.out.println("Updated Company Name has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEditCompanyDrawerisShowing() throws InterruptedException {
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Company Information')]")).isDisplayed())
        {
            System.out.println("Edit Company Drawer has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyDiscardButtonisShowingonConfirmationPopup() {
        waitVisibility(discardbtn);
        if( driver.findElement(By.xpath("//button[contains(.,'Discard')]")).isDisplayed())
        {
            System.out.println("Discard Button Is Showing on Confirmation Popup.Clicking on it...");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean VerifyInvalidEmailErrorMessage(String expectedText) {

            assertEquals(invalidemailerrmsg, expectedText);
            return true;


    }

    public boolean VerifyInvalidImageDimesionErrorMessage(String expectedText) {
        try {
            waitVisibility(invalidimesionerrmsg);
            assertEquals(invalidimesionerrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }




}



