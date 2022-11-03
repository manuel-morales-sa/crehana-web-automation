package Tests.AbstractBaseTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.awt.*;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;



public abstract class TestBase extends AbstractTestNGCucumberTests {
    public abstract String getName();

    public abstract void setUpPage() throws AWTException, SQLException, InterruptedException;

    public static WebDriver driver;
    private static String url;
    private static String  browserName;
    public static boolean firtsLaunch = true;

    @Parameters({"browserName","url"})
    @BeforeTest
    public void setUpWeb(String browserName,String url) throws MalformedURLException, InterruptedException {
        TestBase.url = url;
        TestBase.browserName = browserName;
        setDriver();
    }

    public static WebDriver setDriver(){
        if (TestBase.browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        }else {
            System.setProperty("webdriver.gecko.driver","geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get(TestBase.url);
        return driver;
    }

    @AfterTest
    public void close(){
       driver.close();
    }
}