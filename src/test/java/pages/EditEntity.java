package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EditEntity extends BasePage {

    public EditEntity(WebDriver driver)
    {
        super(driver);
    }

    CreateEntity entity= new CreateEntity(driver);
    CreateCompany createCompany= new CreateCompany(driver);

    By entityinfo = By.xpath("//span[contains(.,'Entity Information')]");
    By entityname = By.xpath("(//div[contains(.,'New Entity')])[10]");



    public boolean RemoveEntityNameFromEditEntityDrawer () throws InterruptedException {
        createCompany.waitForSpinner();
        waitVisibility(entity.entityname);
        Thread.sleep(3000);
        WebElement companyname= driver.findElement(By.xpath("//input[@placeholder='Name']"));
        companyname.sendKeys(Keys.CONTROL + "a");
        companyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveCompanyNameFromEditEntityDrawer () throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(entity.dropdown);
        click(entity.dropdown);
        WebElement companyname= driver.findElement(By.xpath("rc_select_0"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        companyname.sendKeys(Keys.CONTROL + "a");
        companyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEntityPhoneNumber () throws InterruptedException {
        waitVisibility(entity.phone);
        Thread.sleep(3000);
        WebElement phonenumber= driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        phonenumber.sendKeys(Keys.CONTROL + "a");
        phonenumber.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEmailFromEditEntityDrawer () throws InterruptedException {
        waitVisibility(createCompany.email);
        Thread.sleep(3000);
       WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys(Keys.CONTROL + "a");
        email.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveAddressFromEditEntityDrawer () throws InterruptedException {
       createCompany.waitForSpinner();
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address')]"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean VerifyEntityInformationareShowing() {
        waitVisibility(entityinfo);
        if(driver.getPageSource().contains("Name") && driver.getPageSource().contains("Phone Number") && driver.getPageSource().contains("Email") && driver.getPageSource().contains("Note") && driver.getPageSource().contains("EIN") ) {
            System.out.println("Verification Successful - Entity Name,Phone,Email,EIN and Note are Showing On Entity Information Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean VerifyUpdatedEntityisShowinginEntityTable() {
        waitVisibility(entityname);
        WebElement drawer= driver.findElement(By.xpath("(//div[contains(.,'New Entity')])[10]"));
        if( !drawer.isDisplayed())
        {
            System.out.println("Newly Created Entity is showing Entity Management page");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }
}
