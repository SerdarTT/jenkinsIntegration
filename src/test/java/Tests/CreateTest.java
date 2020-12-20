package Tests;

import Driver.Web;
import Pages.Create;
import Pages.Homepage;
import Pages.WelcomePage;
import Utils.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTest extends Web {
    @Test(description = "Creating new post")
    public void userCreate(){
        WelcomePage wpage = new WelcomePage();
        Create cpage = new Create();
        Homepage hpage = new Homepage();

        hpage.clickOnHomeSignIn();
        hpage.Login("steterbasgit@gmail.com", "Ilyas532?");

        cpage.newPost();
        cpage.createArticle("The Office US", "SIT Com", "Micheal Scott Paper Company", "Micheal Scott");

        Assert.assertTrue(wpage.isEditButtonDisplayed(), "Edit button is not displayed");
    }
}
