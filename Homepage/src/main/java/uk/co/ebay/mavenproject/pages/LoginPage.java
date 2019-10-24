package uk.co.ebay.mavenproject.pages;

import org.openqa.selenium.By;
import uk.co.ebay.mavenproject.utility.Util;

public class LoginPage extends Util {

    By emailField = By.id("userid");
    By passwordField = By.id("pass");
    By signinBtn = By.xpath("//button[@id='sgnBt']");
    By hiText = By.id("clickOnSigninLink");
    By confirmationTextOnHomePage = By.xpath("//span[contains(text(),'Hello')]");

    public void enterEmail(String email) {
        sendTextToElement(emailField, "abc123@gmail.com");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, "abc123");
    }

    public void clickOnSigninBtn() {
        clickOnElement(signinBtn);
    }
    public String getConfirmationTextFromHomePage(){
        return getTextFromElement(confirmationTextOnHomePage);
    }
}
