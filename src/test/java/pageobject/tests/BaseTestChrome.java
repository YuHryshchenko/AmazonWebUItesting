package pageobject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobject.pages.*;

public class BaseTestChrome {

    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\AmazonWebUItesting\\src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public AllCategoryPopUp getAllCategoryPopUp() {
        return new AllCategoryPopUp(getDriver());
    }

    public MainMenuWomensFashion getMainMenuWomensFashion() {
        return new MainMenuWomensFashion(getDriver());
    }

    public WomensHandbagsPage getWomensHandbagsPage() {
        return new WomensHandbagsPage(getDriver());
    }

    public ProductPage getProductPage() {
        return new ProductPage(getDriver());
    }

    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(getDriver());
    }

}
