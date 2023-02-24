package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditChargerCosAdminUpdated extends BasePage {

    public EditChargerCosAdminUpdated(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By EditDrawerChargerInfoTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Information')]");
    public static By EditDrawerOfflineOnline = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Offline/Online')]");
    public static By EditDrawerPropertyInfo = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Property Information')]");
    public static By EditDrawerLocationInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Location Information')]");
    public static By EditDrawerAuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By EditDrawerMoreSettings = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'More Settings')]");
    public static By DrawerTitle = By.xpath("//div[@class='drawerTitle wordBreak']");





    public boolean verifyEditButton() throws InterruptedException {
        Thread.sleep(1000);
        if (driver.findElement(CosAdminChargerList.EditButton).isDisplayed()){
            System.out.println("Edit Button is Showing");
            return true;
        }
        else {
            System.out.println("NoT Visible");
            return false;

        }
    }
    public boolean verifyChargerTitleAboveEditDrawer(){
        String ChargerTitle = "Toggle Location";
        driver.findElement(ChargerListPropertyAdmin.SearchChargerField).sendKeys(ChargerTitle);
        driver.findElement(ChargerListPropertyAdmin.searchargerbtn).click();
        driver.findElement(CosAdminChargerList.EditButton).click();
        String Title = driver.findElement(DrawerTitle).getText();
        if (ChargerTitle.equals(Title)){
            System.out.println("Title is Correct");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }
    public boolean verifyEditDrawerNecessarySection() throws InterruptedException {
        Thread.sleep(1000);
        String ChargerTitleInformation = driver.findElement(EditDrawerChargerInfoTitle).getText();
        String OnlineOfflineSection = driver.findElement(EditDrawerOfflineOnline).getText();
        String PropertyInfoSection = driver.findElement(EditDrawerPropertyInfo).getText();
        String LocationInformation =driver.findElement(EditDrawerLocationInformation).getText();
        String AuditLogSection = driver.findElement(EditDrawerAuditLog).getText();
        String MoreSettingsSection= driver.findElement(EditDrawerMoreSettings).getText();
        if (ChargerTitleInformation.contains("Charger Information") && OnlineOfflineSection.contains("Offline/Online") && PropertyInfoSection.contains("Property Information") && LocationInformation.contains("Location Information") && AuditLogSection.contains("Audit Log") && MoreSettingsSection.contains("More Settings") ) {
            System.out.println("Verification Successful - All the Necessary Section of drawer is Showing");
            return true;

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
    }
}
