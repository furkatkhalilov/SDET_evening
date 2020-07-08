package study.techno.Day13;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _07_ActionsExercise2 extends BaseDriver {

    public static void main(String[] args) {

        /*
            Navigate to website

                Hover over on the Success stories

                Click on arts button

                Verify arts text is displayed

         */

        driver.get("https://www.python.org/community/irc/");

        WebElement successStories = driver.findElement(By.linkText("Success Stories"));

        Actions act = new Actions(driver);

        act.moveToElement(successStories).perform();

        WebElement artsButton = driver.findElement(By.linkText("Arts"));
        artsButton.click();

        //article/h1
//        article>h1
        //h1[text()='Arts']
        WebElement artsText = driver.findElement(By.cssSelector("article>h1"));

        Assert.assertEquals("Arts", artsText.getText());

    }
}
