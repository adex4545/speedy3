package pageObjects;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Browser_Factory;

public class Hook {
    Browser_Factory browser_factory =new Browser_Factory();

    @Before
    public void openBrowser(){
        browser_factory.openBrowser();
        driver.get("https://uat11.speedyservices.com/diy");
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
