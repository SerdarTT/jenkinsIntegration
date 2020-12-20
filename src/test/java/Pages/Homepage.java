package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class Homepage extends Basepage{

    By userName = By.xpath("//input[@placeholder='Username']");
    By userPass = By.xpath("//input[@placeholder='Password']");
    By userSignIn = By.xpath("//button[contains(text(),'Sign in')]");
    By clickToSignIn = By.xpath("//a[contains(text(),'Sign in')]");


    public void clickOnHomeSignIn(){clickThis(clickToSignIn);}
    public void enterUserName(String name){type(userName, name); }
    public void enterUserPass(String pwd){type(userPass, pwd);}
    public void clickToSign(){clickThis(userSignIn);}

    public void Login(String user, String userPwd){
        Helper.pause(2);
        enterUserName(user);
        enterUserPass(userPwd);
        Helper.pause(2);
        clickToSign();
    }

}
