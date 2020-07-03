package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _02_IframeInTheFrame extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("USA");

        driver.switchTo().frame("frame3");

//        driver.switchTo().frame("frame1").switchTo().frame("frame3");

        WebElement text = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']"));

        System.out.println(text.getText());

    }


}
