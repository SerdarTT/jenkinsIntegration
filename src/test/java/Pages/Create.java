package Pages;

import Utils.Helper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Create extends Basepage{

    By clickOnNewPost = By.xpath("//a[@class='nav-link']//following::i[@class='ion-compose']");
    By articleTitle = By.xpath("//input[@placeholder='Article Title']");
    By aboutArticle = By.xpath("//input[@placeholder=\"What's this article about?\"]");
    By writeArticle = By.xpath("//textarea[@placeholder='Write your article (in markdown)']");
    By tags = By.xpath("//input[@placeholder='Enter Tags']");
    By clickPublish = By.xpath("//button[starts-with(text(),' Publish')]");



    @Step("click for new Post")
    public void newPost(){
        Helper.pause(2);
        clickThis(clickOnNewPost);}
    @Step("Enter article title")
    public void enterArticleTitle(String textArticleTitle){ type(articleTitle, textArticleTitle);}
    @Step("Enter text about the title")
    public void enterAboutArticle(String textAboutArticle){type(aboutArticle, textAboutArticle);}
    @Step("Enter the article")
    public void enterArticle(String writeArticleText){ type(writeArticle, writeArticleText);}
    @Step("Enter the tag")
    public void enterTags(String textTags){type(tags, textTags);}
    @Step("Click to publish")
    public void clickToPublish(){
        Helper.pause(2);
        clickThis(clickPublish);}

    public void createArticle(String title, String about, String article, String tag){
        enterArticleTitle(title);
        Helper.pause(2);
        enterAboutArticle(about);
        Helper.pause(2);
        enterArticle(article);
        Helper.pause(2);
        enterTags(tag);
        clickToPublish();
    }

}
