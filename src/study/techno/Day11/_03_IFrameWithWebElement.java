package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _03_IFrameWithWebElement extends BaseDriver {

        public static void main (String[]args){

            driver.get("https://chercher.tech/practice/frames");

//            WebElement for the IFrame
            WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iamframe']"));

//            Using web element to switch in IFrame
            driver.switchTo().frame(frameElement);

            driver.findElement(By.cssSelector("input[type='text']")).sendKeys("USA");

        }

}
