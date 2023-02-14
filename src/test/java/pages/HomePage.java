package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();

    //*********Page Variables*********
    String baseURL = prop.getProperty("BaseURL");

    //*********Page Methods*********
    //Go to Homepage
    public void geturl(){

        driver.get(prop.getProperty("BaseURL"));
    }

}
