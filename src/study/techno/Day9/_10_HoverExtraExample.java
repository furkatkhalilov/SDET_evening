package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _10_HoverExtraExample extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        WebElement toys = driver.findElement(By.id("catnav-primary-link-11049"));
//        xpath -> //span[contains(text(),'Toys & Entertainment')]

        Actions a1 = new Actions(driver);

        a1.moveToElement(toys).perform();

    }
}
