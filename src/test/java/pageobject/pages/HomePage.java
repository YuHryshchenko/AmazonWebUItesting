package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final By CHOOSE_CATALOG_ALL_CATEGORY_PRODUCT = By.xpath("//div[@id='nav-main']//a[@id='nav-hamburger-menu'] | //div[@id='nav-belt']//a[@id='nav-hamburger-menu']/child::i");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCatalogAllCategoryProduct() {
        driver.findElement(CHOOSE_CATALOG_ALL_CATEGORY_PRODUCT).click();
    }

}
