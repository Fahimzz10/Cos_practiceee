package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,20);
    }

    //Wait Wrapper Method
    public boolean waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        return true;
    }

    public void waitelemtclickable(By elementBy) {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitforInVisibility(By elementBy) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitforPresence(By elementBy) {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitelementtobedisplayed(By elementBy) {
        if( driver.findElement((elementBy)).isDisplayed()){
            System.out.println("Element has displayed");
        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
        }

    }

    public Boolean waitelementtobeEnabled(By elementBy) {
        if( driver.findElement((elementBy)).isEnabled()){
            System.out.println("Verification Successful!!! Element is Enabled");

        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }

    public Boolean waitelementtobeDisabled(By elementBy) {
        if(! driver.findElement((elementBy)).isEnabled()){
            System.out.println("Verification Successful!!! Element is Disabled");

        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }


    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        //waitelemtclickable(elementBy);
        driver.findElement(elementBy).click();
    }

   //Clear Text
    public void clear (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    public void KeyboardSelect(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
        driver.findElement(elementBy).sendKeys(Keys.DOWN);
        driver.findElement(elementBy).sendKeys(Keys.DOWN);
        driver.findElement(elementBy).sendKeys(Keys.ENTER);

    }

    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
   public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void urlCheck(String actualUrl){
        wait.until(ExpectedConditions.urlToBe(actualUrl));
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}