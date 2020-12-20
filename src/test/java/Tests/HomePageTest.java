package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Web {



    @Test(description = "User can login with the valid credentials")
    public void userLogIn(){
        Homepage hpage = new Homepage();
        WelcomePage wpage = new WelcomePage();
        hpage.clickOnHomeSignIn();
        hpage.Login("steterbasgit@gmail.com", "Ilyas532?");

        Assert.assertTrue(wpage.isFeedDisplayed(), "Invalid message");

    }
    @Test(description = "User should not be able to log in")
    public void userCantLogin(){
        Homepage hpage = new Homepage();
        hpage.clickOnHomeSignIn();
        hpage.Login("invalid", "Ila");

    }
}
