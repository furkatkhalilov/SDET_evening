package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _01_IntroAlert extends BaseDriver {

    /*
        How to handle alert in selenium

        Exercise

        Waits

        Exercise

     */

    /*
        Interview Question
            How do you handle alerts in selenium?
                To handle alerts I am using switch to method.

            Click on okay  --> accept
            Click on cancel --> dismiss
            Get the text from the alert --> getText
            Type in the alert --> sendKeys

     */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickme1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));

        clickme1.click();

/*
       This line is going to click on OK in the alert
            If the alert is not displayed then NoAlertPresentException will be thrown
 */
        driver.switchTo().alert().accept();
    }


}
