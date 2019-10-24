package uk.gov.leicester.maven_project.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.leicester.maven_project.basepage.BasePage;
import uk.gov.leicester.maven_project.browserselector.BrowserSelector;
import uk.gov.leicester.maven_project.loadproperty.LoadProperty;

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod

    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
