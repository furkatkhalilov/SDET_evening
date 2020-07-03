package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _08_WaitExample extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://www.demoblaze.com/index.html");


        /*
            In this point there is a NoSuchElementException
                Option 1 for the exception: Timing issue
                Option 2 for the exception: Locator is wrong
         */
        WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();


        WebElement addToCart = driver.findElement(By.partialLinkText("Add to"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver , 10);

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        /*
            Linktext: Any element in the page has "a" tag and text is equal to Add to cart

            Partial Link text: Any element in the page has "a" tag and text is contains Add to cart
         */
    }
}
