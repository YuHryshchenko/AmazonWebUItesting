package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenuWomensFashion extends BasePage {

    private static final By CHOOSE_CATALOG_WOMENS_HANDBAGS = By.xpath("//div[@id='hmenu-content']//a[@class='hmenu-item' and contains(.,'Handbags')]");

    public MainMenuWomensFashion(WebDriver driver) {
        super(driver);
    }

    public void clickChooseCatalogHandBagsWomansFashion() {
        driver.findElement(CHOOSE_CATALOG_WOMENS_HANDBAGS).click();
    }


}
