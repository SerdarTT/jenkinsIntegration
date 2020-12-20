package Pages;

import Driver.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Basepage {

    public WebElement findElementUsingFluentWait(By locator){

        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("element is found after 30 seconds of fluent wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }

        });
        return element;
    }



    public void clickThis(By locator){
        findElementUsingFluentWait(locator).click();
    }
    public void cleanThis(By locator){ findElementUsingFluentWait(locator).clear();}
    public void type(By locator, String data){
        findElementUsingFluentWait(locator).sendKeys(data);
    }
    public boolean isElementDisplayed(By locator){return findElementUsingFluentWait(locator).isDisplayed();}
    public void selectDropDown(By locator, String text){
        WebElement element  = Web.getDriver().findElement(locator);
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }
}
