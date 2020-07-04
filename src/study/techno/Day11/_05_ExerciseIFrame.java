package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _05_ExerciseIFrame extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
            Navigate to https://www.123formbuilder.com/free-form-templates/

            Click on the Online Event Registration Form

            Enter the first name

            Then click on Continue with template

         */

        driver.get("https://www.123formbuilder.com/free-form-templates/");

        WebElement OKbutton = driver.findElement(By.linkText("OK"));
        OKbutton.click();

        WebElement OnlineEventButton = driver.findElement(By.linkText("Online Event Registration Form"));
        OnlineEventButton.click();

        /*
            WithOut line 24-25
                Selenium will throw this exception.
            ElementClickInterceptedException
                Selenium is able to see the element.
                But there is pop up is front of the element I would like to click
         */

        WebElement frameElement = driver.findElement(By.xpath("//div[@class='form-embed']/iframe"));
        driver.switchTo().frame(frameElement);

        WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First']"));
        firstName.sendKeys("John");

//        With this line Selenium is able to see all the page
//         Otherwise Selenium will throw noSuchElementException in line 48

//        driver.switchTo().parentFrame(); If we have multiple frames in the one frame
//                  Parent frame will navigate to parent of the child frame
       driver.switchTo().defaultContent();
 
        WebElement ButtonContinue = driver.findElement(By.linkText("Continue with template"));
        ButtonContinue.click();

    }
}
