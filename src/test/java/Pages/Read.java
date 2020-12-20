package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class Read extends Basepage{

    By clickOnProfile = By.xpath("//a[contains(text(),' candidatez')]");
    By clickOnTitle = By.xpath("//h1[contains(text(),'Madison NY')]");
    By clickOnEdit = By.xpath("//a[@class='btn btn-sm btn-outline-secondary']//following::i[@class='ion-edit']");
    By clickOnAboutArticle = By.xpath("//input[@placeholder=\"What's this article about?\"]");
    By clickOnPublishButton = By.xpath("//button[contains(text(),' Publish')]");



    public void clickProfile(){clickThis(clickOnProfile);}
    public void clickTitle(){clickThis(clickOnTitle);}
    public void clickToEdit(){clickThis(clickOnEdit);}
    public void cleanAbout(){cleanThis(clickOnAboutArticle);}
    public void reEnterAboutArticle(String about){type(clickOnAboutArticle, about);}
    public void clickToPublish(){clickThis(clickOnPublishButton);}


    public void editArticle(String aboutTitle){
        clickProfile();
        Helper.pause(2);
        clickTitle();
        clickToEdit();
        Helper.pause(2);
        cleanAbout();
        reEnterAboutArticle(aboutTitle);
        Helper.pause(2);
        clickToPublish();
    }
}
