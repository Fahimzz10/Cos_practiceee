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



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheHeaderOfColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(chargerListPropertyAdmin.verifyHeaderColumn());


    }
    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheLocationColumnWhenAdminDidNotAssignAnyChargerToLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.searchchargerfield,"Atom charger",1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyNAForNoLocation());


    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckDetailsButtonUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.detailsbutton,2000));
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButton()));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,2000));
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckLoadMoreButtonWithText() throws InterruptedException {
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

}
