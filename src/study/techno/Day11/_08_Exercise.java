package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _08_Exercise extends BaseDriver {

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.snapdeal.com/");

        WebElement inputSearch = driver.findElement(By.id("inputValEnter"));
        inputSearch.sendKeys("Phone");

// This class will not work because there is a space between words and selenum see this class name as 3 diff classes
//        driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        searchButton.click();

        WebElement SecondElement = driver.findElement(By.xpath("(//p[@class='product-title '])[2]"));
        SecondElement.click();

//        All windows name in the Set<String>
        Set<String> allWindows = driver.getWindowHandles();

//        Switching between the windows
        for(String eachWindow:allWindows){
            driver.switchTo().window(eachWindow);
        }

        System.out.println(driver.getCurrentUrl());


    }
}
