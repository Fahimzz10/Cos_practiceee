package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChargerListPropertyAdmin extends BasePage {
    public ChargerListPropertyAdmin(WebDriver driver) {

        super(driver);
    }

    RandomData rdata = new RandomData();


    public static By LocationNA = By.xpath("//div[@class='wordBreak'][contains(.,'N/A')]");
    public static By SearchChargerField = By.xpath("//input[@placeholder='Search by charger & location title']");
    public static By searchargerbtn = By.xpath("//span[contains(text(),'Search')]");
    public static By detailsbutton = By.xpath("//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Details')]");
    public static By LoadMoreButtonWithText = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']//span[contains(text(),'Load 3 More')]");

    public static By LoadMoreButton = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");

    public static By Rows = By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']");
    public static By TotalNum = By.xpath("//div[normalize-space()='Total 65']");
//    color: rgb(38, 38, 38); opacity: 0.6;
    public static By ChargerCountTop = By.xpath("//span[@class='showCount']");
    public static By AddChargerBtn= By.xpath("//button[@type='button']//span[contains(text(),'Add New Charger')]");
    public static By SelectLocation = By.id("rc_select_1");
    public static By ChargerTitle = By.xpath("//div[@title='Atom charger']");

    public static By PropertyName = By.xpath("//div[@class='wordBreak'][normalize-space()='Black Rock Real Estate-2']");

    public static By PropertyAddress = By.xpath("//div[@class='wordBreak'][normalize-space()='17663 Dartmouth Dr, Lewes, DE 19958, United States']");
    public static By LocationName = By.xpath("//div[@class='wordBreak'][normalize-space()='N/A']");
    public static By Action = By.xpath("//span[contains(text(),'Details')]");

    public boolean ClickButton(By element, int delay) throws InterruptedException {
        Thread.sleep(delay);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(element);
        click(element);
        return true;
    }

    public boolean writeInputText(By element, String text, int delay) throws InterruptedException {
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
        if (driver.getPageSource().contains("Charger Title") && driver.getPageSource().contains("Property Name") && driver.getPageSource().contains("Location Name") && driver.getPageSource().contains("Action")) {
            System.out.println("Verification Successful - All the Necessary Section From Header of Table is Showing");

        } else {
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
        String loadmorebuttonbuttontext = driver.findElement(LoadMoreButtonWithText).getText();
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

    public boolean verifyTheWithTable() throws InterruptedException {
        Thread.sleep(1000);
        String total=driver.findElement(TotalNum).getText();
        System.out.println(total);
        String replacing = total.replaceAll("Total ","");
        System.out.println(replacing);
        int TotalCount = Integer.parseInt(replacing);
        System.out.println(TotalCount);

        while (driver.findElement(LoadMoreButton).isDisplayed()) {
            Thread.sleep(1000);
            if (driver.findElement(LoadMoreButton).isDisplayed()) {
                click(LoadMoreButton);
            } else {
                break;
                }
            Thread.sleep(1000);
            int RowCount = driver.findElements(Rows).size();
            System.out.println(RowCount);
            Thread.sleep(1500);
            if (RowCount == TotalCount) {
                System.out.println("Great");
                return true;
            }
        }
        return true;
    }
    public boolean verifyLoadMoreButtonAction() throws InterruptedException{
        Thread.sleep(1000);
        int PrevRowCount = driver.findElements(Rows).size();
        System.out.println(PrevRowCount);
        String LoadButtonText = driver.findElement(LoadMoreButton).getText();
        System.out.println(LoadButtonText);
        String replacing = LoadButtonText.replaceAll("Load 3 More","3");
        System.out.println(replacing);
        int LoadButtonNumber = Integer.parseInt(replacing);
        System.out.println(LoadButtonNumber);
        int ExpectedRowCount = PrevRowCount+LoadButtonNumber;
        driver.findElement(LoadMoreButton).click();
        Thread.sleep(2000);
        int LatestRowCount = driver.findElements(Rows).size();
        System.out.println(LatestRowCount);
        if (ExpectedRowCount==LatestRowCount){
            System.out.println("Well! Working Fine");
            return true;
        }
        else {
            System.out.println("Ohho mistake");
            return false;
        }
    }

    public boolean verifyChargerCountOnTop() throws InterruptedException{
        Thread.sleep(2000);
        int RowCount = driver.findElements(Rows).size();
        String TopOfTable = driver.findElement(ChargerCountTop).getText();
        String replacing = TopOfTable.replaceAll("Showing Chargers: ","");
        int ChargerCountOnTop = Integer.parseInt(replacing);
        if (ChargerCountOnTop==RowCount){
            System.out.println("Well! Working Fine");
            return true;
        }
        else {
            System.out.println("Ohho mistake");
            return false;
        }
    }
    public boolean verifyTableDataAfterRefreshing() throws InterruptedException{
        int DefaultRowCount = driver.findElements(Rows).size();
        driver.findElement(LoadMoreButton).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        int LatestRowCount = driver.findElements(Rows).size();
        if (DefaultRowCount==LatestRowCount){
            System.out.println("Yes!!!!");
            return true;
        }
        else {
            System.out.println("Something Wrongggg");
            return false;

        }
    }
    public boolean verifyChargerCountOnTopAfterRefreshing() throws InterruptedException {
        String TopOfTable = driver.findElement(ChargerCountTop).getText();
        String replacing = TopOfTable.replaceAll("Showing Chargers: ", "");
        int DefaultChargerCountOnTop = Integer.parseInt(replacing);
        int DefaultRowCount = driver.findElements(Rows).size();
        driver.findElement(LoadMoreButton).click();
        driver.navigate().refresh();
        String CurrentTopOfTable = driver.findElement(ChargerCountTop).getText().replaceAll("Showing Chargers: ", "");
        System.out.println(CurrentTopOfTable);
        int ChargerCountOnTopCountAfterRefreshing = Integer.parseInt(CurrentTopOfTable);
        if (DefaultRowCount == ChargerCountOnTopCountAfterRefreshing) {
            System.out.println("Yes!!!!");
            return true;
        } else {
            System.out.println("Something Wrongggg");
            return false;

        }
    }
    public boolean verifyingBlankContent() throws InterruptedException{
        String ChargerTitleCheck = driver.findElement(ChargerTitle).getText();
        System.out.println(ChargerTitleCheck);
        String PropertyNameCheck = driver.findElement(PropertyName).getText();
        System.out.println(PropertyNameCheck);
        String PropertyAddressCheck = driver.findElement(PropertyAddress).getText();
        System.out.println(PropertyAddressCheck);
        String LocationNameCheck = driver.findElement(LocationName).getText();
        System.out.println(LocationNameCheck);
        String ActionCheck = driver.findElement(Action).getText();
        System.out.println(ActionCheck);
        if (!ChargerTitleCheck.isEmpty() && !PropertyNameCheck.isEmpty() && !PropertyAddressCheck.isEmpty() && !LocationNameCheck.isEmpty() && !ActionCheck.isEmpty()){
            System.out.println("Oy hoy...mila gese");
            return true;
        }
        else {
            System.out.println("Vapla Ase");
            return false;
        }
    }
}


