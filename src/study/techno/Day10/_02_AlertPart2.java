package study.techno.Day10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _02_AlertPart2 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        //button[@onclick='myConfirmFunction()']

        WebElement clickMe2 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));

        clickMe2.click();

        driver.switchTo().alert().dismiss();

        //Other way to find the you pressed cancel element
//        //p[contains(text(),'You pressed')]

        WebElement textError = driver.findElement(By.id("confirm-demo"));

        Assert.assertEquals("You pressed Cancel!" , textError.getText());

    }
}
