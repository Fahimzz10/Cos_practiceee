package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Dashboard extends BasePage {

    public Dashboard(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();


    By loginmsg = By.xpath("//span[contains(.,'Login Successful')]");
    By dropdown = By.xpath("//span[@class='anticon anticon-user']//*[name()='svg']");
    By logout = By.xpath("//div[@class='flex flex-center-v'][contains(.,'Logout')]");
    By company = By.xpath("(//span[contains(.,'Company')])[1]");
    By cmanagementtext = By.xpath("//a[@href='/company/company-management']");
    By entitymanagement = By.xpath("//a[@href='/company/entity-management']");
    By locations = By.xpath("(//li[@role='menuitem'])[3]");
    By properties = By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Properties')]");
    By property = By.xpath("//span[@class='ant-menu-title-content']//a[normalize-space()='Property']");
    By dashboard = By.xpath("(//li[@role='menuitem'])[1]");

    CreateCompany Createcompany=new CreateCompany(driver);

    public boolean ClickonDropdownArrow () {
       waitVisibility(dropdown);
       click(dropdown);
        return true;
    }

    public boolean ClickonLogout () {
        waitVisibility(logout);
        click(logout);
        return true;
    }

    public boolean ClickonCompanyfromLeftMenuBar ()  {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Createcompany.waitForSpinner();
        waitelementtobedisplayed(company);
        waitVisibility(company);
        click(company);
        return true;
    }

    public boolean clickonProperty () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
      //  Createcompany.waitForSpinner();
        waitelementtobedisplayed(property);
        waitelemtclickable(property);
        click(property);
        return true;
    }

    public boolean ClickonCompanyManagement () {

        waitVisibility(cmanagementtext);
        waitelemtclickable(cmanagementtext);
        click(cmanagementtext);
        return true;
    }

    public boolean ClickonEntityManagement () {
        waitelementtobedisplayed(entitymanagement);
        waitVisibility(entitymanagement);
        click(entitymanagement);
        return true;
    }

    public boolean clickonPropertiesFromLeftMenu () {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
     //   Createcompany.waitForSpinner();
        waitVisibility(properties);
        waitelemtclickable(properties);
        click(properties);
        return true;
    }

    public boolean clickonLocations () throws InterruptedException {
     //   Createcompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       /* waitVisibility(locations);
        waitelementtobedisplayed(locations);
      //  waitelemtclickable(locations);
        click(locations);*/
        driver.get(prop.getProperty("LocationpageURL"));
        urlCheck(prop.getProperty("LocationpageURL"));
        return true;
    }
    public boolean clickOnChargers() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("ChrgerpageURL"));
        urlCheck(prop.getProperty("ChrgerpageURL"));
        return true;
    }

    public boolean clickOnChargersPropertyAdmin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("ChargerpageURLForPropertyAdmin"));
        urlCheck(prop.getProperty("ChargerpageURLForPropertyAdmin"));
        return true;
    }

    public boolean RefreshBrowser () throws InterruptedException {
      //  Createcompany.waitForSpinner();
        waitforInVisibility(Createcompany.spinner);
        driver.navigate().refresh();
        return true;
    }

    public boolean GotoDashboard () throws InterruptedException {
        Thread.sleep(3000);
        driver.get(prop.getProperty("DashboardURL"));
        urlCheck(prop.getProperty("DashboardURL"));
        return true;

    }


    public boolean VerifyUSerHasLogoutFromtheSystem () {
        urlCheck(prop.getProperty("BaseURL"));
        return true;
    }

    public boolean VerifyLoginMessage(String expectedText) {
        try {
            //waitelementtobedisplayed(loginmsg);
            waitVisibility(loginmsg);
            assertEquals(loginmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
