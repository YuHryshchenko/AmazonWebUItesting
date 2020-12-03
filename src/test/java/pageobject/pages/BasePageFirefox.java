package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePageFirefox {

    WebDriver foxDriver;

    public BasePageFirefox(WebDriver foxDriver) {
        this.foxDriver = foxDriver;
    }

    public void implicitWait(long timeToWait) {
        foxDriver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }

    public void waitVisibilityOfAddToCartPopup(long timeToWait, By locator) {
        WebDriverWait wait = new WebDriverWait(foxDriver, timeToWait);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
