package tests.US13SearcandFileterProperties;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class SearchPrropertiesTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyBrowserhasRereshafterProvidingSpaceinSearchBar() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty createProperty = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchandfilter.whenAdminProvidesSpaceinSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminSearchPropertybyProprtyName() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(property.verifyNewlyCreatedPropertisShowingonPropertyPage());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_WhenAdminSearchPropertybyCompanyName() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifCompnayNameisShowingonProprtyPage());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_WhenAdminSearchPropertybyEntityName() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifEntityNameisShowingonProprtyPage());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyCrossButtonHasDisplayedAfterTypingtheName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(searchandfilter.verifCrossButtonHasDisplyed());
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyProvidedNameHasRemovedAfterClickingonCrossButton() throws InterruptedException, IOException {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(searchandfilter.clickOnCross());
        Assert.assertTrue(searchandfilter.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_Checkwhathappenswhenadminclicksonthecrossoptionaftersearchinganyproperty () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickOnCross());
        Assert.assertTrue(searchandfilter.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminOpenPropertyTabOnIncognitoMode () throws InterruptedException, IOException {
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        Assert.assertTrue(searchandfilter.openPropertyPageinIncognitoMode());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminPressEnterButtonAfterSearchingAnyProperty () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(searchandfilter.clickEnterButton());
        Assert.assertTrue(property.verifyNewlyCreatedPropertisShowingonPropertyPage());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_VerifyCountonPropertyPageAfterSearchingAnyProperty () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.verifCountAfterSorting());
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhatHappensWhenAdminCliksonLoadMoreButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchandfilter.clickonLoadMoreButton());
        Assert.assertTrue(searchandfilter.verifyMorepropertiesareShowingAfterPressingLoadMoreButton());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_VerifyCountonPropertyPageAfterClikingonLoadMoreButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(searchandfilter.clickonLoadMoreButton());
        Assert.assertTrue(searchandfilter.verifyMorepropertiesareShowingAfterPressingLoadMoreButton());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_VerifyCountonPropertyPageAfterSearchingAnyProperty () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickonLoadMoreButton());
        Assert.assertTrue(searchandfilter.verifyPropertiesArematchingWithSearchedProperty());
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_VerifycompanynameareShowinginsuggestionwhenadminentercompnaynameonadvancefileter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.verifCompnayNameisShowingonAdvnaceFilter());
        //Assert.assertTrue(searchcompany.ClickonApplyButton());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_VerifyAdvanceFilterDrawerHasClosedAfterSelectingCompnayName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifySelectedCompanyTagisShowingonPropertyPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
       Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyClearAllTagisShowingonPropertyPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());*/
        Assert.assertTrue(searchandfilter.verifyClearAllTagisShowingonPropertyPage());

    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyentitynameisShowinginsuggestiononadvancefileterDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.verifEntityNameisShowingonAdvnaceFilter());
       

    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyAdvanceFilterDrawerHasClosedAfterSelectingentityName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifySelectedentityTagisShowingonPropertyPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());
        Assert.assertTrue(searchandfilter.verifyEntityTagisShowingonPropertyPage());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_VerifyClearAllTagisShowingonPropertyPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyClearAllTagisShowingonPropertyPage());

    }


    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_VerifyStateNameisShowinginsuggestiononadvancefileterDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchandfilter.verifStateNameisShowingonAdvnaceFilter());


    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_VerifyAdvanceFilterDrawerHasClosedAfterSelectingStateName() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchandfilter.verifStateNameisShowingonAdvnaceFilter());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifySelectedStateTagisShowingonPropertyPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchandfilter.verifStateNameisShowingonAdvnaceFilter());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyAdvanceFilterDrawerHasClosed());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyAlltheSelectedPropertiesareShowingWhenadminselectsMultipleTagsonAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());




    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyAlltheSelectedTagsareShowingonPropertiesPae() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyEntityTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());




    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_WenAdminRemovesOneEntityTagAfterSelectingMultipleEntityTagFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
      //  Assert.assertTrue(searchandfilter.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectAnotherEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyEntityTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickOnCloseImage());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

   }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyOthertagsareShowingAfterRemovinOneEntityTagFromAdvanceFilter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectAnotherEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyEntityTagisShowingonPropertyPage());
       // Assert.assertTrue(searchandfilter.verifyAnoterEntityTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickOnCloseImage());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
//        Assert.assertTrue(searchandfilter.VerifyEntityTagHasbeenremoved());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyAnoterEntityTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());

    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckWhatappenWenAdminRemovesOneTagFromMultipleFIlter() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectAnotherEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.clickonCrosstoRemoveEstateTag());
     //   Assert.assertTrue(searchandfilter.VerifyEntityTagHasbeenremoved());

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckWhatappenWenAdminRefreshthebrowserafterRemovesOneTag() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickOnDrawerTitle());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectAnotherEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchandfilter.clickonCrosstoRemoveEstateTag());
        Assert.assertTrue(searchandfilter.VerifyEntityTagHasbeenremoved());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchandfilter.verifyStateTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyAnoterEntityTagisShowingonPropertyPage());
        Assert.assertTrue(searchandfilter.verifyZipcodeTagisShowingonPropertyPage());

    }


    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyPreviosuslySelectedFieldsareShowingonAdvanceFilert() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.verifyPreviouslySelectedCompanyisShowingonAdvanceFilterPage());
        Assert.assertTrue(searchandfilter.verifyPreviouslySelectedEntityisShowingonAdvanceFilterPage());
        Assert.assertTrue(searchandfilter.verifyPreviouslySelectedStateisShowingonAdvanceFilterPage());
        Assert.assertTrue(searchandfilter.verifyPreviouslySelectedZipcodeisShowingonAdvanceFilterPage());

    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckWathappenWhenAdminClicksonResetAllButtonAfterSelectingMultipleTags() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty property = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchandfilter.clickononCompanyDropdown());
        Assert.assertTrue(searchandfilter.selectCompnayNameonAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickononEntityDropdown());
        Assert.assertTrue(searchandfilter.selectEntityNameFromAdvanceFilter());
        Assert.assertTrue(searchandfilter.clickStateDropdown());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchandfilter.clickonZipcodeDropdown());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());

    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenAdminCliksonLoadMoreButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(searchcompany.ClickonLoadMoreButton());
        Assert.assertTrue(searchandfilter.verifyMorepropertiesareShowingAfterPressingLoadMoreButton());
    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckWhatHappensWhenAdminCliksonLocationCountFromPropertPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        CreateProperty property=new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickononLocationCount());
        Assert.assertTrue(searchandfilter.verifyUserHasRedirectedTowardtheLocationTable());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyPropertyandCompanyTagsareShowingonLocationTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        CreateProperty property=new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        /*Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickononLocationCount());*/
        Assert.assertTrue(searchandfilter.verifyPropertyTagisShowinonLocationPageAfterClickingLocationCountFromPropertyPae());
        Assert.assertTrue(searchandfilter.verifyCompanyTagisShowinonLocationPageAfterClickingLocationCountFromPropertyPae());
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckWhatHappensWhenAdminCliksonChargerCountFromPropertPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        CreateProperty property=new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickononChargerCount());
//        Assert.assertTrue(searchandfilter.verifyUserHasRedirectedTowardtheChargerTable());
    }

    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_VerifyPropertyTagsareShowingonChargerTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        CreateProperty property=new CreateProperty(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        /*Assert.assertTrue(property.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchandfilter.clickononChargerCount());*/
        Assert.assertTrue(searchandfilter.verifyPropertyTagisShowinonLocationPageAfterClickingLocationCountFromPropertyPae());
    }














}

