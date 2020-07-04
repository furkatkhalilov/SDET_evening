package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _08_Exercise extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputSearch = driver.findElement(By.id("inputValEnter"));
        inputSearch.sendKeys("Phone");

// This class will not work because there is a space between words and selenum see this class name as 3 diff classes
//        driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        searchButton.click();




    }
}
