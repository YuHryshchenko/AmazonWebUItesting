package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInConfirmationPageFirefox extends BasePageFirefox {

    private static final By AUTHORIZATION_INPUT_CONFIRMATION_PASSWORD = By.xpath("//div[@id='authportal-center-section']//input[@id='ap_password']");
    //private static final By AUTHORIZATION_INPUT_CONFIRMATION_CHARACTERS = By.xpath("//div[@id='audio-captcha-section']//input[@id='auth-captcha-guess']");

    public SignInConfirmationPageFirefox(WebDriver foxDriver) {
        super(foxDriver);
    }

    public void inputPasswordForConfirmationAuthorization(final String keyword) {
        foxDriver.findElement(AUTHORIZATION_INPUT_CONFIRMATION_PASSWORD).sendKeys(keyword);
    }

}
