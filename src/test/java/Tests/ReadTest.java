package Tests;

import Driver.Web;
import Pages.Homepage;
import Pages.Read;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadTest extends Web {
    @Test(description = "Edit to the article")
    public void editArticle(){
        Homepage hpage = new Homepage();
        Read rpage = new Read();
        WelcomePage wpage = new WelcomePage();


        hpage.clickOnHomeSignIn();
        hpage.Login("steterbasgit@gmail.com", "Ilyas532?");

        rpage.editArticle("New Era");

        Assert.assertTrue(wpage.isTitleDisplayed(), "Title is not displayed");


    }
}
