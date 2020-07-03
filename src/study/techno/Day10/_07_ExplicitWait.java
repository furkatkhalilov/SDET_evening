package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

public class _07_ExplicitWait extends BaseDriver {

    public static void main(String[] args) {

        /*
            Explicit wait:
                   I can use it for TitleIs , titleContains
                    alert
                    WebElements

        Implicit wait vs Explicit wait
            Implicit wait
            1) Is creating one time for driver and it will affect until the driver quit or execution is done
            2) Catch the noSuchElement exception.

            Explicit wait
            1) I am creating it for element and when the element is executed it will not affect any more.
            2) Catch the exception depends on how I created it.

         */

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timerButton = driver.findElement(By.xpath("//button[@onclick='timedText()']"));

        timerButton.click();

//        Creating an object for the WebDriverWait This is for explicit wait. I can use this wait couple times.
        WebDriverWait wait = new WebDriverWait(driver , 20);

//        WebElement text = driver.findElement(By.xpath("//p[text()='WebDriver']"));

//        Waiting for the element is displayed and returning the WebElement.
        WebElement text =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        System.out.println(text.getText());

//

        /*
              when using explicit wait, we dont use webelement?

                 In this example we are telling to selenium wait until element is displayed.

             invisibilityOfElementLocated  --> Wait until element is not displayed

                 In the invisibilityOfElementLocated I can use webElement.

         */

    }
}
