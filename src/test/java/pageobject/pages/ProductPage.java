package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    private static final By ADD_TO_CART_HANDBAGS = By.xpath("//input[@id='add-to-cart-button']");
    private static final By PRODUCT_IN_THE_NEEDED_CATEGORY = By.xpath("//div[@id='wayfinding-breadcrumbs_feature_div']//a[contains(., 'Handbags & Wallets')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartHandBagsWomansFashion() {
        driver.findElement(ADD_TO_CART_HANDBAGS).click();
    }

    public String getTextProductInTheNeededCategory() {
        return driver.findElement(PRODUCT_IN_THE_NEEDED_CATEGORY).getText();
    }

}
