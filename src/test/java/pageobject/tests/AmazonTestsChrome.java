package pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestsChrome extends BaseTestChrome {

    private String NAME_NEEDED_CATEGORY = "Handbags & Wallets";
    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";

    @Test()
    public void chooseNeededProduct() {
        getHomePage().clickCatalogAllCategoryProduct();
        getBasePage().implicitWait(30);
        getAllCategoryPopUp().clickToUncoverCatalogProduct();
        getAllCategoryPopUp().selectionProductCategoryWomensFashion();
        getBasePage().implicitWait(30);
        getMainMenuWomensFashion().clickChooseCatalogHandBagsWomansFashion();
        getWomensHandbagsPage().clickChooseHandBagsWomansFashion();
        Assert.assertTrue(getProductPage().getTextProductInTheNeededCategory().contains(NAME_NEEDED_CATEGORY));
    }

    @Test()
        public void addToCartNeededProduct() {
        getHomePage().clickCatalogAllCategoryProduct();
        getBasePage().implicitWait(30);
        getAllCategoryPopUp().clickToUncoverCatalogProduct();
        getAllCategoryPopUp().selectionProductCategoryWomensFashion();
        getBasePage().implicitWait(30);
        getMainMenuWomensFashion().clickChooseCatalogHandBagsWomansFashion();
        getWomensHandbagsPage().clickChooseHandBagsWomansFashion();
        getProductPage().clickAddToCartHandBagsWomansFashion();
        Assert.assertEquals(getShoppingCartPage().getNumberOfProductAddedToTheCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

}
