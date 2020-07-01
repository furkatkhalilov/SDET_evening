package study.techno.Day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _05_Click extends BaseDriver {

    public static void main(String[] args) {

        /*
            Interview Question
                If you can not click on the element with click() method
                What you are going to do?

                 With an action class I can click on the element as well.
         */

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions a1 = new Actions(driver);

        a1.click(clickMeButton).perform();

        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));

        Assert.assertEquals("You have done a dynamic click", clickMessage.getText() );

    }
}
