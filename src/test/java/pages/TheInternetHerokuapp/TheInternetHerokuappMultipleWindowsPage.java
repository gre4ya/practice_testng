package pages.TheInternetHerokuapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetHerokuappMultipleWindowsPage extends TheInternetHerokuappBasePage{

    public TheInternetHerokuappMultipleWindowsPage(){super();}

    @FindBy(css = "#content h3")
    public WebElement h3Header;
    @FindBy(css = "#content a")
    public WebElement clickHereLink;


}
