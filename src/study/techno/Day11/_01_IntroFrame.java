package study.techno.Day11;

import org.openqa.selenium.By;
import study.techno.Utils.BaseDriver;

public class _01_IntroFrame extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
            Iframe

            Window
         */

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("USA");

    }
}
