package tests.US54ChargerListPropertyAdmin;




import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;
import java.util.Random;
public class ChargerListTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



//    @Test(priority = 1)//Done
//    @TestParameters(testCaseId = {"TC-1"})
//    public void TC_1_CheckTheHeaderOfColumn() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
//        Assert.assertTrue(chargerListPropertyAdmin.verifyHeaderColumn());
//    }

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheHeaderOfColumnAlternative() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyHeaderColumnAlternative());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckBlankContentUnderEachColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,"Atom charger",3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyingBlankContent());
    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheLocationColumnWhenAdminDidNotAssignAnyChargerToLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.SearchChargerField,"Automation Charger",4000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,2000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyNAForNoLocation());


    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckUpdatedLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.SearchChargerField,"Edited Charger",5000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,2000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.detailsbutton,2000));
//        Assert.assertTrue(createCharger.ClickButton(CreateCharger.selectlocation,3000));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.SelectedLocationFromOption,2000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyEditedLocation());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckDetailsButtonUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.detailsbutton,2000));
    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButton()));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,2000));
    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckLoadMoreButtonWithText() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButtonWithDigit()));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,2000));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckActualNumberOfChargerWithLeftSideOfLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyTheChargerCountWithLeftSideOFLoadMoreButton());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_VerifyActualNumberOfChargerWithTableCharger() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyTheWithTable());
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhenPAdminClicksOnTheLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyLoadMoreButtonAction());
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckTheChargerCountOnTopOfTheTable () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyChargerCountOnTop());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckWhatHappensWhenPropertyAdminRefreshThePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyTableDataAfterRefreshing());
    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhatHappensWhenPropertyAdminRefreshThePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyChargerCountOnTopAfterRefreshing());
    }



}
