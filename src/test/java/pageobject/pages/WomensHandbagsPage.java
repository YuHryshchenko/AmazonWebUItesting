package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomensHandbagsPage extends BasePage {

    private static final By CHOOSE_WOMENS_HANDBAGS = By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//span[@class='rush-component']//following-sibling::div[position()=1]//child::span");

    public WomensHandbagsPage(WebDriver driver) {
        super(driver);
    }

    public void clickChooseHandBagsWomansFashion() {
        driver.findElement(CHOOSE_WOMENS_HANDBAGS).click();
    }
}
