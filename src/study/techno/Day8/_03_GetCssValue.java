package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _03_GetCssValue extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));

        System.out.println("Color : " + searchButton.getCssValue("color"));

        System.out.println("Onclick attribute : " + searchButton.getAttribute("onclick"));

        System.out.println("Color : " + searchButton.getCssValue("font-size"));

        System.out.println("Color : " + searchButton.getCssValue("background-color"));

    }

}
