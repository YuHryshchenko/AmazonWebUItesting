package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPageFirefox extends BasePageFirefox {

    private static final By AUTHORIZATION_INPUT_EMAIL = By.xpath("//div[@id='authportal-main-section']//input[@type='email']");
    private static final By CLICK_BUTTON_CONTINUE = By.xpath("//div[@id='authportal-main-section']//input[@id='continue']");
    private static final By AUTHORIZATION_INPUT_PASSWORD = By.xpath("//div[@id='authportal-main-section']//input[@type='password']");
    private static final By CLICK_BUTTON_SIGNIN = By.xpath("//div[@id='authportal-main-section']//input[@id='signInSubmit']");


    public SignInPageFirefox(WebDriver foxDriver) {
        super(foxDriver);
    }

    public void inputEmailForAuthorization(final String keyword) {
        foxDriver.findElement(AUTHORIZATION_INPUT_EMAIL).sendKeys(keyword);
    }

    public void clickButtonContinueAuthorization() {
        foxDriver.findElement(CLICK_BUTTON_CONTINUE).click();
    }

    public void inputPasswordForAuthorization(final String keyword) {
        foxDriver.findElement(AUTHORIZATION_INPUT_PASSWORD).sendKeys(keyword);
    }

    public void clickButtonPasswordAuthorization() {
        foxDriver.findElement(CLICK_BUTTON_SIGNIN).click();
    }


}
