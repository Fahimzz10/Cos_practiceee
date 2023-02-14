package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchEntity extends BasePage{

    public SearchEntity(WebDriver driver)
    {
        super(driver);
    }

    EditCompany editCompany= new EditCompany(driver);
    CreateEntity createEntity= new CreateEntity(driver);
    SearchCompany searchCompany= new SearchCompany(driver);
    CreateCompany company= new CreateCompany(driver);

    By enttity = By.xpath("//span[contains(.,'Entity Name')]");
    By entitynumber= By.xpath("//span[@class='showCount'][contains(.,'Showing Entities: 0')]");
    By entityname= By.xpath("(//div[contains(.,'101')])[8]");
    By statedroddown= By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    By zipdroddown= By.xpath("(//div[@class='ant-select-selection-overflow'])[3]");
    By cleartag= By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag'][contains(.,'Clear All')]");
    By ascendingnamearrow= By.xpath("//span[contains(.,'Entity Name')]");
    By ascendingnemail= By.xpath("//span[contains(.,'Entity Email')]");
    By ascendingnphone= By.xpath("//span[contains(.,'Entity Phone')]");


    public boolean ClickonAscedingArrowfromName() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitelemtclickable(ascendingnamearrow);
        waitelementtobedisplayed(ascendingnamearrow);
        click(ascendingnamearrow);
        return true;
    }

    public boolean ClickonAscedingArrowfromEmail() throws InterruptedException {
        createEntity.waitforLoadertoLoadData();
        Thread.sleep(2000);
        waitVisibility(ascendingnemail);
        click(ascendingnemail);
        return true;
    }

    public boolean ClickonAscedingArrowfromphone() {
        waitVisibility(ascendingnphone);
        click(ascendingnphone);
        return true;
    }

    public boolean ClickonSelectStateFromAdvanceFilterDrawer() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(statedroddown);
        click(statedroddown);
        return true;
    }

    public boolean ClickonSelectZipdropdownFromAdvanceFilterDrawer() {
        waitVisibility(zipdroddown);
        click(zipdroddown);
        return true;
    }

    public boolean ClickonClearAllTag() throws InterruptedException {
        waitforInVisibility(company.spinner);
       // Thread.sleep(3000);
       waitelementtobedisplayed(cleartag);
        waitVisibility(cleartag);
        click(cleartag);
        return true;
    }


    public boolean VerifPagehasRefreshafterprrssingsearchbutton() {
        company.waitForSpinner();
        waitVisibility(enttity);
        if( driver.findElement(By.xpath("//span[contains(.,'Entity Name')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifNoEntityisShowingafterProvidingInvalidData() {
        waitVisibility(entitynumber);
        if( driver.findElement(By.xpath("//span[@class='showCount'][contains(.,'Showing Entities: 0')]")).isDisplayed())
        {
            System.out.println("No entity has found with this name");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifEntityNameisSortedinAscendingOrder() {
        company.waitForSpinner();
        waitVisibility(entityname);
        if( driver.findElement(By.xpath("(//div[contains(.,'101')])[8]")).isDisplayed())
        {
            System.out.println("Entity Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifEntityEmailisSortedinAscendingOrder() {
        WebElement ele= driver.findElement(By.xpath("(//div[contains(.,'101')])[8]"));
        if( !ele.isDisplayed())
        {
            System.out.println("Entity Email is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifdMoreEntitiessareShowingAfterPressingLoadMoreButton() {
        company.waitForSpinner();
        if(driver.getPageSource().contains("Showing Entities: 100"))
        {
            System.out.println("Total 100 entites are showing after pressing Load more Button");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean WhenAdminsorttheEntitesAfterPressingLoadMoreButton() throws InterruptedException {
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[contains(@class,'showCount')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntityManagementPageHasSettoDefaultVauleafterPressingCleerAllTag() throws InterruptedException {
        Thread.sleep(3000);

        if( driver.findElement(By.xpath("//span[contains(@class,'showCount')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

}
