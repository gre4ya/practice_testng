package pages.TheInternetHerokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TheInternetHerokuappBasePage {
    public TheInternetHerokuappBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Multiple Windows” link
    3. Click on “Click Here” link
    4. Validate the heading3 as “New Window”
    5. Navigate back to previous window
    6. Validate the heading3 as “Opening a new window”
     */

    @FindBy(xpath = "//*[text()='Multiple Windows']")
    public WebElement multipleWindowsLink;

}
