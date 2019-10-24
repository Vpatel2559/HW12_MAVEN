package uk.co.ebay.mavenproject.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import uk.co.ebay.mavenproject.basepage.BasePage;
import uk.co.ebay.mavenproject.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    String baseUrl = new LoadProperty().getProperty("baseUrl");
    String projectPath = System.getProperty("user.id");

    public void selectBrowser( String browser){
        if ( browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }else if ( browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }else if ( browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver" , projectPath + "/drivers/MicrosoftWebDriver.exe");
            driver = new InternetExplorerDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else {
            System.out.println(" Wrong browser name");
        }


        }

}
