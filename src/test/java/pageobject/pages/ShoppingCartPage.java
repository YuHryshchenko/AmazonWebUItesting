package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    private static final By ADDED_PRODUCT_TO_CART = By.xpath("//span[@id='nav-cart-count']");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getNumberOfProductAddedToTheCart() {
        return driver.findElement(ADDED_PRODUCT_TO_CART).getText();
    }

}
