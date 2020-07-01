package study.techno.Day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _06_DoubleClick extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions actions1 = new Actions(driver);

        actions1.doubleClick(doubleClickBtn).perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));

        Assert.assertEquals("You have done a double click" ,message.getText() );

    }
}
