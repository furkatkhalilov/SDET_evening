package study.techno.Day9;

import org.openqa.selenium.By;
import study.techno.Utils.BaseDriver;

public class _08_Locator extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("//label[text()='Wednesday']/preceding-sibling::input")).click();

        /*
                tbody>tr:nth-of-type(4) input

                If the location of the element is change then this css locator will break that is why
                    It is better to go with the locator at line 14
         */

    }
}
