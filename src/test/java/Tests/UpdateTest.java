package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.Update;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateTest extends Web {
    @Test(description = "User can update article")
    public void updateArticle(){
        Homepage hpage = new Homepage();
        Update upage = new Update();
        WelcomePage wpage = new WelcomePage();

        hpage.clickOnHomeSignIn();
        hpage.Login("steterbasgit@gmail.com", "Ilyas532?");

        upage.updateArticle("Madison NY", "New York city", "Medison avenue is between Park and fifth avenue", "cityLife");

        Assert.assertTrue(wpage.isTitleDisplayed(), "The office US article headline is not displayed");
    }


}
