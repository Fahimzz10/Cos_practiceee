package tests.US11CreateProperty;

import tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class CreateNewPropertyTestCases extends BaseTest {


    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewPropertyButtonIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.verifyCreateNewPropertyButtonHasDisplayed());

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewPropertDraweHasDisplayedAfterClickingonCreateNewPropertyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyyDrawerDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifySelectCompanyandSelectEntityareShowingOnResponsiblePartiesSectionofCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyResponsiblePartiesInformationareShowingonCreateNewPropertDrawer());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyPrpertInformationareShowingonCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyPropertyformationareShowingonCreateNewPropertDrawer());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyLocationInformationareShowingonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(company.VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyardwareProviderInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyConnectwitHardwareProviderFieldIsShowingonCreateNewPropertDrawer());
        Assert.assertTrue(properties.verifyConnectwitSiteFieldIsShowingonCreateNewPropertDrawer());

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyOtherProviderInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyConnectwiththeOtherProviderFieldIsShowingonCreateNewPropertDrawer());


    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyFeesInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyFessInformationareShowinginFeesSectionofCreateNewDrawer());

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_VerifyPropertyFeesInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyPropertyFessInformationareShowinginFeesSectionofCreateNewDrawer());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyTransactionFeesInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyTransactionFessInformationareShowinginFeesSectionofCreateNewDrawer());


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_VerifyBrandInformationsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyBrandInformationareShowingOnCreateNewDrawer());

    }

    /*@Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_VerifySavePropertyandCreateAnotherPropertButonsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*//*
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyBrandInformationareShowingOnCreateNewDrawer());

    }*/

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_VerifySavePropertyandCreateAnotherPropertButonsareShowingOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCreatePropertyButtonIsShowingonCreateNewPropertDrawer());
        Assert.assertTrue(properties.verifySaveandCreateAnotherPropertyButtonIsShowingonCreateNewPropertDrawer());

    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_VerifyOptionstoCreateCompnayandEntityareShowingUnderResponsiblePartiesSectionOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCreateCompanyOptionsisShowing());
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_VerifyOptionstoCreateEntityareShowingUnderResponsiblePartiesSectionOnCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCreateEntityOptionsisShowing());
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyPopuphasDisplyedAfterClickingonCreateNewCompanyfromResponsiblePartiesSectionOfCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateCompanyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyLeaveandContinueButtonsareShowingonthePopuWhichHasDisplyedAfterClickingonCreateNewCompanyfromResponsiblePartiesSectionOfCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateCompanyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.verifyLeveButtonisShowingonPopup());


    }


    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyUserStaysonCreateNewPropertDrawerAfterClickingonContinueFromCreateCompanyPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateCompanyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyyDrawerDisplayed());

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyAdminhasRedirectedToCreateNewCompanytDrawerAfterClickingonLeaveFromCreateCompanyPopup() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateCompanyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonLeaveButton());
        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());

    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifyNewCompanyHasCreatedAfterClickingonCreateCompanyButtonfromCreateNewPropertDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateCompanyLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonLeaveButton());
//        Assert.assertTrue(company.VerifyCreateNewCompanyDrawerDisplayed());
       // Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteRandomCompanyEmail());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.WriteRandomEINNumber());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_VerifyNewlyCreatedCompanyisShowinginSelectCompanyDropdownofCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(properties.verifyCompanyNameIsShowingonIntheSelectCompanyDropdown());


    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_VerifyEntityFieldisEnabledAfterSelectingTheCompnayfromCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(properties.clickonCompanyName());
        Assert.assertTrue(properties.verifySelectEntityFieldisEnabledAfterSelectingCompany());
    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_VerifNoDatayisShowinginEntityDropdownAfterSelectingNewlyCreatedCompnay() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(properties.clickonCompanyName());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.VerifNoDatayisShowinginEntityDropdownAfterSelectingNewlyCreatedCompnay());
    }

    @Test(priority =31)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_VerifyPopuphasDisplyedAfterClickingonCreateEntityfromResponsiblePartiesSectionOfCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateEntityLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());

    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifyLeaveandContinueButtonsareShowingonthePopuWhichHasDisplyedAfterClickingonCreateEntityfromResponsiblePartiesSectionOfCreateNewPropertDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateEntityLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.verifyLeveButtonisShowingonPopup());

    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyUserStaysonCreateNewPropertyDrawerAfterClickingonContinueFromCreateEntityPopup() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateEntityLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
//        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonContinueButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyyDrawerDisplayed());

    }


    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyAdminhasRedirectedToCreateNewEntityDrawerAfterClickingonLeaveFromCreateEntitPopup() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity entity= new CreateEntity(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCreateEntityLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
//        Assert.assertTrue(properties.verifyContinueButtonisShowingonPopup());
        Assert.assertTrue(properties.clickonLeaveButton());
        Assert.assertTrue(entity.VerifyCreateNewEntityDrawerHasDisplayed());

    }

//Need to discuss that with tahia
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_Checkwhathappenswhenadminselectcompanyandenittythenchangeonlythecompanythatdoesnothaveanyentity () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
       // Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(properties.clickonCompanyName());
        //Assert.assertTrue(properties.verifySelectEntityFieldHasDisabledAfterSelectingCompany());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyPopuphasdisplyedwhenadminclicksoncreateentityafterprovidinginformationontheinputfieldsofcreatepropertydrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(properties.clickonCreateEntityLink());
        Assert.assertTrue(properties.verifyPopuphasdisplayedafterClickingonCreateCompanyLink());
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_VerifyEntityFiledisDisabledWhenAdminDoesnotProvidestheCompanyNameoncreatepropertydrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifySelectEntityFieldIsDisabled());
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_VerifyEntityFiledisEnabledAfterProvidestheCompanyNameoncreatepropertydrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("CompanyName1")));
        Assert.assertTrue(properties.clickonCompanyName());
        Assert.assertTrue(properties.verifySelectEntityFieldisEnabledAfterSelectingCompany());
        //Assert.assertTrue(properties.clickSelectEntityDropdown());
    }


    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-41,43"})
    public void TC_43_WhenAdminDoesnotProvidethePropertyNameonCreateNewPropertyDrawer () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(""));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankPropertyErrorMessage(msg.BlankPropertyErrorMsg()));
    }


    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-44,45"})
    public void TC_45_WhenAdminProvideZipCodewithLessthanFiveDigitsonCreateNewpropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_WhenAdminProvideinvalidZipCodefieldononCreateNewpropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_VerifyErrorMessageisShowingWhenAdminUseInvalidFormatforZipcodeonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }



    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_WhenAdminProvideInValidDatainZipCodefieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_WhenAdmindoesnotEnterZipCodeinonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(""));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
       /* Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));*/
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankZipCodeErrorMessage(msg.BlankZipErrorMsg()));
    }

    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_VerifyStateFieldisEmptyandDisableonCreateNewPropertyDrawer() throws InterruptedException {
        CreateEntity createentity = new CreateEntity(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyStateFieldisDisabled());
    }


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_VerifyStateFieldisDisabledAfterProvidingInvalidZipCodeonCreateNewPropertyDrawer() throws InterruptedException {
        CreateEntity createentity = new CreateEntity(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyStateFieldisDisabled());
    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_VerifyCityFieldisDisableonCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCityFieldisDisabled());
    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_VerifyCityFieldisDisabledAfterProvidingInvalidZipCodeonCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyCityFieldisDisabled());
    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_56_VerifyCountryFieldisDisableonCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyCountryFieldisDisabled());
    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_VerifyCountryFieldisDisabledAfterProvidingInvalidZipCodeonCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(properties.verifyCountryFieldisDisabled());
    }


    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-59"})
    public void TC_59_WhenAdmindoesnotEnterAddressCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(""));
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(company.VerifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_VerifyConnectwithSiteisDisabledWhenAdminHasnotSelectedAnyHardwareProvideronCreateNewPropertyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.verifyConnectWithSiteFieldisDisabled());
    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_WhenAdminProvidesAlphabtesinEquipmentFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Alphabates")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyEquipmantFeerrorMessage(msg.EquipmentFeeErrorMsg()));
    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_WhenAdminProvidesSpecialCharactersinEquipmentFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyEquipmantFeerrorMessage(msg.EquipmentFeeErrorMsg()));
    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-63"})
    public void TC_63_WhenAdminProvidesInvalidharactersinEquipmentFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyEquipmantFeerrorMessage(msg.EquipmentFeeErrorMsg()));
    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void TC_64_WhenAdmindoesnotProvidesanyDatainEquipmentFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterEquimentFees(""));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankEquipmantFeerrorMessage(msg.EquipmentFeeBlankErrorMsg()));
    }

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-65"})
    public void TC_65_WhenAdminProvidesAlphabtesinChargerFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Alphabates")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyPerChargerFeerrorMessage(msg.ChargerFeeErrorMsg()));
    }

    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-66"})
    public void TC_66_WhenAdminProvidesSpecialCharactersinChargerFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyPerChargerFeerrorMessage(msg.ChargerFeeErrorMsg()));
    }

    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-67"})
    public void TC_67_WhenAdminProvidesInvalidharactersinChargerFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyPerChargerFeerrorMessage(msg.ChargerFeeErrorMsg()));
    }

    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_WhenAdmindoesnotProvidesanyDatainChargerFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterPerChargerFees(""));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankPerChargerFeerrorMessage(msg.BlankChargerFeeErrorMsg()));
    }

    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_WhenAdminProvidesAlphabtesinInstallationFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Alphabates")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyInstallationFeerrorMessage(msg.InstallationFeeErrorMsg()));
    }

    @Test(priority = 60)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_WhenAdminProvidesSpecialCharactersinInstallationFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyInstallationFeerrorMessage(msg.InstallationFeeErrorMsg()));
    }

    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_WhenAdminProvidesInvalidharactersinInstallationFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyInstallationFeerrorMessage(msg.InstallationFeeErrorMsg()));
    }

    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_WhenAdmindoesnotProvidesanyDatainInstallationFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterInstallationFees(""));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankPerInstallationFeerrorMessage(msg.BlankInstallationFeeErrorMsg()));
    }

    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_WhenAdminProvidesAlphabtesinChargingSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Alphabates")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyChargerSessionFeerrorMessage(msg.ChargerSessionFeeErrorMsg()));
    }

    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-74"})
    public void TC_74_WhenAdminProvidesSpecialCharactersinChargerSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyChargerSessionFeerrorMessage(msg.ChargerSessionFeeErrorMsg()));
    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminProvidesInvalidharactersinChargernSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyChargerSessionFeerrorMessage(msg.ChargerSessionFeeErrorMsg()));
    }

    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-76"})
    public void TC_76_WhenAdmindoesnotProvidesanyDatainChargerSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionFees(""));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankChargerSessionFeerrorMessage(msg.BlankChargerSessionFeeErrorMsg()));
    }

    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-78"})
    public void TC_78_WhenAdminProvidesAlphabtesinMinimumSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
      /*  Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Alphabates")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyMinimumSessionFeerrorMessage(msg.MinimumSessionFeeErrorMsg()));
    }

    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-79"})
    public void TC_79_WhenAdminProvidesSpecialCharactersinMinimumSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyMinimumSessionFeerrorMessage(msg.MinimumSessionFeeErrorMsg()));
    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-80"})
    public void TC_80_WhenAdminProvidesInvalidharactersinMinimumSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyMinimumSessionFeerrorMessage(msg.MinimumSessionFeeErrorMsg()));
    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-81"})
    public void TC_81_WhenAdmindoesnotProvidesanyDatainMinimumSessionFeeFieldonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.enterSessionMinimumFees(""));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyBlankMinimumSessionFeerrorMessage(msg.BlankMinimumSessionFeeErrorMsg()));
    }

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-77"})
    public void TC_77_VerifyTwoOptionsareShowinginTransactionFeeDropdownonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonTransactionFeeDropdown());
        Assert.assertTrue(properties.verifyFlatBaseOptionIsShowinginTransactionFeeDropdown());
        Assert.assertTrue(properties.verifyPercentageBaseOptionIsShowinginTransactionFeeDropdown());


        // Assert.assertTrue(properties.verifyBlankChargerSessionFeerrorMessage(msg.BlankChargerSessionFeeErrorMsg()));
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-82"})
    public void TC_82_VerifyErrormessageisShowingWhenAdminUploadImagemorethan3MbsonCreateNewPropertyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(properties.uploadImageMorethan2Mb());
        Assert.assertTrue(properties.verifyErrorMessageisShowingAfterUploadingImageMorethan3Mb(msg.Maximumimagesizeerrormsg()));

    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-84"})
    public void TC_83_VerifyErrormessageisShowingWhenAdminUploadImageUsingInvalidDimension() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(editCompany.updateLogoUsingInvalidDimension());
//        Assert.assertTrue(editCompany.VerifyInvalidImageDimesionErrorMessage(msg.Invalidimagedimensionerrormsg()));

    }

    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-86"})
    public void TC_86_WhenAdminProvidesValidDataAndSelectsMonthlyFrequencyFeeOptiononCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
       /* Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
    }


    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-133"})
    public void TC_133_VerifyNewlyCreatedPropertyisShowingonAllPropertiesPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("PropertyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(properties.verifyNewlyCreatedPropertisShowingonPropertyPage());
    }

    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-106"})
    public void TC_106_VerifyAdminisAbleToCreateNewPropertyWhenHeSelectsOneTimeOptionFeeFrequencyDropdwon() throws InterruptedException {
        EditCompany editCompany= new EditCompany(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
     /*   Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertywithOneTimeFee")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        /*Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectOneTimeFeefromEquipmentDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectOneTimeFeefromInstallationDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("PropertywithOneTimeFee")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(properties.verifyCompanywithOneTimeFrequencyFeeisShowingonPropertyPage());
    }

    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-110"})
    public void TC_110_VerifyAdminisAbleToCreateNewPropertyAfterSelectingPerYearFeeFrequencyOption() throws InterruptedException {
        EditCompany editCompany= new EditCompany(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        /*Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectYearlyFrequencyfromEquipmentFee());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectYearlyFrequencyfromChargerFee());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectYearlyFrequencyfromInstallationFee());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("YealryFeeProperty")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(properties.verifyPropertywithYearlyFrequencyFeeisShowingonPropertyPage());
    }


    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-134"})
    public void TC_134_WhenAdminSelectsUnknownCompanyFromSelectCompanyDropdownofCreateNewProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(properties.clickonUnknownCompanyName());
        Assert.assertTrue(properties.verifySelectEntityFieldisEnabledAfterSelectingCompany());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectUnknownEntityFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        /*Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
    }

    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-135"})
    public void TC_135_VerifyUnknownPropertyandEntityisShowingUnderCompanyandEntityColumnonAllPropertiesPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.searchPropertyByName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(properties.verifyUnknownCompanyisShowingUnderCompanyColumnonPropertyPage());
        Assert.assertTrue(properties.verifyUnknownEntityisShowingUnderEntityColumnonPropertyPage());
    }

  /*  @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-138"})
    public void TC_138_VerifyAdminCannotSelectSameProviderMultipleTimeWhileCreatingNewProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*//*
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.writeCompnayName(prop.getProperty("UnknownCompany")));
        Assert.assertTrue(properties.clickonUnknownCompanyName());
        Assert.assertTrue(properties.verifySelectEntityFieldisEnabledAfterSelectingCompany());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectUnknownEntityFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());
        Assert.assertTrue(properties.clickOnConnectMoreProviderButton());
        Assert.assertTrue(properties.clickOnConnectWithOtherProviderDropdown());
        Assert.assertTrue(properties.verifyPreviouslySelectedProviderNameisDisabled());
    }


    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-139"})
    public void TC_139_VerifyAdminadminCanSelecttheSameProviderinSecondInputfieldafterRemovingFromtheFirstFieldOnCreatingNewProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*//*
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.verifySelectEntityFieldisEnabledAfterSelectingCompany());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());
        Assert.assertTrue(properties.clickOnConnectMoreProviderButton());
        Assert.assertTrue(properties.clickOnRemoveButton());
        Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));

    }*/


    @Test(priority = 82)//Done
    @TestParameters(testCaseId = {"TC-115"})
    public void TC_115_VerifyDollarisShowingasPrefixWhenAdminSelectsFlatBaseFromTransactionFeeDropdownonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonTransactionFeeDropdown());
        Assert.assertTrue(properties.verifyFlatBaseOptionIsShowinginTransactionFeeDropdown());
        Assert.assertTrue(properties.selectFlatBaseFromTransactionFeeDropdown());
        Assert.assertTrue(properties.verifyDollarSignisShowingWhenadminSelectsFlatBaseOptionFromTransactionFeeDropdown());

    }

    @Test(priority = 83)//Done
    @TestParameters(testCaseId = {"TC-116"})
    public void TC_116_VerifyPercentageSignisShwingasPrefixWhenAdminSelectsFlatBaseFromTransactionFeeDropdownonCreateNewPropertyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonTransactionFeeDropdown());
        Assert.assertTrue(properties.selectpercentageBaseFromTransactionFeeDropdown());
        Assert.assertTrue(properties.verifyPercentageSignisShowingWhenadminSelectsFlatBaseOptionFromTransactionFeeDropdown());

    }

    @Test(priority = 84)//Done
    @TestParameters(testCaseId = {"TC-116"})
    public void TC_116_VerifyAdminisAbletoCreatepropertyAfterSelectingPercentageBaseFromTransactionFeeDropdwon() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());*/
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectCompanyNameFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.selectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writePropertyName(prop.getProperty("PropertyName")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(properties.clickHardwareProviderDropdown());
        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
        /*Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.clickonTransactionFeeDropdown());
        Assert.assertTrue(properties.selectpercentageBaseFromTransactionFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyCreateNewPropertyDrawerHasClosed());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
    }




}
