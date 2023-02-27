package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Random;

public class CosAdminChargerList extends BasePage {

    public CosAdminChargerList(WebDriver driver)  {
        super(driver);
    }
    RandomData rdata = new RandomData();

    public static By ChargerTitle = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[1]/div");
    public static By PropertyName = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div");
    public static By PropertyAddress = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div");
    public static By LocationName = By.xpath("//*[@id=\"__next\"]/main/section[2]/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div");
    public static By EditButton = By.xpath("//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Edit')]");



    public boolean ClickButton(By element, int delay) throws InterruptedException {
        Thread.sleep(delay);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(element);
        click(element);
        return true;
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
        String ActionCheck = driver.findElement(EditButton).getText();
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

    public boolean verifyActualData() throws InterruptedException{
        driver.findElement(CreateCharger.addchargerbtn).click();
        Thread.sleep(3000);
        Random objGenerator = new Random();
        CreateCharger createcharger = new CreateCharger(driver);
        CosAdminChargerList cosAdminChargerList = new CosAdminChargerList(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin =new ChargerListPropertyAdmin(driver);
        int randomNumber = objGenerator.nextInt(10000);
        System.out.println(randomNumber);
        String temp="Test Charger-"+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.selectproperty,"East Avenue",2000));
        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
        Assert.assertTrue((createcharger.clickonlocation()));
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.location,"Electric Charger",2000));
        Assert.assertTrue(createcharger.selectLoactionNameFromSelectPropertyDropdown());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Thread.sleep(1000);
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Thread.sleep(1500);
        String ChargerTitleCheck = driver.findElement(ChargerTitle).getText();
        System.out.println(ChargerTitleCheck);
        String PropertyNameCheck = driver.findElement(PropertyName).getText();
        System.out.println(PropertyNameCheck);
        String PropertyAddressCheck = driver.findElement(PropertyAddress).getText();
        System.out.println(PropertyAddressCheck);
        String LocationNameCheck = driver.findElement(LocationName).getText();
        System.out.println(LocationNameCheck);
        if (ChargerTitleCheck.equals(temp) && PropertyNameCheck.equals("East Avenue") && PropertyAddressCheck.equals("East Avenue, Rochester, NY, USA") && LocationNameCheck.equals("Electric Charger")  ){
            System.out.println("Wellll");
            return true;
        }
        else {
            System.out.println("Problem");
            return false;
        }


    }

}



