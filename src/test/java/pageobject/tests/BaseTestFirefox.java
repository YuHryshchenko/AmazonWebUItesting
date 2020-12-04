package pageobject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobject.pages.BasePageFirefox;
import pageobject.pages.HomePageFirefox;
import pageobject.pages.SignInPageFirefox;

import java.io.File;

public class BaseTestFirefox {

    private WebDriver foxDriver;
    private static final String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void browserSetUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\julia\\IdeaProjects\\AmazonWebUItesting\\src\\main\\resources\\geckodriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\julia\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\xwrqk30b.Yuliia"));
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        foxDriver= new FirefoxDriver();
        foxDriver.manage().window().maximize();
        foxDriver.get(AMAZON_URL);
    }

    @AfterMethod
    public void endTest() {
        foxDriver.quit();
    }

    public WebDriver getFoxDriver() {
        return foxDriver;
    }

    public BasePageFirefox getBasePageFirefox() {
        return new BasePageFirefox(getFoxDriver());
    }

    public HomePageFirefox getHomePageFirefox() {
        return new HomePageFirefox(getFoxDriver());
    }

    public SignInPageFirefox getSignInPageFirefox() {
        return new SignInPageFirefox(getFoxDriver());
    }
/*
    public SignInConfirmationPageFirefox getSignInConfirmationPageFirefox() {
        return new SignInConfirmationPageFirefox(getFoxDriver());
    }
 */

}
