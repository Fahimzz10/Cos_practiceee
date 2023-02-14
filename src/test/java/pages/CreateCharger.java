package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class CreateCharger extends BasePage {
    public CreateCharger(WebDriver driver)
    {

        super(driver);
    }
    RandomData rdata = new RandomData();

    By addchargerbtn= By.xpath("//*[contains(span,'Add New Charger')]");
    By addnewchargerdrawer = By.xpath("//span[@class='drawerTitle'][contains(.,'Add New Charger')]");

    By Chargername = By.xpath("//input[@placeholder='Charger Name']");
    By Chargernameerrormsg = By.xpath("//div[contains(text(),'Charger name is required')]");
    By propertynameerrmsg = By.xpath("//div[contains(text(),'Property is required')]");
    By selectproperty = By.id("rc_select_0");
    By pname =By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[1]");
    By lname= By.xpath("//div[contains(text(),'Electric Charger')]");
    //div[contains(@class,'ant-select-item-option-content')])[12]
    By selectlocation = By.id("rc_select_0");
    By savecharger = By.xpath("//button[@type='submit']");
    By cancel= By.xpath("//button[@type='button']");
    public static By location = By.id("rc_select_1");
    By confirmationpopup = By.xpath("//span[normalize-space()='Charger created successfully']");
    //span[contains(.,'Property created successfully')]
    By loader = By.xpath("(//i[@class='ant-spin-dot-item'])[3]");

    public boolean ClickOnAddChargerButton () throws InterruptedException {
        Thread.sleep(5000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(addchargerbtn);
        click(addchargerbtn);
        return true;

    }
    public boolean clickonSaveChargerButton () throws InterruptedException {
        Thread.sleep(3000);
        waitelemtclickable(savecharger);
        click(savecharger);
        return true;
    }
    public boolean clickonPropertySelect () throws InterruptedException {
        Thread.sleep(2000);
        waitelemtclickable(selectproperty);
        click(selectproperty);
        return true;
    }

    public boolean clickonlocation() throws InterruptedException {
        Thread.sleep(1000);
        waitelemtclickable(location);
        click(location);
        return true;
    }


    public boolean writeNewChargerName(String NewChargerName) throws InterruptedException {
        Thread.sleep(5000);
        writeText(Chargername,NewChargerName);
        return true;
    }

    public boolean writePropertyName(String PropertyName3) throws InterruptedException {
        Thread.sleep(3000);
        writeText(selectproperty,PropertyName3);
        return true;
    }

    public  boolean writeInputText(By element, String text, int delay)  throws InterruptedException {
        Thread.sleep(delay);
        writeText(element, text);
        return true;
    }
    public boolean writeLocationName(String PropertyName3) throws InterruptedException {
        Thread.sleep(3000);
        writeText(selectproperty,PropertyName3);
        return true;
    }




    public boolean selectPropertyNameFromSelectPropertyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(pname);
        //waitelemtclickable(pname);

        click(pname);
//        click(pname);
        return true;
    }
    public boolean selectLoactionNameFromSelectPropertyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(lname);
        //waitelemtclickable(pname);

        click(lname);
//        click(pname);
        return true;
    }
    public boolean verifyAddNewChargerButtonHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(addchargerbtn);
        if (driver.findElement(By.xpath("//button[contains(.,'Add New Charger')]")).isDisplayed()) {
            System.out.println("Add New Charger button has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyChargerNameErrorMsgHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(Chargernameerrormsg);
        if (driver.findElement(Chargernameerrormsg).isDisplayed()) {
            System.out.println("Error message is shown");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyPropertyNameErrorMsgHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(1000);
        waitVisibility(propertynameerrmsg);
        if (driver.findElement(propertynameerrmsg).isDisplayed()) {
            System.out.println("Error message is shown");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean VerifyAddNewChargerDrawerHasDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        waitVisibility(addnewchargerdrawer);
        if( driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Add New Charger')]")).isDisplayed())
        {
            System.out.println("Create New Entity drawer has displayed");
            return true;
        }
        else{
            System.out.println("Something Went Wrong!!");
            return false;
        }
    }
    public boolean VerifyConfirmationPopUpHasDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(confirmationpopup);
        if( driver.findElement(confirmationpopup).isDisplayed())
        {
            System.out.println("New Charger Has been Created Successfully");
            return true;
        }
        else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }





}
