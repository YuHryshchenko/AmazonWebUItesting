package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllCategoryPopUp extends BasePage {

    private static final By UNCOVER_CATALOG_PRODUCT = By.xpath("//ul[@data-menu-id='1']//child::li[position()<15]//div[text()='see all']/following::*[position()=1]");
    private static final By PRODUCT_CATALOG_WOMENS_FASHION = By.xpath("//div[@id='hmenu-content']//div[text()=\"Women's Fashion\"]/following::*[position()=1]");

    public AllCategoryPopUp(WebDriver driver) {
        super(driver);
    }

    public void clickToUncoverCatalogProduct() {
        driver.findElement(UNCOVER_CATALOG_PRODUCT).click();
    }

    public void selectionProductCategoryWomensFashion() {
        driver.findElement(PRODUCT_CATALOG_WOMENS_FASHION).click();
    }



}
