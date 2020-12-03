package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageFirefox extends BasePageFirefox {

    private static final By CHOOSE_SIGNIN_PAGE = By.xpath("//div[@id='nav-belt']//span[@class='nav-line-2 nav-long-width']/span[@class='nav-icon nav-arrow null']");
    private static final By EXPECTED_AUTHORISATION_ACCOUNT = By.xpath("//div[@id='nav-belt']//span[@class='nav-line-1' and contains(.,'Hello, Yuliia')]");

    public HomePageFirefox(WebDriver foxDriver) {
        super(foxDriver);
    }

    public void clickOnAccountAndListsChoice() {
        foxDriver.findElement(CHOOSE_SIGNIN_PAGE).click();
    }

    public String getTextOnAccountAndListsChoice() {
        return foxDriver.findElement(EXPECTED_AUTHORISATION_ACCOUNT).getText();
    }

}
