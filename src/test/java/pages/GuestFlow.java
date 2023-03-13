package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuestFlow extends BasePage {
    public GuestFlow(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By PhoneNoField = By.xpath("(//input[@class='form-control '])[2]");
    public static By ContinueGuestBtn = By.xpath("//div[@class='ant-col ant-col-16']//div//div//form[@id='basic']//div//button[@type='submit']");
    public static By OtpField1 = By.xpath("(//input[@data-id='0'])[3]");
    public static By OtpField2 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-1']");
    public static By OtpField3 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-2']");
    public static By OtpField4 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-3']");
    public static By OtpField5 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-4']");
    public static By OtpField6 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-5']");
}
