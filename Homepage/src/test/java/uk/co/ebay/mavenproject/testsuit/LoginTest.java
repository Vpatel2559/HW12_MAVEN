package uk.co.ebay.mavenproject.testsuit;

import org.junit.Assert;
import org.testng.annotations.Test;
import uk.co.ebay.mavenproject.loadproperty.LoadProperty;
import uk.co.ebay.mavenproject.pages.HomePage;
import uk.co.ebay.mavenproject.pages.LoginPage;
import uk.co.ebay.mavenproject.testbase.TestBase;

public class LoginTest extends TestBase {
HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToSigninPageSuccessfully() {

        String expectedText = "Hello";
        Assert.assertEquals(loginPage.getConfirmationTextFromHomePage(), expectedText);

    }

//    @Test
//    public void userShouldSigninPageSuccessfully(){
//        homePage.clickOnSigninLink();
//        loginPage.enterEmail(loadProperty.getProperty("abc123@gmail.com"));
//        loginPage.enterPassword(loadProperty.getProperty("abc123"));
//        loginPage.clickOnSigninBtn();
//    }




}