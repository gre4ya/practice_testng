package scripts.TechGlobalSchool;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalSchool.TechGlobalSchoolBasePage;
import pages.TechGlobalSchool.TechGlobalSchoolInstagramPage;
import utilities.WindowHandler;

public class TechGlobalSchoolInstagramPageTest extends TechGlobalSchoolBase{

    @BeforeMethod
    public void setPage(){
        techGlobalSchoolBasePage = new TechGlobalSchoolBasePage();
        techGlobalSchoolInstagramPage = new TechGlobalSchoolInstagramPage();
    }
    /*
    1. Go to https://www.techglobalschool.com/
    2. Click on Instagram icon on the footer
    3. Validate a new tab opened with URL as
    “https://www.instagram.com/techglobal.school/”
    4. Navigate back to previous tab
    5. Validate the URL as “https://www.techglobalschool.com/”
     */
    @Test
    public void validateInsatgramLink(){
        techGlobalSchoolBasePage.instagramLink.click();
        WindowHandler.switchToChildWindow();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.instagram.com/techglobal.school/");
        driver.close();
        WindowHandler.switchBackToParentWindow();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.techglobalschool.com/");
    }
}
