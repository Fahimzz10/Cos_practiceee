package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Set;

public class BaseTest {
    public WebDriver driver;

    Set<Cookie> cookies;

    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeClass
    public void setup () throws IOException {

        try
        {
            for(Cookie cookie:cookies)
            {
                driver.manage().addCookie(cookie);
            }
        }
        catch(Throwable e)
        {
            System.err.println("Error While setting Cookies: "+ e.getMessage());
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }


    @AfterClass
    public void teardown () {
        try
        {
            cookies=driver.manage().getCookies();
            /*if(driver != null){
                driver.quit();
            }*/
        }
        catch(Throwable e)
        {
            System.err.println("Error While getting Cookies:" + e.getMessage());
        }
        // driver.quit();
    }
}
