package tests.US8SearchEntity;

import tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;


public class SearchEntityTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

   @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_WhenAdminClickSearchButtonWithouttypingAnythingFromEntityManagementPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchentity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        // Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchentity.VerifPagehasRefreshafterprrssingsearchbutton());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void WhenAdminSearchtheEntitybyEntityName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
       Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createEntity.VerifyEntityNameisShowinginEntityTable());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminSearchEntitybyEntityEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredEmailAddressIsShowing());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_WhenAdminSearchEntitybyEntityPhoneNumber() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredPhoneNumberIsShowing());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminSearchEntitybyEnteringInvalidEntityNameonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Alphabates")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.VerifNoEntityisShowingafterProvidingInvalidData());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminSorttheEntityNameinAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminSorttheEntityEmailinAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromEmail());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromEmail());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_VerifyEntityNameisShowinginAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
         Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchEntity.VerifEntityNameisSortedinAscendingOrder());

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminVistsAnotherPageAfterApplyingAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminRefreshtheBrowserAfterApplyingAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.RefreshBrowser());
    }

   /* @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminUseSortingAfterPressingLoadMoreButtonFromEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonLoadMoreButton());
        Assert.assertTrue(searchEntity.VerifdMoreEntitiessareShowingAfterPressingLoadMoreButton());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchEntity.WhenAdminsorttheEntitesAfterPressingLoadMoreButton());

    }*/

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminSearchEntityybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminClicksonClearaaltagafterSelectingStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchEntity.VerifyEntityManagementPageHasSettoDefaultVauleafterPressingCleerAllTag());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminRemoveStateTagfromEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        //Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminSearchEntitybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifZipcodeTagisShowingaAfterSelectingtheZipFromAdncedFilter());
    }


    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminPressResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
    }
}
