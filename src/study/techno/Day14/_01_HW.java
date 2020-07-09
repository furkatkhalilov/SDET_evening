package study.techno.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _01_HW extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://pwa-woo.wpmobilepack.com/#/category/88");

        WebDriverWait wait = new WebDriverWait(driver,5);

        List<WebElement> shopNowList =wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("button[class='ui purple compact button']"),0));

        System.out.println(shopNowList.size());

        int randomNumber = randomGenerator(shopNowList.size());

        shopNowList.get(randomNumber).click();


    }

     /*
            Create one method parameter is one int (int max)
            Return type is one int
            Generate random number between 0 to max
         */
    public static int randomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);
    }
}
