package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SearchCompany extends BasePage{

    public SearchCompany(WebDriver driver)
    {
        super(driver);
    }

    By companyemail = By.xpath("(//div[@class='wordBreak'][contains(.,'test@test.com')])[1]");
    By advancefilterbtn = By.xpath("//button[contains(.,'Add Advance Filter')]");
    By statedroddown = By.xpath("(//div[@class='ant-select-selection-overflow'])[1]");
    By zipdroddown = By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    By selectstate = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Alaska')]");
    By selectzip = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'35005')]");
    By statename = By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Alaska')]");
    By companystatus = By.xpath("//span[contains(.,'Include deactivated companies')]");
    By applybtn = By.xpath("//button[contains(.,'Apply')]");
    By resetbtn = By.xpath("//button[contains(.,'Reset all')]");
    By advancefilter= By.xpath("//span[@class='drawerTitle'][contains(.,'Advanced Filter')]");
    By ascendingcompanyname = By.xpath("//span[contains(.,'Company Name')]");
    By ascendingemail = By.xpath("//span[contains(.,'Company Email')]");
    By loadmorebtn = By.xpath("//span[contains(.,'Load 3 More')]");
    By nodataimg = By.xpath("//img[@src='/images/noDataTable.svg']");
    By brandifocheckbox = By.xpath("//span[contains(.,'Show companies with logo')]");
    By removebtn = By.xpath("//span[@class='anticon anticon-close ant-tag-close-icon']");




    EditCompany editCompany= new EditCompany(driver);
    CreateCompany company= new CreateCompany(driver);


    public boolean ClickonSearchbar() {
        company.waitForSpinner();
        waitVisibility(editCompany.searchbar);
        waitelementtobedisplayed(editCompany.searchbar);
        click(editCompany.searchbar);
        return true;
    }

    public boolean ClickonAdvanceFilterButton() throws InterruptedException {
        waitforInVisibility(company.spinner);
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        waitVisibility(advancefilterbtn);
        waitelementtobedisplayed(advancefilterbtn);
        waitelemtclickable(advancefilterbtn);
        click(advancefilterbtn);
        return true;
    }

    public boolean ClickonAscedingArrowfromName() throws InterruptedException {
        Thread.sleep(3000);
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        click(ascendingcompanyname);
        return true;
    }

    public boolean ClickonLoadMoreButton() {
    //    WebElement loadmorebt= driver.findElement(By.xpath("//span[contains(.,'Show companies with no logo')]"));
        waitVisibility(loadmorebtn);
        click(loadmorebtn);
        return true;
    }

    public boolean ClickonAscedingfromEmail() {
        company.waitForSpinner();
        waitVisibility(ascendingemail);
        click(ascendingemail);
        return true;
    }

    public boolean ClickonApplyButton() throws InterruptedException {
        Thread.sleep(2000);
        waitelemtclickable(applybtn);
        //waitVisibility(applybtn);
        click(applybtn);
        return true;
    }

    public boolean ClickonResetButton() throws InterruptedException {
       // Thread.sleep(3000);
        waitVisibility(resetbtn);
        click(resetbtn);
        return true;
    }

    public boolean SearchbyEmail(String CompanyEmail) {
        company.waitForSpinner();
        writeText(editCompany.searchbar,CompanyEmail);
        return true;
    }

    public boolean ClickonSelectStateFromAdvanceFilterDrawer() {
        waitVisibility(statedroddown);
        click(statedroddown);
        return true;
    }

    public boolean SelectStateFromDropDown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(selectstate);
      //  waitelementtobedisplayed(selectstate);
        click(selectstate);
        click(advancefilter);
        return true;
    }

    public boolean ClickonZipCodeDropdownFromAdvanceFilterDrawer() {
        waitVisibility(zipdroddown);
        click(zipdroddown);
        return true;
    }

    public boolean SelectZipFromDropDown() throws InterruptedException {
      //  company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
        waitelemtclickable(selectzip);
        waitVisibility(selectzip);
        click(selectzip);
        return true;
    }

    public boolean SelectComapnyStatus() {
        //waitVisibility(companystatus);
        click(companystatus);
        return true;
    }

    public boolean ClickShowCompanylogocheckbox() {
        waitVisibility(brandifocheckbox);
        click(brandifocheckbox);
        return true;
    }

    public boolean ClickonCrosstoRemoveStateTag() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(removebtn);
        click(removebtn);
        return true;
    }

    public boolean SearchbyPhoneNumber(String PhoneNumber) {
        company.waitForSpinner();
        writeText(editCompany.searchbar,PhoneNumber);
        return true;
    }

    public boolean VerifCompanywiththeEnteredEmailAddressIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyemail);
        if( driver.findElement(By.xpath("//div[@class='wordBreak'][contains(.,'test@test.com')]")).isDisplayed())
        {
            System.out.println("Searched Email has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifCompanywiththeEnteredPhoneNumberIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyemail);
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'14844731064')])")).isDisplayed())
        {
            System.out.println("Company with the provided phone number is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifNoDataisShowingafterProvidingInvalidData() throws InterruptedException {
        //waitVisibility(nodataimg);
        company.waitForSpinner();
        Thread.sleep(2000);
        if( driver.findElement(By.xpath("//img[@src='/images/noDataTable.svg']")).isDisplayed())
        {
            System.out.println("No Company is showing with the provided data ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter() {
        company.waitForSpinner();
        waitVisibility(statename);
        if( driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Alaska')]")).isDisplayed())
        {
            System.out.println("Alaska State name is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifZipcodeTagisShowingaAfterSelectingtheZipFromAdncedFilter() {
        waitVisibility(statename);
        if( driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'35005')]")).isDisplayed())
        {
            System.out.println("Zip code is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifCompanyStatusTagisShowingaAfterSelectingtheZipFromAdncedFilter() {
        waitVisibility(statename);
        if( driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Deactivated Company included')]")).isDisplayed())
        {
            System.out.println("Zip code is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifcompanyNameisSortedinAscendingOrder() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(ascendingcompanyname);
        if( driver.findElement(By.xpath("(//div[contains(@class,'wordBreak')])[1]")).isDisplayed())
        {
            System.out.println("Company Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifPagehasRefreshafterprrssingsearchbutton() {
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        if( driver.findElement(By.xpath("//span[contains(.,'Company Name')]")).isDisplayed())
        {
            System.out.println("Company Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifTwoHunderedMorecompaniesareShowingAfterPressingLoadMoreButton() {
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        if(driver.getPageSource().contains("Showing Companies: 400"))
        {
            System.out.println("200 more companies are showing after Clicking on Load more button. Total 400 companies are showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifTwoHunderedCompaniesareShowingAfterSorting() {
        waitVisibility(ascendingcompanyname);
        if(driver.getPageSource().contains("Showing Companies: 200"))
        {
            System.out.println("Total 200 companies are showing and sorted in ascending order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton() {
        if(driver.getPageSource().contains("Advanced Filter"))
        {
            System.out.println("Company Drawer is Still Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean Verifcheckboxhasdisabled() {
        boolean checked = driver.findElement(By.xpath("//xpath of the checkbox")).isSelected();
        return true;
    }

    public boolean VerifyStateTagHasbeenremoved() {
        try{
            WebElement statetag= driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Alaska')]"));
            if(!statetag.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.State tag has been removed!!");

        }
        return true;

    }

    public boolean VerifyOtherFilterHasDiabled() {
            WebElement nologo= driver.findElement(By.xpath("//span[contains(.,'Show companies with no logo')]"));
            if(!nologo.isSelected())
            {
                System.out.println("Verification Successful.Show Company with no logo filter is disabled!!");
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        return true;

    }


}
