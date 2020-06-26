package study.techno.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import study.techno.Utils.BaseDriver;

import java.util.List;

public class _03_FindElementsClickOnOneItem extends BaseDriver {


    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        _05_SignInFunctionality.signInFuncMethod("standard_user","secret_sauce");

        List<WebElement> nameOfTheItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        clickOneElement(nameOfTheItems , "Sauce Labs Bike Light");

        nameOfTheItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        clickOneElement(nameOfTheItems , "Sauce Labs Bolt T-Shirt");

        /*
                To read the WebElements one by one from the list we need a for loop

                To get the text from the webElement we need a getText() method

                Click on it we are using .click() method

         */

    }

    /*
        Create a method name is clickOneElement
        Parameter is a List and One String
        Return type is void

        If my String from the webElement is equal to paramter String then Click on it
        Click on add to cart
        Click on back button.
     */

    public static void clickOneElement(List<WebElement> itemList , String expectedString){

        for(int i = 0 ; i < itemList.size() ; i++){

            String elementName = itemList.get(i).getText();

                if(elementName.equalsIgnoreCase(expectedString)){
                    itemList.get(i).click();
                    WebElement  addToCartButton = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
                    addToCartButton.click();

                WebElement backButton = driver.findElement(By.xpath("//button[text()='<- Back']"));
                backButton.click();
                break;
            }
        }
    }
}

 /*
            List<WebElement> list1 = "Element1" , "Element2" , "Element3" , "Element4" , "Element5"

            if you see Element2
                Get text from it and click on it

  */
