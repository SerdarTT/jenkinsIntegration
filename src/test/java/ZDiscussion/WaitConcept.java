package ZDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitConcept {

    private static WebDriver driver = null;
    @Test
    public void testWait() {
        driver = new ChromeDriver();

        /**
         * Implicit wait: (Like changing the setting in driver)
         * Wait for certain amount of time before throwing NoSuchElementException
         * and stop waiting as soon as element is found.
         *
         *Polling period : 250ms
         *
         */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        /**
         * Explicit wait: Wait for certain amount of time until the specified condition(s) is met.
         * As soon as the condition met, syop waiting and move ahead.
         *
         * Polling period: 500ms
         */
        WebDriverWait eWait = new WebDriverWait(driver, 20);
        eWait.until(ExpectedConditions.titleIs("Hotels.com"));


        eWait.until(ExpectedConditions.and(
                ExpectedConditions.alertIsPresent(),
                ExpectedConditions.elementToBeClickable(By.xpath(""))
        ));
        eWait.until(ExpectedConditions.or(
                ExpectedConditions.alertIsPresent(),
                ExpectedConditions.elementToBeClickable(By.xpath(""))
        ));

        /**
         * Fluent wait:
         * Wait for a certain amount of time until element is found or condition(s) is met
         * When waiting period is over, throws TimeOutException
         * User can define the polling period
         * User can ignore the specific exceptions during the wait period
         * USer can put a custom message to display when wait is over
         *
         */

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("element is found after 30 seconds of fluent wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriverWait, WebElement>() {

            public WebElement apply(WebDriverWait webDriverWait) {
                return driver.findElement(By.xpath(""));
            }
        });
        fWait.until(ExpectedConditions.urlContains("facebook"));





    }


}
