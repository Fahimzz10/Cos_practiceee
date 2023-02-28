package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class CreateCharger extends BasePage {
    public CreateCharger(WebDriver driver)
    {

        super(driver);
    }
    RandomData rdata = new RandomData();

    public static By addchargerbtn= By.xpath("//button[@type='button']//span[contains(text(),'Add New Charger')]");
    public static By addnewchargerdrawer = By.xpath("//span[@class='drawerTitle'][contains(.,'Add New Charger')]");
    public static By outsidedrawer = By.xpath("//div[@class='ant-drawer-mask']");
    public static By crossbtnofdrawer = By.cssSelector("button[class='ant-drawer-close']");
    public static By cancelbuttonofdrawer = By.xpath("//span[contains(text(),'Cancel')]");
    public static By discardandcontinuepopup = By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]");
    public static By discardbtn = By.xpath("//button[@class='ant-btn ant-btn-default'][contains(.,'Discard')]");
    public static By Chargername = By.xpath("//input[@placeholder='Charger Name']");
    public static By searchchargerfield= By.xpath("//input[@placeholder='Search by charger & location title']");
    public static By searchargerbtn = By.xpath("//span[contains(text(),'Search')]");
    public static By SearchResultCount = By.xpath("//span[@class='showCount']");
    public static By Chargernameerrormsg = By.xpath("//div[contains(text(),'Charger name is required')]");
    public static By propertynameerrmsg = By.xpath("//div[contains(text(),'Property is required')]");
    public static By selectproperty = By.id("rc_select_0");
    public static By pname =By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[1]");
    public static By lname= By.xpath("//div[contains(text(),'Electric Charger')]");
    //div[contains(@class,'ant-select-item-option-content')])[12]
    public static By selectlocation = By.id("rc_select_0");
    public static By savecharger = By.xpath("//button[@type='submit']");
    public static By cancel= By.xpath("//button[@type='button']");
    public static By location = By.id("rc_select_1");
    public static By confirmationpopup = By.xpath("//span[normalize-space()='Charger created successfully']");
    //span[contains(.,'Property created successfully')]
    public static By nodatafromsearch = By.xpath("//*[name()='path' and contains(@class,'ant-empty-')]");
    public static By loader = By.xpath("(//i[@class='ant-spin-dot-item'])[3]");

    public boolean ClickOnAddChargerButton () throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(addchargerbtn);
        click(addchargerbtn);
        return true;
    }

    public boolean clickonSaveChargerButton () throws InterruptedException {
        Thread.sleep(2000);
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

    public boolean clickonoutsidethedrawer() throws InterruptedException {
        Thread.sleep(1000);
        waitelemtclickable(outsidedrawer);
        click(outsidedrawer);
        return true;
    }
    public boolean clickOnCrossButtonOfTheDrawer() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(crossbtnofdrawer);
        click(crossbtnofdrawer);
        return true;
    }
    public boolean clickOnCancelButtonOfTheDrawer() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(cancelbuttonofdrawer);
        click(cancelbuttonofdrawer);
        return true;
    }
    public boolean clickOnDiscardButtonOfPopUp() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(discardbtn);
        click(discardbtn);
        return true;
    }
    public  boolean ClickButton(By element,int delay)  throws InterruptedException {
        Thread.sleep(delay);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(element);
        click(element);
        return true;
    }




    public boolean writeNewChargerName(String NewChargerName) throws InterruptedException {
        Thread.sleep(3000);
        writeText(Chargername,NewChargerName);
        return true;
    }

    public boolean writePropertyName(String PropertyName3) throws InterruptedException {
        Thread.sleep(2000);
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
        Thread.sleep(3000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(addchargerbtn).isDisplayed()) {
            System.out.println("Add New Charger button has displayed and Drawer is Closed Now");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyAddNewChargerButtonHasnotDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(2000);
        //waitVisibility(addchargerbtn);
        if (!driver.findElement(addchargerbtn).isDisplayed()) {
            System.out.println("Add New Charger button has not displayed");
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
        Thread.sleep(2000);
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
    public boolean VerifySearchResultCount() throws InterruptedException {
        Thread.sleep(4000);
        waitVisibility(SearchResultCount);

        String countText = driver.findElement(SearchResultCount).getText();
        countText = countText.replaceAll("Showing Chargers: ", "");
        int count = Integer.parseInt(countText);
        System.out.println(count);
        if(count==1)
        {
            System.out.println("Search Count is 1");
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
    public boolean verifyDiscadContinuePopupHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(1000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(discardandcontinuepopup).isDisplayed()) {
            System.out.println("Discard or Continue Pop up has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyPopUpContainsDiscardAndContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        if(driver.getPageSource().contains("Discard") && driver.getPageSource().contains("Continue")) {
            System.out.println("Verification Successful - Discard and Continue Button is showing");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }
    public boolean verifyDrawerContainsAllNecessarySection() throws InterruptedException {
        Thread.sleep(1000);
        if(driver.getPageSource().contains("Charger Name") && driver.getPageSource().contains("Select Property") && driver.getPageSource().contains("Select Location")) {
            System.out.println("Verification Successful - All the Necessary Section in Drawer Showing");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }
    public boolean verifyNoDataFromInvalidSearch() throws InterruptedException {
        Thread.sleep(2000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(nodatafromsearch).isDisplayed()) {
            System.out.println("Discard or Continue Pop up has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }





}
