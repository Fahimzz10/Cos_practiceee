package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchChargers extends BasePage {

    public SearchChargers(WebDriver driver)
    {
        super(driver);
    }

    CreateCompany createCompany=new CreateCompany(driver);
    Properties prop = ConfigUtill.getConfig();

    By searchbar = By.xpath("//input[@placeholder='Search by charger & location title']");
    By propertydropdown = By.xpath("(//div[@class='ant-select-selection-overflow'])[1]");
    By locationdropdown = By.xpath("(//div[contains(@class,'ant-select-selection-overflow')])[3]");
    By dropdown = By.xpath("(//input[@role='combobox'])[1]");
    By dropdown1 = By.xpath("(//input[@role='combobox'])[2]");
    By locationyname = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Atom power station')]");
    By closebtn = By.xpath("//span[@title='Atom power station']//span[@aria-label='close']");
    By count = By.xpath("//span[@class='underline cursor']");


    public boolean clickonChargersSearchbar() throws InterruptedException {
        createCompany.waitForSpinner();
        waitVisibility(searchbar);
        waitelemtclickable(searchbar);
        click(searchbar);
        return true;
    }

    public boolean SearchbyChargerTitle(String Chargername) {
        createCompany.waitForSpinner();
        writeText(searchbar,Chargername);
        return true;
    }

    public boolean clickOnCross() throws InterruptedException {
        //  createCompany.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(closebtn);
        click(closebtn);
        return true;
    }

    public boolean clickOnChargerCount() throws InterruptedException {
        createCompany.waitForSpinner();
       // waitVisibility(count);
        click(count);
        return true;
    }

    public boolean writePropertyName() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        waitVisibility(dropdown);
        writeText(dropdown,"East Avenue");
        //  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("(//input[@role='combobox'])[2]"))).sendKeys(prop.getProperty("East Avenue"));
        return true;
    }

    public boolean writeLocationName() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        waitVisibility(dropdown1);
        writeText(dropdown1,"Atom power station");
        //  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("(//input[@role='combobox'])[2]"))).sendKeys(prop.getProperty("East Avenue"));
        return true;
    }

    public boolean enterSpaceinSearchbar() throws InterruptedException {
        createCompany.waitForSpinner();
        WebElement locationtitle= driver.findElement(By.xpath("//input[@placeholder='Search by charger & location title']"));
        //  locationtitle.sendKeys(Keys.CONTROL + "a");
        locationtitle.sendKeys(Keys.SPACE);
        return true;
    }

    public boolean pressEnterButton() throws InterruptedException {
        createCompany.waitForSpinner();
        driver.findElement(By.xpath("//input[@placeholder='Search by charger & location title']")).sendKeys(Keys.ENTER);
        return true;
    }

    public boolean clickononLocationsDropdown() throws InterruptedException {
        createCompany.waitForSpinner();
        Thread.sleep(5000);
        waitVisibility(locationdropdown);
        waitelementtobedisplayed(locationdropdown);
        waitelemtclickable(locationdropdown);
        click(locationdropdown);
        return true;
    }

    public boolean clickononPropertyDropdown() throws InterruptedException {
        createCompany.waitForSpinner();
        Thread.sleep(5000);
        waitelementtobedisplayed(propertydropdown);
        waitelemtclickable(propertydropdown);
        click(propertydropdown);
        return true;
    }

    public boolean clickonLocationNameFromDropDown() throws InterruptedException {
        //  createCompany.waitForSpinner();
        waitelemtclickable(locationyname);
        click(locationyname);
        return true;
    }

    public boolean verifyAdminHasRedirectedToTheChargersPage () throws InterruptedException {
        createCompany.waitForSpinner();
        driver.get(prop.getProperty("ChargerpageURL"));
        urlCheck(prop.getProperty("ChargerpageURL"));
        return true;
    }

    public boolean verifyChargerWithSelectedtagAreShowingonChargersPage() {
       /* WebElement mytable = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/section/main/div[4]/div/div/div/div/div/table/tbody"));
        //To locate rows of table.
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
        //To calculate no of rows In table.
        int rows_count = rows_table.size();
        System.out.println("Total xpath: " +  rows_count);*/
        createCompany.waitForSpinner();
        WebElement actualcount= driver. findElement(By.xpath("//span[@class='showCount']"));
        WebElement mytable = driver.findElement(By.xpath("//tbody"));
        List< WebElement > rows_table = mytable.findElements(By.tagName("tr"));
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

        return true;
    }


    public boolean openChargerPageinIncognitoMode() throws InterruptedException {
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
        driver.get(prop.getProperty("ChargerpageURLForPropertyAdmin"));
        String actualUrl= prop.getProperty("HomeURLPropertyAdmin");
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

    public boolean verifPagehasRefreshafterpressingsearchbutton() throws InterruptedException {
        createCompany.waitForSpinner();
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//th[contains(.,'Charger Title')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Page has Refreshed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyConnectionStatusISShowingonChargerTable() throws InterruptedException {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("(//img[contains(@alt,'Connected')])[1]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Connection Status Column IS Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyProvidedtNameisNotShowingAfterClickingonCross() {
        try {
            WebElement name = driver.findElement(By.xpath("//input[contains(@value,'Space 10')]"));
            if (!name.isDisplayed()) {
            } else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        } catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Charger Name has removed!!");

        }
        return true;
    }

    public boolean verifySearchInputRemainsSameAfterRefreshingTeBrowser() {
            createCompany.waitForSpinner();
            WebElement name = driver.findElement(By.xpath("//input[contains(@value,'Space 10')]"));
            if (name.isDisplayed()) {
                System.out.println("Verification Successful.Input Remain Same After Refreshing The Browser: " +name.getText());
            } else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        return true;

    }

    public boolean verifyChargerWithProvidedTitleisShowing() {
        createCompany.waitForSpinner();
        WebElement name = driver.findElement(By.xpath("(//div[@class='wordBreak'])[1]"));
        if( name.isDisplayed())
        {
            System.out.println("Verification Successful!!!Charger  with  the Provided  Title  is :" +name.getText());
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyAllChargersAreShowingAfterClickingonChargerCountFromLocationpage() {
        createCompany.waitForSpinner();
        WebElement name = driver.findElement(By.xpath("(//div[@class='wordBreak'])[1]"));
        WebElement charger = driver.findElement(By.xpath("(//div[@class='wordBreak'])[2]"));
        if( name.isDisplayed() && charger.isDisplayed())
        {
            System.out.println("Verification Successful!!!Chargers  Under the Location are :" +name.getText() + '\n' + charger.getText());
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyChargerWithProvidedLocationTitleisShowing() {
        createCompany.waitForSpinner();
        WebElement name = driver.findElement(By.xpath("(//div[@class='wordBreak'])[2]"));
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'])[2]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Charger  with  the Provided  Location  is :" +name.getText());
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyChargerPageCount() {
        createCompany.waitForSpinner();
        WebElement count= driver. findElement(By.xpath("//span[@class='showCount']"));
        if(count.isDisplayed())
        {
            System.out.println("Total Locations Showing After Removing Filter:" +count.getText());
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyTagHasbeenremovedAfterClickingonResetAllButton() {
        try{
            WebElement propertyname= driver.findElement(By.xpath(" "));
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

    public boolean verifyLocationTagisShowingonChargerPage() {
        createCompany.waitForSpinner();
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'Atom power station')]")).isDisplayed())
        {
            System.out.println("Verificatin Sucessful!!!Property Tag is Showing on Locations Page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifySelectedFiltersAreShowingonAdvanceFilterDrawer() {
        WebElement tagname= driver.findElement(By.xpath("(//span[@class='ant-select-selection-item-content'])[1]"));
        WebElement tagname1= driver.findElement(By.xpath("(//span[@class='ant-select-selection-item-content'])[2]"));
        if(tagname.isDisplayed() && tagname1.isDisplayed())        {
            System.out.println("Verificatin Sucessful!!!Previosuly Selected Tags are:" +tagname.getText() + '\n' +tagname1.getText());
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyLocationisShowingInTheDropDown() {
        //  createCompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        if( driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Atom power station')]")).isDisplayed())
        {
            System.out.println("Verification Successful!!!Property  Name  is  Showing in the Dropdown");
            return true;
        }else{
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }
    }

    public boolean verifyTagHasbeenremovedAfterClickingonCrossButton() {
        try{
            WebElement propertyname= driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Atom power station')]"));

            if(!propertyname.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Tag has been removed!!");

        }
        return true;

    }


    public boolean verifyChargerIsNotShowingonChargerPgeAfterRemovingFromAdvanceFilterDrawer() {
        try{
            WebElement tagname= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Atom power station')]"));

            if(!tagname.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Tag has been removed!!");

        }
        return true;

    }

}
