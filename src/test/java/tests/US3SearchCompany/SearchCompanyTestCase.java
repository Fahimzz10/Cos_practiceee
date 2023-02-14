package tests.US3SearchCompany;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class SearchCompanyTestCase extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifPagehasRefreshafterprrssingsearchbutton());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_WhenAdminSorttheCompanyNameinAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminSorttheCompanyEmailinAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingfromEmail());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCompanyNameisShowinginAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchcompany.VerifcompanyNameisSortedinAscendingOrder());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_WhenAdminVistsAnotherPageAfterApplyingAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminRefreshtheBrowserAfterApplyingAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.RefreshBrowser());
    }
// Load More button has not shown
   /* @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_WhenAdminUseSortingAfterPressingLoadMoreButton() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonLoadMoreButton());
        Assert.assertTrue(searchcompany.VerifTwoHunderedMorecompaniesareShowingAfterPressingLoadMoreButton());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchcompany.VerifTwoHunderedCompaniesareShowingAfterSorting());

    }*/


    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminSearchtheCompanybyCompanyName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.VerifUpdatedCompanyInformationIsShowing());
    }


    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminSearchCompanybyCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredEmailAddressIsShowing());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminSearchCompanybyPhone() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredPhoneNumberIsShowing());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_WhenAdminSearchCompanybyEnteringInvalidCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminSearchCompanybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminRemoveStateTag() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());*/
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})

    public void TC_14_WhenAdminSearchCompanybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonZipCodeDropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
//        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifZipcodeTagisShowingaAfterSelectingtheZipFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifCompanyStatusTagisShowingaAfterSelectingtheZipFromAdncedFilter());
    }


    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminClicksonResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonZipCodeDropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminSelectsBrandLogoFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickShowCompanylogocheckbox());
        Assert.assertTrue(searchcompany.VerifyOtherFilterHasDiabled());

    }

}
