package pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.pages.HomePage;

public class AmazonTestSignInFirefox extends BaseTestFirefox{

    private String INPUT_KEYWORDS = "Julia.Grischenko.2011@gmail.com";
    private String INPUT_PASSWORD = "SwNiuKQjYDTFp";
    private String EXPECTED_AUTHORISATION_WORDS = "Hello, Yuliia";

    @Test()
    public void authorisationOnAmazonSite() {
        getBasePageFirefox().implicitWait(60);
        getHomePageFirefox().clickOnAccountAndListsChoice();
        getSignInPageFirefox().inputEmailForAuthorization(INPUT_KEYWORDS);
        getSignInPageFirefox().clickButtonContinueAuthorization();
        getSignInPageFirefox().inputPasswordForAuthorization(INPUT_PASSWORD);
        getSignInPageFirefox().clickButtonPasswordAuthorization();
        //getSignInConfirmationPageFirefox().inputPasswordForConfirmationAuthorization(INPUT_PASSWORD); // добавить обход капчи
        Assert.assertTrue(getHomePageFirefox().getTextOnAccountAndListsChoice().contains(EXPECTED_AUTHORISATION_WORDS));
    }

}
