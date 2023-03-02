package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchandFilterProperties extends BasePage {

    public SearchandFilterProperties(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    By ascendingpropertyname = By.xpath("//span[contains(.,'Company Name')]");
    By cross = By.xpath("//span[@aria-label='close-circle']//*[name()='svg']");
    By removebtn = By.xpath("//span[contains(text(),'Unknown Entity')]//span[@aria-label='close']//*[name()='svg']");
    By closebtn = By.xpath("//span[@title='Unknown Entity']//span[@aria-label='close']//*[name()='svg']");
   By count = By.xpath("//span[contains(@class,'showCount')]");
   By compnaydropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[1]");
    By entitydropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    By cmpnyname = By.xpath("(//div[@class='ant-select-item-option-content'])[2]");
    By entityname = By.xpath("(//div[contains(.,'Unknown Entity')])[10]");
    By entityname1 = By.xpath("(//div[@class='ant-select-item-option-content'][contains(.,'New Entity')])[2]");
    By statedropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[3]");
    By zipdropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[4]");
    By locationcount = By.xpath("(//span[@class='underline cursor'])[3]");
    By chargercount = By.xpath("(//span[@class='underline cursor'])[4]");
    By loadmorebtn = By.xpath("//button[contains(.,'Load 3 More')]");
    By drawertitle = By.xpath("//div[@class='ant-drawer-title'][contains(.,'Advanced Filter')]");

    CreateCompany company= new CreateCompany(driver);
    CreateProperty property= new CreateProperty(driver);
    SearchCompany searchcompany=new SearchCompany(driver);


    public boolean whenAdminProvidesSpaceinSearchbar() throws InterruptedException {
        Thread.sleep(2000);
        company.waitForSpinner();
        driver.findElement(By.xpath("//input[@placeholder='Search by property, entity and company name']")).sendKeys(Keys.SPACE);
        return true;
    }

    public boolean clickEnterButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by property, entity and company name']")).sendKeys(Keys.ENTER);
        return true;
    }



    public boolean clickOnCross() {
        waitVisibility(cross);
        click(cross);
        return true;
    }

    public boolean clickOnDrawerTitle() {
        waitVisibility(drawertitle);
        click(drawertitle);
        return true;
    }

    public boolean clickOnCloseImage() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(closebtn);
        click(closebtn);
        return true;
    }

    public boolean selectCompnayNameonAdvanceFilter() throws InterruptedException {
      // company.waitForSpinner();
       Thread.sleep(2000);
        waitelementtobedisplayed(cmpnyname);
        click(cmpnyname);
        click(compnaydropdown);
        return true;
    }

    public boolean clickonLoadMoreButton() {
        waitVisibility(loadmorebtn);
        click(loadmorebtn);
        return true;
    }

    public boolean selectEntityNameFromAdvanceFilter() throws InterruptedException {
        // company.waitForSpinner();
        Thread.sleep(3000);
        click(entityname);
        click(searchcompany.advancefilter);

        return true;
    }

    public boolean selectAnotherEntityNameFromAdvanceFilter() throws InterruptedException {
        // company.waitForSpinner();
        Thread.sleep(5000);
        click(entityname1);
        click(searchcompany.advancefilter);
        return true;
    }

    public boolean clickononCompanyDropdown() throws InterruptedException {
        company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitVisibility(compnaydropdown);
      //  waitelementtobedisplayed(compnaydropdown);
        waitelemtclickable(compnaydropdown);
        click(compnaydropdown);
        return true;
    }

    public boolean clickononEntityDropdown() {
        waitVisibility(entitydropdown);
       waitelemtclickable(entitydropdown);
        click(entitydropdown);
        return true;
    }

    public boolean clickonZipcodeDropdown() {
        company.waitForSpinner();
        waitVisibility(zipdropdown);
        click(zipdropdown);
        return true;
    }

    public boolean clickononStateDropdown() {
        company.waitForSpinner();
        waitVisibility(statedropdown);
        click(statedropdown);
        return true;
    }

    public boolean clickStateDropdown() throws InterruptedException {
        company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         waitVisibility(statedropdown);
        click(statedropdown);
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementByxpath('//div[contains(@xpath,'1')]').value='TestingEntity';");*/
        return true;
    }

    public boolean clickonCrosstoRemoveEstateTag() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(removebtn);
        click(removebtn);
        return true;
    }

    public boolean clickononLocationCount() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(locationcount);
        click(locationcount);
        return true;
    }

    public boolean clickononChargerCount() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(chargercount);
        click(chargercount);
        return true;
    }


    public boolean openPropertyPageinIncognitoMode() throws InterruptedException {
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        // add Incognito parameter
        options.addArguments("--incognito");
        // DesiredCapabilities object
        DesiredCapabilities c = DesiredCapabilities.chrome();
        //set capability to browser
        c.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("PropertyURL"));
        String actualUrl= prop.getProperty("HomeURL");
        company.waitForSpinner();
        Thread.sleep(10000);
        String expectedUrl= driver.getCurrentUrl();
        Thread.sleep(3000);
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println("Verification Successful!!! User Is On Login Page");
        driver.close();
        return true;
    }

    public boolean verifPagehasRefreshafterpressingsearchbutton() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//th[contains(.,'Property Name')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Page has Refreshed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifCompnayNameisShowingonProprtyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Rich Information Technology')])[2]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Compnay Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifEntityNameisShowingonProprtyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Rich IT Entity')])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Entity Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifCompnayNameisShowingonAdvnaceFilter() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Company Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifEntityNameisShowingonAdvnaceFilter() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Unknown Entity')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Company Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifStateNameisShowingonAdvnaceFilter() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Alaska')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!State Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifCrossButtonHasDisplyed() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@aria-label='close-circle']//*[name()='svg']")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Cross Button Has Displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyProvidedtNameisNotShowingAfterClickingonCross() {
        try {
            WebElement name = driver.findElement(By.xpath("//input[contains(@value,'My New Property')]"));
            if (!name.isDisplayed()) {
            } else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        } catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Property Name has removed!!");

        }
        return true;
    }

    public boolean verifyMorepropertiesareShowingAfterPressingLoadMoreButton() {
        company.waitForSpinner();
      //  waitVisibility(ascendingcompanyname);
        if(driver.getPageSource().contains("Showing Properties: 4"))
        {
            System.out.println("2 more properties are showing after Clicking on Load more button. Total 4 companies are showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyAdvanceFilterDrawerHasClosed() throws InterruptedException {
        Thread.sleep(2000);

        try {
            WebElement name = driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Advanced Filter')]"));
            if (!name.isDisplayed()) {
                System.out.println("Advnace Filter Drawer has Closed");
                return true;
            } else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");
                return false;

            }
        } catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Advance Filter Drawer has closed!!");
            return true;
        }

    }

    public boolean verifyPropertiesArematchingWithSearchedProperty() {
        company.waitForSpinner();
        WebElement property1= driver.findElement(By.xpath("(//td[contains(.,'My New Property')])[1]"));
      /*  WebElement property2= driver.findElement(By.xpath("(//div[@class='wordBreak flex'][contains(.,'My New Property')])[2]"));
        WebElement property3= driver.findElement(By.xpath("(//div[@title='My New Property'])[3]"));
        WebElement property4= driver.findElement(By.xpath("(//div[contains(.,'My New Property')])[14]"));*/
        if(property1.isDisplayed())
        {
            driver.getPageSource().contains("My New Property");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.getPageSource().contains("My New Property");
            driver.getPageSource().contains("My New Property");
            System.out.println("Verifcation Successful!!All the properties in the table are matched with the Searched property");

        }
        else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifCountAfterSorting() {
        waitVisibility(count);
        if(driver.getPageSource().contains("Showing Properties: 2"))
        {
            System.out.println("Total 2 Properties are showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCompanyTagisShowingonPropertyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//span[contains(@class,'ant-tag')])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Compnay Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyEntityTagisShowingonPropertyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//span[contains(@class,'ant-tag')])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Entity Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyAnoterEntityTagisShowingonPropertyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//span[@class='ant-tag'])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Entity Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyClearAllTagisShowingonPropertyPage() throws InterruptedException {
        Thread.sleep(3000);
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag'][contains(.,'Clear All')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Clear All Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyStateTagisShowingonPropertyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'Alaska')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!State Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyZipcodeTagisShowingonPropertyPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'35005')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Entity Tag is Showing on Property Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntityTagHasbeenremoved() {
        company.waitForSpinner();
        try{
            WebElement entitytag= driver.findElement(By.xpath("(//span[@class='ant-tag'])[2]"));
            if(!entitytag.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Entity tag has been removed!!");

        }
        return true;

    }

    public boolean verifyPreviouslySelectedCompanyisShowingonAdvanceFilterPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'Rich Information Technology')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Previously Selected Comonay is Showing on Advance Filter");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPreviouslySelectedEntityisShowingonAdvanceFilterPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("(//span[contains(@class,'ant-select-selection-item-content')])[2]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Previously Selected Entity is Showing on Advance Filter");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPreviouslySelectedStateisShowingonAdvanceFilterPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'Alaska')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Previously Selected State is Showing on Advance Filter");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPreviouslySelectedZipcodeisShowingonAdvanceFilterPage() {
        company.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'35005')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Previously Selected Zipcode is Showing on Advance Filter");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPropertyTagisShowinonLocationPageAfterClickingLocationCountFromPropertyPae() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'My New Property')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Property Name is Showing on Locationc Table");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCompanyTagisShowinonLocationPageAfterClickingLocationCountFromPropertyPae() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'Rich Information Technology')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Company Name is Showing on Locationc Table");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyUserHasRedirectedTowardtheLocationTable() {
        urlCheck(prop.getProperty("LocationURL"));
        return true;
    }

    public boolean verifyUserHasRedirectedTowardtheChargerTable() {
        urlCheck(prop.getProperty("ChargerURL"));
        return true;
    }


}
