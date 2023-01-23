package scripts.TechGlobalSchool;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalSchool.TechGlobalSchoolBasePage;
import pages.TechGlobalSchool.TechGlobalSchoolInstagramPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TechGlobalSchoolBase {
    WebDriver driver;
    TechGlobalSchoolBasePage techGlobalSchoolBasePage;
    TechGlobalSchoolInstagramPage techGlobalSchoolInstagramPage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        techGlobalSchoolBasePage = new TechGlobalSchoolBasePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
