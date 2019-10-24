package uk.co.ebay.mavenproject.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.ebay.mavenproject.basepage.BasePage;
import uk.co.ebay.mavenproject.browserselector.BrowserSelector;
import uk.co.ebay.mavenproject.loadproperty.LoadProperty;

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod

    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }


}
