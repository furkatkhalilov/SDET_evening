package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.Set;

public class _07_MultipleWindows extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/browser-windows");

        WebElement NewWindowButton = driver.findElement(By.id("windowButton"));
        NewWindowButton.click();

        Set<String> allWindows = driver.getWindowHandles();

        System.out.println(allWindows);

        for(String windowName:allWindows){

            driver.switchTo().window(windowName);

        }

        System.out.println(driver.getCurrentUrl());

    }
}
