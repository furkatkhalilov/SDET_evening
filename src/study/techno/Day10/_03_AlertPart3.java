package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _03_AlertPart3 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        //button[@onclick='myConfirmFunction()']

        WebElement clickMe2 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));

        clickMe2.click();

//       With a getText() method I am able to get the text from the alert.
        String alertText = driver.switchTo().alert().getText();

        System.out.println(alertText);

        driver.switchTo().alert().accept();
    }
}
