package uk.gov.leicester.maven_project.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.gov.leicester.maven_project.loadproperty.LoadProperty;
import uk.gov.leicester.maven_project.pages.HomePage;
import uk.gov.leicester.maven_project.testbase.TestBase;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test

    public void userShouldNavigateToHomepageSuccessfylly(){
        homePage.clickOnMyaccountLink();

        String expectedText = "Welcome to My Account";
        Assert.assertEquals(homePage.welcomeText(),expectedText);
    }

}
