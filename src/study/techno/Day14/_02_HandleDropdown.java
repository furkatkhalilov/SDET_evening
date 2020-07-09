package study.techno.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.List;

public class _02_HandleDropdown extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://pwa-woo.wpmobilepack.com/#/product/1297");

        handlingDropdowns();
    }

    public static void handlingDropdowns(){

        WebDriverWait wait = new WebDriverWait(driver , 3);

        List<WebElement> dropdownList =  wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='ui fluid selection dropdown']"),0));

        System.out.println(dropdownList.size());

        for(WebElement eachDropdown:dropdownList){
            eachDropdown.click();

//            In this dropdown we can not use a select class because tag name is div.
            driver.findElement(By.xpath("(//div[@class='ui active visible fluid selection dropdown']//span)[1]")).click();

        }

        

    }
}
