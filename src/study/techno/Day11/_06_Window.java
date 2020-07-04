package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.Set;

public class _06_Window extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/browser-windows");

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        System.out.println(driver.getCurrentUrl());

//      Get the name all the windows . Return type is Set<String>
        Set<String> allWindows = driver.getWindowHandles();

        System.out.println(allWindows);

//        Get the name of the first window.
        String parentWindow = driver.getWindowHandle();

//        Because I can not use get method in the Set . I am using fo each loop
        for(String windowName:allWindows){
            driver.switchTo().window(windowName);
        }

        System.out.println(driver.getCurrentUrl());

        String secondPageText = driver.findElement(By.id("sampleHeading")).getText();

        System.out.println(secondPageText);

//        closing the current page
        driver.close();

//        Switching to parent window , parentWindow is coming from line 26
        driver.switchTo().window(parentWindow);

        driver.findElement(By.id("windowButton")).click();

    }

}
