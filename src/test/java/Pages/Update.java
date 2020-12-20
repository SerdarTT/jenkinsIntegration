package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class Update extends Basepage{

    By clickOnProfile = By.xpath("//a[contains(text(),' candidatez')]");
    By clickOnTitle = By.xpath("//h1[contains(text(),'The Office US')]");
    By clickOnEdit = By.xpath("//a[@class='btn btn-sm btn-outline-secondary']//following::i[@class='ion-edit']");
    By clickOnTitleBox = By.xpath("//input[@placeholder='Article Title']");
    By aboutArticleBox = By.xpath("//input[@placeholder=\"What's this article about?\"]");
    By writeArticleBox = By.xpath("//textarea[@placeholder='Write your article (in markdown)']");
    By tagsBox = By.xpath("//input[@placeholder='Enter Tags']");
    By clickPublish = By.xpath("//button[starts-with(text(),' Publish')]");


    public void clickProfile(){clickThis(clickOnProfile);}
    public void clickTitle(){clickThis(clickOnTitle);}
    public void clickToEdit(){clickThis(clickOnEdit);}
    public void cleanTitleBox(){
        Helper.pause(2);
        cleanThis(clickOnTitleBox);}
    public void enterNewTitle(String newTitle){type(clickOnTitleBox, newTitle);}
    public void cleanArticle(){cleanThis(aboutArticleBox);}
    public void enterAboutNewArticle(String newAbout){type(aboutArticleBox, newAbout);}
    public void cleanArticleBox(){cleanThis(writeArticleBox);}
    public void enterNewArticle(String newArticle){type(writeArticleBox, newArticle);}
    public void cleanTagsBox(){cleanThis(tagsBox);}
    public void enterTagsBox(String newTags){type(tagsBox, newTags);}
    public void clickToPublish(){clickThis(clickPublish);}

    public void updateArticle(String nTitle, String nAboutTitle, String nArticle, String nTags){
        clickProfile();
        Helper.pause(2);
        clickTitle();
        clickToEdit();
        Helper.pause(2);
        cleanTitleBox();
        Helper.pause(2);
        enterNewTitle(nTitle);
        Helper.pause(2);
        cleanArticle();
        enterAboutNewArticle(nAboutTitle);
        Helper.pause(2);
        cleanArticleBox();
        enterNewArticle(nArticle);
        Helper.pause(2);
        cleanTagsBox();
        enterTagsBox(nTags);
        Helper.pause(2);
        clickToPublish();
    }

}
