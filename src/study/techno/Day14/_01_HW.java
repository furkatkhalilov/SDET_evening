package study.techno.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _01_HW extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://pwa-woo.wpmobilepack.com/#/category/88");

        WebDriverWait wait = new WebDriverWait(driver,5);

        ArrayList<Integer> AllRandomNumbers = new ArrayList<>();

        for(int i = 0 ; i<2 ;i++){

            List<WebElement> shopNowList =wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("button[class='ui purple compact button']"),0));

            System.out.println(shopNowList.size());

            /*
            Random number should be unique every execution.
                Because website is not adding the same item second time.
             */

            int randomNumber = randomGenerator(shopNowList.size());

            if(!AllRandomNumbers.contains(randomNumber)){
                AllRandomNumbers.add(randomNumber);

            }else{
                randomNumber = randomGenerator(shopNowList.size());
            }
            shopNowList.get(randomNumber).click();

            _02_HandleDropdown.handlingDropdowns();

            driver.navigate().back();

            driver.findElement(By.xpath("//button[@class='close-toastr']")).click();

        }

        WebElement cartIcon = driver.findElement(By.cssSelector("i[class='cart large icon shop-icon']"));
        cartIcon.click();



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


    /*
        ElementClickInterceptedException
            Selenium is able to find an element
            But there is pop op or something different front of the element.

     */
}
