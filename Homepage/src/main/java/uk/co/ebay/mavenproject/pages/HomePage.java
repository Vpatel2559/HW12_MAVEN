package uk.co.ebay.mavenproject.pages;

import org.openqa.selenium.By;
import uk.co.ebay.mavenproject.utility.Util;

public class HomePage extends Util {
    By signinLink = By.xpath("//a[contains(text(),'Sign in')]");

    public void clickOnSigninLink(){
        clickOnElement(signinLink);
    }


}
