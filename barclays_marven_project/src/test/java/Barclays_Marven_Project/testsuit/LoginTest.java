package Barclays_Marven_Project.testsuit;

import Barclays_Marven_Project.loadproperty.LoadProperty;
import Barclays_Marven_Project.pages.HomePage;
import Barclays_Marven_Project.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;



public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();



    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

//        String expectedText = "Quick, safe and convenient";
//        Assert.assertEquals(homePage.welcomeText(),expectedText);
    }
}
