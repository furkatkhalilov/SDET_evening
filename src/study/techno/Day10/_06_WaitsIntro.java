package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _06_WaitsIntro extends BaseDriver {

    public static void main(String[] args) {

        /*
            Implicit wait
                I am creating it once for driver and it will affect to every element for that driver.

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES)
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.HOURS)
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.DAYS)

                    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)

                    If the driver see any NoSuchElementException then Implicit wait will wait 30 seconds
                        then if the element still not displayed it will throw error.
         */

        /*
            Thread.sleep(30000);

            Thread.sleep is waiting for 30 seconds no matter what.

            Implicit wait is waiting for max 30 seconds.
                If element is displayed in 10th second then it will stop waiting and going to next line.

         */

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timerButton = driver.findElement(By.xpath("//button[@onclick='timedText()']"));

        timerButton.click();

        WebElement webDriverText = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        System.out.println(webDriverText.getText());


    }
}
