package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChargerListPropertyAdmin extends BasePage {
    public ChargerListPropertyAdmin(WebDriver driver)
    {

        super(driver);
    }
    RandomData rdata = new RandomData();


    public static By LocationNA = By.xpath("//div[@class='wordBreak'][contains(.,'N/A')]");
    public static By searchchargerfield= By.xpath("//input[@placeholder='Search by charger & location title']");
    public static By searchargerbtn = By.xpath("//span[contains(text(),'Search')]");
    public static By detailsbutton = By.xpath("//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Details')]");
    public static By LoadMoreButton = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']//span[contains(text(),'Load 3 More')]");









    public  boolean ClickButton(By element,int delay)  throws InterruptedException {
        Thread.sleep(delay);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(element);
        click(element);
        return true;
    }
    public  boolean writeInputText(By element, String text, int delay)  throws InterruptedException {
        Thread.sleep(delay);
        writeText(element, text);
        return true;
    }

    public boolean verifyNAForNoLocation() throws InterruptedException {
        Thread.sleep(2000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(LocationNA).isDisplayed()) {
            System.out.println("location NA is Displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyHeaderColumn() throws InterruptedException {
        Thread.sleep(1000);
        if(driver.getPageSource().contains("Charger Title") && driver.getPageSource().contains("Property Name") && driver.getPageSource().contains("Location Name")&& driver.getPageSource().contains("Action") ) {
            System.out.println("Verification Successful - All the Necessary Section From Header of Table is Showing");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }
    public boolean verifyloadMoreButton() throws InterruptedException {
        Thread.sleep(1000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(LoadMoreButton).isDisplayed()) {
            System.out.println("location NA is Displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyloadMoreButtonWithDigit() throws InterruptedException {
        Thread.sleep(1000);
        String loadmorebuttonbuttontext = driver.findElement(LoadMoreButton).getText();
        System.out.println(loadmorebuttonbuttontext);
        String expected = "Load 3 More";
        //waitVisibility(addchargerbtn);
        if (loadmorebuttonbuttontext.equals(expected)) {
            System.out.println("mile gese");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

}


