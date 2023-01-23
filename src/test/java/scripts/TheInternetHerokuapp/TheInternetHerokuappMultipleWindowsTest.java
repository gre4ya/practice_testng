package scripts.TheInternetHerokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TheInternetHerokuapp.TheInternetHerokuappBasePage;
import pages.TheInternetHerokuapp.TheInternetHerokuappMultipleWindowsPage;
import pages.TheInternetHerokuapp.TheInternetHerokuappNewWindowPage;
import utilities.WindowHandler;

public class TheInternetHerokuappMultipleWindowsTest extends TheInternetHerokuappBase{
    @BeforeMethod
    public void setPage(){
        theInternetHerokuappBasePage = new TheInternetHerokuappBasePage();
        theInternetHerokuappMultipleWindowsPage = new TheInternetHerokuappMultipleWindowsPage();
        theInternetHerokuappNewWindowPage = new TheInternetHerokuappNewWindowPage();
        theInternetHerokuappBasePage.multipleWindowsLink.click();
    }

    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Multiple Windows” link
    3. Click on “Click Here” link
    4. Validate the heading3 as “New Window”
    5. Navigate back to previous window
    6. Validate the heading3 as “Opening a new window”
     */
    @Test(priority = 1, description = "")
    public void validateMultipleWindowHeading(){
        theInternetHerokuappMultipleWindowsPage.clickHereLink.click();
        WindowHandler.switchToChildWindow();
        Assert.assertTrue(theInternetHerokuappNewWindowPage.newWindowHeader.isDisplayed());
        Assert.assertEquals(theInternetHerokuappNewWindowPage.newWindowHeader.getText(),
                "New Window");
        driver.close(); WindowHandler.switchBackToParentWindow();
        Assert.assertTrue(theInternetHerokuappMultipleWindowsPage.h3Header.isDisplayed());
        Assert.assertEquals(theInternetHerokuappMultipleWindowsPage.h3Header.getText(),
                "Opening a new window");
    }
}
