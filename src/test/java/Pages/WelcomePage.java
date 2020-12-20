package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class WelcomePage extends Basepage{
    By pageObjectDisplayed = By.xpath("//a[contains(text(),'Your Feed')]");
    By editArticle = By.xpath("//a[@class='btn btn-sm btn-outline-secondary']//following::i[@class='ion-edit']");
    By updateArticleDisplayed = By.xpath("//h1[contains(text(),'Madison NY')]");
    By bBlogDisplayed = By.xpath("//h1[contains(text(),'BBlog')]");

    public boolean isFeedDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(pageObjectDisplayed);
    }

    //Display for CRUD-Create
    public boolean isEditButtonDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(editArticle);}

    //display after Update

    public boolean isTitleDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(updateArticleDisplayed);
    }

    //display BBlog headline
    public boolean isHeadlineDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(bBlogDisplayed);
    }







}
