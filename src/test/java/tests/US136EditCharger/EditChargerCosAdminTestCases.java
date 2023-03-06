package tests.US136EditCharger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;

public class EditChargerCosAdminTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckEditButton() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditButton());
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheChargerTitleAboveEditDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyChargerTitleAboveEditDrawer());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckAllSectionTitleOfEditDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditDrawerNecessarySection());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_VerifyEditChargerDrawerHasDisplayedAfterClickingOnEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditDrawerNecessarySection());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckUserCanEditTheInputField() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyInputFieldEditble());
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckCrossButtonVisibleInsideLocationField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCharger editChargers=new EditCharger(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Space 10",500));
        Assert.assertTrue(createCharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createCharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCrossButtonInsideLocationField());
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckSearchLocationAndSelectFromDropdown() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(createcharger.ClickButton(ChargerListPropertyAdmin.SelectedLocationName,1500));
        Assert.assertTrue(editChargerCosAdminUpdated.verifySearchLocationAndSelectFromDropdown());

    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckCopiedMsgAfterClickOnCopyButton () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CosAdminChargerList cosAdminChargerList = new CosAdminChargerList(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(updateChargerPropertyAdmin.verifyCopyButtonMsg());
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckCopiedUrlCanPasteToAnotherTabToSeeTheCharger() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCopyPasteUrl());
    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckCreateNewLocationDrawer() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.CreateNewLocation,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.DiscardBtn,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCreateNewLocationDrawerFromEditDrawer());
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckClickOnViewLocationNavigateToGoogleMap() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"My New Charger-30",1000));
        Assert.assertTrue(createCharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.ViewLocation,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyGoogleMapLink());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_DeactivateChargerPopUpMsgWithButtons() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.DeactivateChargerButton,2000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyPopUpMsgWithTwoButtonsOfDeactivateCharger());
    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_CheckFromTableShowingTheEditedData() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyTheEditedInfoInTable());

    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-63"})
    public void TC_63_CheckEditedDataFromDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyTheEditedInfoInDrawer());

    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void TC_64_CheckErrorMsgForInvalidDataForMandatoryField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyErrorMsgForInvalidData());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-65"})
    public void TC_65_CheckWhatHappensWhenAdminSearchForInvalidDataInTheSelectField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyNoDataMsgForSearchingInvalidData());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_WhenAdminClicksCrossButtonOfTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_WhenAdminClicksCancelButtonOfTheDrawerWithoutInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_WhenAdminClicksOutsideTheDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue((createcharger.clickonoutsidethedrawer()));
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_WhenAdminClicksCrossButtonOfEditDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"Selenium",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_WhenAdminClicksCrossButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"Selenium2",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(updateChargerPropertyAdmin.verifyDiscardAndContinueButton());
    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_WhenAdminClicksDiscardButtonEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger",1500));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-74"})
    public void TC_74_WhenAdminClicksCancelButtonOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminClicksCancelButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-76"})
    public void TC_76_AdminClicksDiscardButtonEnteringAnyInputWhenPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-77"})
    public void TC_77_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-78"})
    public void TC_78_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInputNeccessaryButtonShowing() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-79"})
    public void TC_79_AdminClicksOutsideOfTheDrawerAndDiscardButtonAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-82"})
    public void TC_82_CheckEditedDataFromDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyChangeNameInAuditLog());
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-83"})
    public void TC_83_CheckUserNameOfAuditLogMatchWithAccountName() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"My New Charger", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyAccountNameInAuditLog());
    }



    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-84"})
    public void TC_84_CheckUpdateTimeOfAuditLog() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"My New Charger", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedTime());
    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_85_CheckUpdateDateOfAuditLog() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedDate());
    }

}
