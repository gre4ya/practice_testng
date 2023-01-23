package pages.TheInternetHerokuapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetHerokuappNewWindowPage extends TheInternetHerokuappBasePage{
    public TheInternetHerokuappNewWindowPage(){super();}

    @FindBy(tagName = "h3")
    public WebElement newWindowHeader;
}
