package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _09_KeyOptions extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement multiColorInput = driver.findElement(By.id("autoCompleteMultipleInput"));

        Actions a1 =new Actions(driver);

//        moveToElement is hoverovering on the element and then we click on it
//        a1.moveToElement(multiColorInput).click()
//                .sendKeys("Yellow").perform();

        WebElement singleInput = driver.findElement(By.id("autoCompleteSingleInput"));

        a1.moveToElement(singleInput).click()
                .keyDown(Keys.SHIFT).sendKeys("a")
                .keyUp(Keys.SHIFT).sendKeys("li").perform();

        singleInput.sendKeys("Ali");

        /*
            We can use the keydown and up methods
                With CTRL + TAB + ALT + ENTER


         */
    }
}
