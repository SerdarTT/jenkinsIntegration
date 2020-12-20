package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class Delete extends Basepage{
    By clickOnProfile = By.xpath("//a[contains(text(),' candidatez')]");
    By clickOnTitle = By.xpath("//h1[contains(text(),'The Office US')]");
    By clickOnDeleteButton = By.xpath("//button[@class='btn btn-sm btn-outline-danger']//following::i[@class='ion-trash-a']");


    public void clickProfile(){clickThis(clickOnProfile);}
    public void clickTitle(){
        Helper.pause(2);
        clickThis(clickOnTitle);}
    public void clickToDelete(){clickThis(clickOnDeleteButton);}


    public void delete(){
        clickProfile();
        clickTitle();
        clickToDelete();
    }

}
