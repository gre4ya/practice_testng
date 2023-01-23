package pages.TechGlobalSchool;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechGlobalSchoolBasePage {
    public TechGlobalSchoolBasePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//img[@alt='Instagram']/../.. ")
    public WebElement instagramLink;
}
