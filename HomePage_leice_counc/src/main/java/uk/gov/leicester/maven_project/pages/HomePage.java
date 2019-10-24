package uk.gov.leicester.maven_project.pages;

import org.openqa.selenium.By;
import uk.gov.leicester.maven_project.utility.Util;

public class HomePage extends Util {

    By myaccountLink = By.xpath("//a[@class='button']");
    By menuLink = By.xpath("//span[@class='menu-icon-text hide-for-small']");
    By welcomeText = By.id("welcome-text");

    public void clickOnMyaccountLink(){
        clickOnElement(myaccountLink);
    }

    public void clickOnMenuLink(){
        clickOnElement(menuLink);
    }
    public String welcomeText(){
        return getTextFromElement(welcomeText);
    }

}
