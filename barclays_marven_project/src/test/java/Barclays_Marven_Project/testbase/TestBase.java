package Barclays_Marven_Project.testbase;

import Barclays_Marven_Project.basepage.BasePage;
import Barclays_Marven_Project.browserselector.BrowserSelector;
import Barclays_Marven_Project.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
