package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

public class GuestFlow extends BasePage{
    public GuestFlow(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By PhoneNumber = By.xpath("//button[@type='submit']");


    public Boolean GuestFlow() throws IOException, UnsupportedFlavorException, InterruptedException {
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
        ((JavascriptExecutor) driver).executeScript("window.open(\""+myText+"\")");
        Thread.sleep(3000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
          // Switch to the new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(3000);
        //waitforPresence(EditChargerCosAdminUpdated.WelcomePageTitleChargingFee);
        driver.findElement(PhoneNumber).click();
        //writeText(PhoneNumber,"1111111111");
        return true;
    }

}
