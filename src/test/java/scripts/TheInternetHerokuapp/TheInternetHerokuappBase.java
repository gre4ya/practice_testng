package scripts.TheInternetHerokuapp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TheInternetHerokuapp.TheInternetHerokuappBasePage;
import pages.TheInternetHerokuapp.TheInternetHerokuappMultipleWindowsPage;
import pages.TheInternetHerokuapp.TheInternetHerokuappNewWindowPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TheInternetHerokuappBase {
    WebDriver driver;
    TheInternetHerokuappBasePage theInternetHerokuappBasePage;
    TheInternetHerokuappMultipleWindowsPage theInternetHerokuappMultipleWindowsPage;
    TheInternetHerokuappNewWindowPage theInternetHerokuappNewWindowPage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        theInternetHerokuappBasePage = new TheInternetHerokuappBasePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }


}
