package study.techno.Day14;

import org.junit.Assert;
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

            boolean isRandomDuplicate = true;

            while(isRandomDuplicate){

                System.out.println("random number before the if " + randomNumber);
                if(!AllRandomNumbers.contains(randomNumber)){
                    AllRandomNumbers.add(randomNumber);
                    isRandomDuplicate=false;
                }else{
                    //            in the else java might create the same number
                    randomNumber = randomGenerator(shopNowList.size());
                }
            }

            shopNowList.get(randomNumber).click();

            _02_HandleDropdown.handlingDropdowns();

            driver.navigate().back();

//            Without this line selenium could throw an ElementClickInterceptedException (Check the line 84)
            driver.findElement(By.xpath("//button[@class='close-toastr']")).click();

        }

        WebElement cartIcon = driver.findElement(By.cssSelector("i[class='cart large icon shop-icon']"));
        cartIcon.click();

        List<WebElement> pricesInTheCart = driver.findElements(By.xpath("//div[@class='right aligned four wide column']"));

        double SumOfAllItems = getTheTotal(pricesInTheCart);

        WebElement totalElement = driver.findElement(By.cssSelector("div[class='right aligned five wide column']"));

        double totalDouble = StringToDouble(totalElement.getText());

        System.out.println(SumOfAllItems);
        System.out.println(totalDouble);

        Assert.assertTrue(SumOfAllItems==totalDouble);

        System.out.println("Code is finally done");

        driver.quit();
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


    /*
        Get the String as parameter (number)
        Return type is double

        Remove all the non numberic numbers from the String and change it to double and return it.
     */
    public static double StringToDouble(String number){

//        Removing all the non-numeric char from the String
        number = number.replaceAll("[^\\d.]" ,"");

        return Double.parseDouble(number);

//        Second way
//          return Double.parseDouble(str.replaceAll("[^\\d.]",""));
    }

    /*
        Get the List WebElement
        Return is double

        Calculate all the numbers from the list and return total
     */
    
    public static double getTheTotal(List<WebElement> allPrices){

        double result = 0;

        for(WebElement eachItem:allPrices){

            result+=StringToDouble(eachItem.getText());

        }

        return result;
    }


}
