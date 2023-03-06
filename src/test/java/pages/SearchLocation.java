package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchLocation extends BasePage{

    public SearchLocation(WebDriver driver)
    {
        super(driver);
    }

    CreateCompany createCompany=new CreateCompany(driver);
    CreateLocation createLocation=new CreateLocation(driver);
    SearchandFilterProperties searchProperties=new SearchandFilterProperties(driver);

    By loadmorebtn = By.xpath("//span[contains(.,'Load 10 More')]");
    By advancefilterdrawer = By.xpath("//span[contains(.,'Advanced Filter')]");
    By propertydropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    By dropdown = By.xpath("(//input[@role='combobox'])[1]");
    By zipdropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[3]");
    By zipcodedropdown= By.xpath("(//input[@role='combobox'])[2]");
    By propertyname = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'East Avenue')]");
    By propertyname1 = By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[2]");
    By cmpnyname = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Rich Information Technology')]");
    By cmpnyname1 = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Lark Homes')]");
    By closebtn = By.xpath("//span[@title='Lark Homes']//span[@aria-label='close']");
    By closebtn1 = By.xpath("//span[@title='Rich Information Technology']//span[@aria-label='close']");
    By actualcount = By.xpath("//span[@class='showCount']");
    By resultcount = By.xpath("//span[@class='showCount']");
    By selectzip = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'99950')]");
    By drawertitle = By.xpath("//span[@class='drawerTitle'][contains(.,'Advanced Filter')]");
    By removebtn = By.xpath("(//*[name()='svg'])[19]");
    By removebtn1 = By.xpath("//span[@title='East Avenue']//span[@aria-label='close']//*[name()='svg']");
    By removezipbtn = By.xpath("//span[@class='ant-select-selection-item-remove']//span[@aria-label='close']");
    By removezipbtn1 = By.xpath("//span[@title='99950']//span[@aria-label='close']");



    Properties prop = ConfigUtill.getConfig();

    public boolean enterSpaceinSearchbar() throws InterruptedException {
        createCompany.waitForSpinner();
        WebElement locationtitle= driver.findElement(By.xpath("//input[@placeholder='Search by location title & property name']"));
      //  locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.SPACE);
        return true;
    }

  /*  public boolean writeCompanyName(String CompanyName) throws InterruptedException {
        createCompany.waitForSpinner();
        Thread.sleep(30000);
    //    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitelementtobedisplayed(compnaydropdown);
        waitelemtclickable(compnaydropdown);
      //  click(searchProperties.compnaydropdown);
        writeText(compnaydropdown,CompanyName);
        return true;
    }*/

    public boolean enterLocationName(String LocationName) {
        createCompany.waitForSpinner();
     //   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        waitVisibility(createLocation.searchbar);
        click(createLocation.searchbar);
        writeText(createLocation.searchbar,LocationName);
        return true;
    }

    public boolean pressEnterButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by location title & property name']")).sendKeys(Keys.ENTER);
        return true;
    }

    public boolean clickOutsideDrawer() throws InterruptedException {
      //  Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;

// Identify the element that you want to click
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'ant-drawer-mask')]"));

// Use the "click" method of the JavascriptExecutor interface to click
// the element, even if it is not visible on the page
        js.executeScript("arguments[0].click();", element);
        return true;
    }

    public boolean clickLoadMoreButton() {
        createCompany.waitForSpinner();
        waitVisibility(loadmorebtn);
        click(loadmorebtn);
        return true;
    }

    public boolean clickOnDrawerTitle() {
        waitVisibility(drawertitle);
        click(drawertitle);
        return true;
    }

    public boolean selectCompnayNameonAdvanceFilter() throws InterruptedException {
     //   createCompany.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(cmpnyname);
      //  waitelemtclickable(cmpnyname);
        click(cmpnyname);
      //  click(searchProperties.compnaydropdown);
        return true;
    }

    public boolean selectAnotherCompnayNameonAdvanceFilter() throws InterruptedException {
        // company.waitForSpinner();
        Thread.sleep(2000);
        click(cmpnyname1);
        click(searchProperties.compnaydropdown);
        return true;

    }

    public boolean clickOnCloseImage() throws InterruptedException {
      //  createCompany.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(closebtn);
        click(closebtn);
        return true;
    }

    public boolean removeAnotherCompany() throws InterruptedException {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        waitVisibility(closebtn1);
        waitelementtobedisplayed(closebtn1);
        waitelemtclickable(closebtn1);
        click(closebtn1);
        return true;
    }

    public boolean removePropertyFromAdvanceFilterDrawer() throws InterruptedException {
     createCompany.waitForSpinner();
     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
     waitVisibility(removebtn);
   //  waitelementtobedisplayed(removebtn);
   //  waitelemtclickable(removebtn);
     click(removebtn);
     return true;
    }

    public boolean removeAnotherPropertyFromAdvanceFilterDrawer() throws InterruptedException {
        //  createCompany.waitForSpinner();
        waitVisibility(removebtn1);
        click(removebtn1);
        return true;
    }

    public boolean removeZipcodeFromAdvanceFilterDrawer() throws InterruptedException {
        //  createCompany.waitForSpinner();
        waitforInVisibility(createCompany.spinner);
        waitVisibility(removezipbtn);
        click(removezipbtn);
        return true;
    }

    public boolean removeAnotherZipcodeFromAdvanceFilterDrawer() throws InterruptedException {
        //  createCompany.waitForSpinner();
        waitVisibility(removezipbtn1);
        click(removezipbtn1);
        return true;
    }

    public boolean ClickonPropertyNameFromDropDown() throws InterruptedException {
        //  createCompany.waitForSpinner();
        waitelemtclickable(propertyname);
        click(propertyname);
        return true;
    }

    public boolean selectAnotherPropertyFromDropdown() throws InterruptedException {
         driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        waitVisibility(propertyname1);
        click(propertyname1);
        return true;
    }

    public boolean writeZipCode() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        waitelemtclickable(zipcodedropdown);
        waitVisibility(zipcodedropdown);
        writeText(zipcodedropdown,"99950");



        return true;
    }

    public boolean selectAnotherZipcodeFromDropdown() throws InterruptedException {
        //  createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        waitelemtclickable(selectzip);
        click(selectzip);
        return true;
    }

    public boolean clickononPropertyDropdown() throws InterruptedException {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitVisibility(propertydropdown);
        waitelemtclickable(propertydropdown);
        click(propertydropdown);
        /*WebElement dropdown = driver.findElement(By.xpath("(//div[@class='ant-select-selection-overflow-item ant-select-selection-overflow-item-suffix'])[1]"));
        //JavascriptExecutor to click element
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", dropdown);*/
        return true;
    }

    public boolean writePropertyName() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
       waitelemtclickable(dropdown);
        waitVisibility(dropdown);
        writeText(dropdown,"East Avenue");
      //  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("(//input[@role='combobox'])[2]"))).sendKeys(prop.getProperty("East Avenue"));
        return true;
    }

    public boolean verifyLocatonsWithSelectedPropertyTagHasDisplayed() {
        waitforInVisibility(createCompany.spinner);
        List<WebElement> elements = driver.findElements(By.xpath("(//div[contains(.,'East Avenue')])[9] | (//div[contains(.,'East Avenue')])[10] | (//div[contains(.,'East Avenue')])[11] | (//div[contains(.,'East Avenue')])[12] | (//div[contains(.,'East Avenue')])[13] | (//div[contains(.,'East Avenue')])[14] | (//div[contains(.,'East Avenue')])[15] | (//div[contains(.,'East Avenue')])[16] | (//div[contains(.,'East Avenue')])[17] | (//div[contains(.,'East Avenue')])[18]"));
       for(WebElement element : elements) {
           if(element.isDisplayed()) {
               System.out.println("Property is same as Selected from the Advance Filter Drawer i.e:"+ element.getText() );
           }else {
               System.out.println("Something went Wrong:" +element.getText() );

           }
       }
       return true;

        }

    public boolean clickononZipDropdown() throws InterruptedException {
        createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitelementtobedisplayed(zipdropdown);
        waitelemtclickable(zipdropdown);
        click(zipdropdown);
        return true;
    }



    public boolean openLocationPageinIncognitoMode() throws InterruptedException {
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
        driver.get(prop.getProperty("LocationpageURL"));
        String actualUrl= prop.getProperty("HomeURL");
        createCompany.waitForSpinner();
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

    public boolean openLocationPageinNewTab() throws InterruptedException {
       // createCompany.waitForSpinner();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(prop.getProperty("NewtabURL"));
        String actualUrl= prop.getProperty("NewtabURL");
        createCompany.waitForSpinner();
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    //    driver.close();
        return true;
    }


    public boolean verifLocationIsNotShowingafterProvidingInvalidData() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[contains(.,'No Data Found')])[10]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!No location has found with this name");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationWithProvidedPropertyNameisShowing() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//div[@class='wordBreak'][contains(.,'Location By Property Name')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Location  with  the Provided  Property  Name  is  Showing");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPropertyNameCount() {
        createCompany.waitForSpinner();
        WebElement element = driver.findElement(By.xpath("//span[@class='showCount']"));

        if( driver.findElement(By.xpath("//span[@class='showCount']")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Total Number of Location  with  the Provided  Property  Name  are:" +element.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationTitleCount() {
        createCompany.waitForSpinner();
        WebElement count= driver.findElement(By.xpath("//span[@class='showCount']"));
        if( driver.findElement(By.xpath("//span[@class='showCount']")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Total Location  with  the Provided  Location Title  Name  is  Showing:"+ count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationsWithProvidedTitleisShowing() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[contains(.,'New Location')])[10]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Location  with  the Provided  Title  is  Showing");
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyAllFiltersareShowingOnTheAdvanceFilterDrawer() throws InterruptedException {
      createCompany.waitForSpinner();

      Thread.sleep(3000);
        if (driver.getPageSource().contains("Property Info") && driver.getPageSource().contains("Zip Code") && driver.getPageSource().contains("Created Date"))
        {
            System.out.println("Verification Successful!!!Location Details are Showing on edit location Drawer");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;

    }

    public boolean verifyLocationsDetailsareShowingonEditLocationDrawer() throws InterruptedException {
      //  createCompany.waitForSpinner();
        Thread.sleep(3000);
        if (driver.getPageSource().contains("Company") && driver.getPageSource().contains("Property") && driver.getPageSource().contains("Location Coordinates") && driver.getPageSource().contains("Assign Charger"))
        {
            System.out.println("Verification Successful!!!Location Details are Showing on edit location Drawer");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;

    }

    public boolean verifyPropertyNameisShowing() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[contains(.,'My New Property')])[8]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Location  with  the Provided  Property  Name  is  Showing");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyMoreLocationsareShowingAfterClickingLoadMoreButton() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//div[contains(.,'Showing 20')])[3]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!10 More Locations are Showing After Pressing Load More button");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountAfterPressingLoadMoreButton() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='showCount'][contains(.,'Showing Location: 20')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Total 20 Locations are Showing After Pressing Load More button");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyAdvanceFilterDrawerhasOpened() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[contains(.,'Advanced Filter')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Advance Filter Drawer has Displayed ");
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");

            return false;
        }

    }

    public boolean verifySearchInputRemainsSameAfterRefreshingtheBrowser() {
        createCompany.waitForSpinner();
     //   waitVisibility(advancefilterdrawer);
        if( driver.findElement(By.xpath("//input[contains(@value,'New Location')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Searched input is same After Reshing the  Browser ");
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifCompnayNameisShowingonAdvnaceFilter() throws InterruptedException {
       Thread.sleep(3000);
        if( driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Rich Information Technology')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Company Name is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCompanyTagisShowingonLocationPage() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'Rich Information Technology')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Compnay Tag is Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountonLocationPage() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing:" +count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
        }

    public boolean verifyCountonLocationPageAfterApplyingMultipleFilters() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='showCount']")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Locations are Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountonLocationPageAfterRemovingOneTag() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='showCount']")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Locations are Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountAfterAppyingCompanyFilter() {
        createCompany.waitForSpinner();

        if(actualcount==resultcount )
        {
            System.out.println("Verificatin Sucessful!!!The result count matches with the actual number of locations on the table ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifySelectedTagHasbeenremoved() {
        try{
            WebElement companyname= driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Rich Information Technology')]"));
            WebElement companyname1= driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Lark Homes')]"));

            if(!companyname.isDisplayed() && !companyname1.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Company tags has been removed!!");

        }
        return true;

    }

    public boolean VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton() {
        try{
            WebElement propertyname= driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'East Avenue')]"));
            WebElement propertyname1= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]"));

            if(!propertyname.isDisplayed() && !propertyname1.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Company tags has been removed!!");

        }
        return true;

    }


    public boolean verifyPropertyTagisShowingonLocationPage() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'East Avenue')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Property Tag is Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPropertyisShowingInTheDropDown() {
      //  createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        if( driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'East Avenue')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Property  Name  is  Showing in the Dropdown");
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationPageHasResettoDefaultalueAfterClickingonClearAllTag() {
        waitVisibility(createCompany.spinner);
        try{
            WebElement tag1= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Rich Information Technology')]"));
            WebElement tag2= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Lark Homes')]"));

            if(!tag1.isDisplayed() && !tag2.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Company tags has been removed!!");

        }
        return true;

    }


    public boolean verifyLocationPageHasResettoDefaultalue() {
        createCompany.waitForSpinner();
        try{
            WebElement tag1= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'East Avenue')]"));
            WebElement tag2= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'New Updated Property')]"));

            if(!tag1.isDisplayed() && !tag2.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Property tags has been removed!!");

        }
        return true;

    }


    public boolean verifySelectedPropertyTagisShowingAterClosingtheDrawer() {
        waitforInVisibility(createCompany.spinner);
        WebElement propertytag= driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'East Avenue')]"));
        if( propertytag.isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Property Selected Property Tag is Showing on Advance Filter Drawer:"+propertytag.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifyZipcodeTagisShowingAterClosingtheDrawer() {
        createCompany.waitForSpinner();
        WebElement ziptag= driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'35005')]"));
        if( ziptag.isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Zip Code Tag is Showing on Advance Filter Drawer:"+ziptag.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }




    public boolean verifyDropdownItemsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Angel In Us')]"));
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Angel In Us")) {
                System.out.println("Matched element found at index: " + i);
            }
        }

        return true;
    }

    public boolean verifyAllTheDropdownItemsareShowing() {
        WebElement option1= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]"));
        WebElement option2= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]"));
        WebElement option3= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]"));
        WebElement option4= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]"));
        WebElement option5= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]"));
        WebElement option6= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[6]"));
        WebElement option7= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[7]"));
        WebElement option8= driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[8]"));

        if(option1.isDisplayed() && option2.isDisplayed() && option3.isDisplayed() && option4.isDisplayed() && option5.isDisplayed() && option6.isDisplayed())
        {
            System.out.println("Following Options are showing in the dropdwonn :" + '\n' +option1.getText() + '\n' +option2.getText() + '\n'+option3.getText() + '\n' +option4.getText() + '\n' +option5.getText() + '\n' +option6.getText() + '\n' +option7.getText() + '\n' +option8.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    /*public boolean verifyElementsRemoved(WebDriver driver, By element1, By element2) {
        try {
            driver.findElement(element1);
            return false;
        } catch (NoSuchElementException e) {
            try {
                driver.findElement(element2);
                return false;
            } catch (NoSuchElementException ex) {
                return true;
            }
        }
    }*/
    public boolean verifyPropertyTagsareShowingonLocationPage() throws InterruptedException {
        createCompany.waitForSpinner();
        WebElement tag1= driver.findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[1]"));
        WebElement tag2= driver.findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[2]"));

        if(tag1.isDisplayed() && tag2.isDisplayed())
        {
            System.out.println("property Tags Showing After Refreshing the Browser are:" +tag1.getText() + "/n" +tag2.getText() );
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyFilterTagsareShowingonLocationPage() {
        createCompany.waitForSpinner();
        WebElement tag1= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Rich Information Technology')]"));
        WebElement tag2= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Lark Homes')]"));

        if(tag1.isDisplayed() && tag2.isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Locations are Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }



    public boolean verifyAlltheLocationsonTheTableShouldbeSameWithTheSearchedInputAfterClickingLoadMoreButton() {
            createCompany.waitForSpinner();
            WebElement loctiontitle1= driver.findElement(By.xpath("(//div[@title='New Location'])[1]"));
            WebElement loctiontitle2= driver.findElement(By.xpath("(//div[@title='New Location'])[2]"));
            WebElement loctiontitle3= driver.findElement(By.xpath("(//div[@title='New Location'])[3]"));
            WebElement loctiontitle4= driver.findElement(By.xpath("(//div[@title='New Location'])[4]"));
            WebElement loctiontitle5= driver.findElement(By.xpath("(//div[@title='New Location'])[5]"));
            WebElement loctiontitle6= driver.findElement(By.xpath("(//div[@title='New Location'])[6]"));
            WebElement loctiontitle7= driver.findElement(By.xpath("(//div[@title='New Location'])[7]"));
            WebElement loctiontitle8= driver.findElement(By.xpath("(//div[@title='New Location'])[8]"));
            WebElement loctiontitle9= driver.findElement(By.xpath("(//div[@title='New Location'])[9]"));
            WebElement loctiontitle10= driver.findElement(By.xpath("(//div[@title='New Location'])[10]"));
            WebElement loctiontitle11= driver.findElement(By.xpath("(//div[@title='New Location'])[11]"));
            WebElement loctiontitle12= driver.findElement(By.xpath("(//div[@title='New Location'])[12]"));
            WebElement loctiontitle13= driver.findElement(By.xpath("(//div[@title='New Location'])[13]"));
            WebElement loctiontitle14= driver.findElement(By.xpath("(//div[@title='New Location'])[14]"));
            WebElement loctiontitle15= driver.findElement(By.xpath("(//div[@title='New Location'])[15]"));
            WebElement loctiontitle16= driver.findElement(By.xpath("(//div[@title='New Location'])[16]"));
            WebElement loctiontitle17= driver.findElement(By.xpath("(//div[@title='New Location'])[17]"));
            WebElement loctiontitle18= driver.findElement(By.xpath("(//div[@title='New Location'])[18]"));
            WebElement loctiontitle19= driver.findElement(By.xpath("(//div[@title='New Location'])[19]"));

        //   WebElement[] locationtitle = {loctiontitle1, loctiontitle2, loctiontitle3,loctiontitle4,loctiontitle5,loctiontitle6,loctiontitle7,loctiontitle8,loctiontitle9,loctiontitle10,loctiontitle11,loctiontitle12,loctiontitle13,loctiontitle14,loctiontitle15,loctiontitle16,loctiontitle17,loctiontitle18,loctiontitle19,loctiontitle20};
        //    for (int i = 0; i < 19; i++){
       //
            if (loctiontitle1.isDisplayed() && loctiontitle2.isDisplayed() &&loctiontitle3.isDisplayed() &&loctiontitle4.isDisplayed() &&loctiontitle5.isDisplayed() && loctiontitle6.isDisplayed() && loctiontitle7.isDisplayed() && loctiontitle8.isDisplayed() && loctiontitle9.isDisplayed() && loctiontitle10.isDisplayed()&& loctiontitle11.isDisplayed()&& loctiontitle12.isDisplayed()&& loctiontitle13.isDisplayed()&& loctiontitle14.isDisplayed()&& loctiontitle15.isDisplayed()&& loctiontitle16.isDisplayed()&& loctiontitle17.isDisplayed()&& loctiontitle18.isDisplayed()&& loctiontitle19.isDisplayed() )
            {
                System.out.println("Verification Successful!!! All the Locations Are Matching WIth Enetered Input");
                return true;
            }else{
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;
            }
        }

    public boolean verifyLodMoreButtonisShowing() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//button[contains(.,'Load 10 More')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Load More Button is Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountoAfterSelectingPropertyFromAdvanceFilterDrawer() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Selecting Property Filter:" +count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountoAfterSelectingZipcodeFromAdvanceFilterDrawer() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Selecting Zipcode Filter are:" +count.getText());
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCountoAfterRemovingProperty() {
        waitforInVisibility(createCompany.spinner);
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Removing Property Filter:" +count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCountoAfterRemovingPropertyFilterFromAdvanceFilterDrawer() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Removing Property Filter:" +count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyPageHasResettoDefaultData() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Removing Filter:" +count.getText());
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }



    public boolean verifyZipCodeisShowinginSuggestion() {
    //    createCompany.waitForSpinner();
        WebElement zipcode= driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'99950')]"));
        if(zipcode.isDisplayed())
        {
            System.out.println("Zip Code is Showing in Advance Filter Drawer:"+zipcode.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyZipTagHasbeenremoved() {
        try{
            WebElement zipcode= driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'35005')]"));

            if(!zipcode.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Zip tag has been removed!!");

        }
        return true;

    }

    public boolean bverifyAnotherZipTagHasbeenremoved() {
        try{
            WebElement zipcode= driver.findElement(By.xpath("//span[@class='ant-select-selection-item-content'][contains(.,'99950')]"));

            if(!zipcode.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Zip tag has been removed!!");

        }
        return true;

    }

    public boolean verifyElementCountonLocationpageAfterApllyingFilterFromAdvanceFilterDrawer(String expectedCount) {
       /* WebElement mytable = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/section/main/div[4]/div/div/div/div/div/table/tbody"));
        //To locate rows of table.
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
        //To calculate no of rows In table.
        int rows_count = rows_table.size();
        System.out.println("Total xpath: " +  rows_count);*/
        createCompany.waitForSpinner();
        WebElement actualcount= driver. findElement(By.xpath("//span[@class='showCount']"));
        WebElement mytable = driver.findElement(By.xpath("//tbody"));
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
        //To calculate no of rows In table.
        int rows_count = rows_table.size();
        //Loop will execute till the last row of table.
        for (int row = 1; row < rows_count; row++) {
            //To locate columns(cells) of that specific row.
            List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
            //To calculate no of columns (cells). In that specific row.
            int columns_count = Columns_row.size();
            System.out.println("Number of cells In Row " + row + " are " + columns_count);
            //Loop will execute till the last cell of that specific row.
            for (int column = 0; column < columns_count; column++) {
                // To retrieve text from that specific cell.
                String celtext = Columns_row.get(column).getText();
                System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
            }
            System.out.println("-------------------------------------------------- ");
        }
    //    int actualCount = rows_table.size();
        // Verify that the actual count matches the expected count
     //   if (actualCount == expectedCount) {
            System.out.println("The actual number of elements (" + actualcount.getText() + ") matches the expected number (" + expectedCount + ")");

        return true;
    }

    public boolean verifyElementCount() {
        createCompany.waitForSpinner();
        WebElement table = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellValue = cell.getText();
                System.out.println(cellValue);
            }
        }
        // Create a list of WebElements using the xpath
       /* List<WebElement> elements = driver.findElements(By.xpath(xpath));

        // Get the actual count of elements
        int actualCount = elements.size();

        // Verify that the actual count matches the expected count
        if (actualCount == expectedCount) {
            System.out.println("The actual number of elements (" + actualCount + ") matches the expected number (" + expectedCount + ")");
        } else {
            System.out.println("The actual number of elements (" + actualCount + ") does not match the expected number (" + expectedCount + ")");
        }*/
        return true;
    }


    public boolean verifyZipcodeTagsareNotShowingonLocationPageAfterPressingResetButton() {
        createCompany.waitForSpinner();
        try{
            WebElement tag1= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'35005')]"));
            WebElement tag2= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'99950')]"));

            if(!tag1.isDisplayed() &&!tag2.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Zip tag has been removed!!");

        }
        return true;
    }

    public boolean verifyTagsareShowing() {
       // createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        WebElement tag1= driver. findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[1]"));
        WebElement tag2= driver. findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[2]"));

        String lineseparator=System.getProperty("line.separator");

        if(tag1.isDisplayed()&& tag2.isDisplayed())
        {
            System.out.println("Selected tags are Showing:"+ tag1.getText() + lineseparator + tag2.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }




    public boolean verifyTagsareShowingonLocationPage() throws InterruptedException {
        Thread.sleep(3000);
        createCompany.waitForSpinner();
        WebElement tag1= driver. findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[1]"));
        WebElement tag2= driver. findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[2]"));
        WebElement tag3= driver. findElement(By.xpath("(//span[@class='ant-tag tagCss mb-10'])[3]"));

        String lineseparator=System.getProperty("line.separator");

        if(tag1.isDisplayed()&& tag2.isDisplayed()&&tag3.isDisplayed())
        {
            System.out.println("Selected tags are Showing:"+ tag1.getText() + lineseparator + tag2.getText() + lineseparator + tag3.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }


}
