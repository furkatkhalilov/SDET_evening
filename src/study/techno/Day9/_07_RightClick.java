package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _07_RightClick extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));

        Actions a1 = new Actions(driver);

//        contextClick right clicking on the element
        a1.contextClick(rightClick).perform();

    }

}
