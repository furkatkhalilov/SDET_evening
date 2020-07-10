package study.techno.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.List;

public class _02_HandleDropdown extends BaseDriver {

    public static void main(String[] args) {

//        https://pwa-woo.wpmobilepack.com/#/product/1297
//        https://pwa-woo.wpmobilepack.com/#/product/1296
//        https://pwa-woo.wpmobilepack.com/#/product/1299
        driver.get("https://pwa-woo.wpmobilepack.com/#/product/1297");

        handlingDropdowns();
    }

    public static void handlingDropdowns(){

        WebDriverWait wait = new WebDriverWait(driver , 3);

//        Get all the dropdown from the website

        By dropdownByObject =By.xpath("//div[@class='ui fluid selection dropdown']");

        /*
            If there is an dropdown element wait.until will wait 3 seconds and wait for that dropdowns

            but if not able to see the dropdowns explicit wait will throw error. Try catch is helping us to handle that exception
                and continue to next line.
         */
        try{
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(dropdownByObject,0));
        }catch (TimeoutException e){
            System.out.println("There is no any dropdown dude");
        }

        List<WebElement> dropdownList = driver.findElements(dropdownByObject);

        System.out.println(dropdownList.size());

        for(WebElement eachDropdown:dropdownList){
            eachDropdown.click();

//            In this dropdown we can not use a select class because tag name is div.
            driver.findElement(By.xpath("(//div[@class='ui active visible fluid selection dropdown']//span)[1]")).click();
        }

        WebElement addToCart = driver.findElement(By.cssSelector("button[class='ui purple fluid button']"));
        addToCart.click();

    }

    /*
        Find element vs find elements

        Find element is finding one element
        Find elements is finding multiple elements

        If find element is not able to find the element then it will throw no such element exception
        If find elements is not able to find the element then it return empty list.

     */
}
