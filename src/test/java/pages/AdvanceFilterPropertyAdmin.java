package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class AdvanceFilterPropertyAdmin extends BasePage {

    public AdvanceFilterPropertyAdmin(WebDriver driver) {
        super(driver);
    }
    RandomData rdata = new RandomData();

    public static By AdvanceFilterDrawerTitle = By.xpath("//span[@class='drawerTitle'][contains(text(),'Advanced Filter')]");
    public static By FilterPropertyField = By.xpath("//input[@role='combobox'])[1]");
    public static By locationdropdown = By.xpath("(//div[contains(@class,'ant-select-selection-overflow')])[2]");




    public boolean SelectPropertyFromDropDown() throws InterruptedException {
        //waitVisibility(ChargerColumn);
        Thread.sleep(2000);
        WebElement PropertySelect = driver.findElement(FilterPropertyField);
        Thread.sleep(4000);
        PropertySelect.sendKeys("sdsdsdsdssd");
        PropertySelect.sendKeys(Keys.DOWN,Keys.ENTER);
        PropertySelect.sendKeys(Keys.DOWN,Keys.ENTER);
        return true;
    }
    public boolean SelectLocationFromDropDown() throws InterruptedException {
        //waitVisibility(ChargerColumn);
        WebElement PropertySelect = driver.findElement(FilterPropertyField);
        PropertySelect.sendKeys(Keys.DOWN,Keys.ENTER);
        PropertySelect.sendKeys(Keys.DOWN,Keys.ENTER);
        return true;
    }



}
