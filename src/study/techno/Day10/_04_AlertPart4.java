package study.techno.Day10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _04_AlertPart4 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement buttonPropmpt = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));

        buttonPropmpt.click();

        String myMessage = "Hi World";

        driver.switchTo().alert().sendKeys(myMessage);

        Thread.sleep(1000);

        driver.switchTo().alert().accept();

        WebElement textMessage = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue(textMessage.getText().contains(myMessage));

    }

}
