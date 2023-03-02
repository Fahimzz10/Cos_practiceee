package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChargerListPropertyAdmin extends BasePage {
    public ChargerListPropertyAdmin(WebDriver driver) {

        super(driver);
    }

    RandomData rdata = new RandomData();


    public static By LocationNA = By.xpath("//div[@class='wordBreak'][contains(.,'N/A')]");
    public static By LocationUnderLocationColumn = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div");
    public static By SearchChargerField = By.xpath("//input[@placeholder='Search by charger & location title']");
    public static By searchargerbtn = By.xpath("//span[contains(text(),'Search')]");
    public static By detailsbutton = By.xpath("//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Details')]");
    public static By LoadMoreButtonWithText = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']//span[contains(text(),'Load 3 More')]");

    public static By LoadMoreButton = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");

    public static By Rows = By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']");
    public static By TotalNum = By.xpath("//div[@class='total-count-under-table']");
//    color: rgb(38, 38, 38); opacity: 0.6;
    public static By ChargerCountTop = By.xpath("//span[@class='showCount']");
    public static By ChargerColumn = By.xpath("//th[normalize-space()='Charger Title']");
    public static By PropertyNameColumn = By.xpath("//th[normalize-space()='Property Name']");
    public static By PropertyAddressColumn = By.xpath("//th[normalize-space()='Property Address']");
    public static By LocationNameColumn = By.xpath("//th[normalize-space()='Location Name']");
    public static By ActionColumn = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/thead/tr/th[5]");
    public static By ChargerTitle = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[1]/div");
    public static By PropertyName = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div");
    public static By PropertyAddress = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div");
    public static By LocationName = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div");
    public static By Action = By.xpath("//span[contains(text(),'Details')]");
    public static By LeftShowingCharger = By.xpath("//div[@class='showing-count-under-table']");
    public static By SelectedLocationFromOption = By.xpath("//div[@class='ant-select-item-option-content'][1]");
    public static By SelectedLocationName = By.xpath("//span[@class='ant-select-selection-item']");
    public static By SaveChargerButton = By.xpath("//span[normalize-space()='Save Charger']");

    public boolean ClickButton(By element, int delay) throws InterruptedException {
        Thread.sleep(delay);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(element);
        click(element);
        return true;
    }

    public boolean writeInputText(By element, String text, int delay) throws InterruptedException {
        //waitVisibility(ChargerColumn);
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
    public boolean verifyHeaderColumnAlternative() throws InterruptedException {
        Thread.sleep(1000);
        String ColumnTitleCharger = driver.findElement(ChargerColumn).getText();
        String ColumnPropertyName = driver.findElement(PropertyNameColumn).getText();
        String ColumnPropertyAddress = driver.findElement(PropertyAddressColumn).getText();
        String ColumnLocationName = driver.findElement(LocationNameColumn).getText();
        String ColumnAction = driver.findElement(ActionColumn).getText();
        if (ColumnTitleCharger.contains("Charger Title") && ColumnPropertyName.contains("Property Name") && ColumnPropertyAddress.contains("Property Address") && ColumnLocationName.contains("Location") && ColumnAction.contains("Action") ) {
            System.out.println("Verification Successful - All the Necessary Section From Header of Table is Showing");
            return true;

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
    }

    public boolean verifyloadMoreButton() throws InterruptedException {
        Thread.sleep(1000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(LoadMoreButton).isDisplayed()) {
            System.out.println("location More Button is Displayed");
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
        int TotalCount = Integer.parseInt(replacing);
        System.out.println(TotalCount);

        while (driver.findElement(LoadMoreButton).isDisplayed()) {
            Thread.sleep(1000);
            if (driver.findElement(LoadMoreButton).isDisplayed()) {
                click(LoadMoreButton);
            } else {
                break;
                }
            Thread.sleep(1500);
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
        String LoadButtonText = driver.findElement(LoadMoreButton).getText();
        System.out.println(LoadButtonText);
        String KeepingNumbersOnly = LoadButtonText.replaceAll("[^0-9]","");
        System.out.println(KeepingNumbersOnly);
        int LoadButtonNumber = Integer.parseInt(KeepingNumbersOnly);
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
    public boolean verifyEditedLocation() throws InterruptedException {
        WebElement location = driver.findElement(CreateCharger.selectlocation);
        ClickButton(CreateCharger.selectlocation,2000);
        Thread.sleep(1000);
        location.sendKeys("Charger");
        Thread.sleep(1500);
        location.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        String SelectedLocation = driver.findElement(SelectedLocationName).getText();
        System.out.println(SelectedLocation);
        driver.findElement(SaveChargerButton).click();
        Thread.sleep(2000);
        String UpdatedLocationName = driver.findElement(LocationUnderLocationColumn).getText();
        System.out.println(UpdatedLocationName);
        if (SelectedLocation.equals(UpdatedLocationName)) {
            System.out.println("Matched");
            ClickButton(detailsbutton,1000);
            ClickButton(SelectedLocationName,1000);
            ClickButton(EditChargerCosAdminUpdated.LocationFieldCrossButton,2000);
            ClickButton(SaveChargerButton,1000);
            return true;
        }
        else {
            System.out.println("Wronggggggg");
            return false;
        }

    }
    public boolean verifyTheChargerCountWithLeftSideOFLoadMoreButton() throws InterruptedException {
        int DefaultRowCount = driver.findElements(Rows).size();
        System.out.println(DefaultRowCount);
        String LeftLoadButton = driver.findElement(LeftShowingCharger).getText().replaceAll("Showing ","");
        int LeftLoadButtonNumber = Integer.parseInt(LeftLoadButton);
        System.out.println(LeftLoadButtonNumber);
        if (DefaultRowCount==LeftLoadButtonNumber){
            System.out.println("Left side of Load More Button is Showing the Correct Number");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
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
        Thread.sleep(1000);
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
            System.out.println("Something went wrong");
            return false;
        }
    }
}


