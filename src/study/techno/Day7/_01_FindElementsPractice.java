package study.techno.Day7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Day6._05_SignInFunctionality;
import study.techno.Utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class _01_FindElementsPractice extends BaseDriver {

    /*
        FindElements practice

        Select class in selenium handle dropdown

        Practice on select class

     */
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        _05_SignInFunctionality.signInFuncMethod("standard_user" , "secret_sauce");

//        //div[@class='inventory_item_name']  xpath this one will also work in the line 29
//        div[class='inventory_item_name']     css   this one will also work in the line 29
//        This list is getting all the item names elements from the website
        List<WebElement> itemName=driver.findElements(By.className("inventory_item_name"));

        List<String> itemNameStringList = WebElementToString(itemName);

//        finding add to cart in the website
        List<WebElement> addToCartItems = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

//        Click on all the elements
        clickAllElements(addToCartItems);

//
        WebElement cartItem = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));

        cartItem.click();

//        Finding item names in the cart
        List<WebElement> itemNameInCart = driver.findElements(By.className("inventory_item_name"));

//        Change the all itemNameInCart webElements to String list
        List<String> itemNameInCartStringList =WebElementToString(itemNameInCart);

        compareTwoList(itemNameStringList , itemNameInCartStringList );

        System.out.println("Code is done");
    }

    /*
        Create one method
            Parameter is two List of String
            Return type is void

        Compare both of the String list and if it is not equal fail the code

     */
        public static void compareTwoList(List<String> l1 , List<String> l2){

            for(int i = 0 ; i<l1.size() ; i++){

                if(!l1.get(i).equals(l2.get(i))){
                    Assert.fail("First list is not equal to second List ");
                }
            }

        }


    /*
        Create a method parameter is one List<WebElement>
            Return type is List<String>
            Change all WebElements to String and return it.
     */
     public static List<String> WebElementToString(List<WebElement> myList){

         List<String> stringList = new ArrayList<>();

         for(int i =0  ; i<myList.size() ; i++){

             // both of these approach will work second one is shorter.
//             String itemName = myList.get(i).getText();
//             stringList.add(itemName);

             stringList.add(myList.get(i).getText());

         }

         return stringList;
     }



     /*
            Create one method
            Parameter is one List
            Return type is void

            Click on all the elements.
      */

    public static void clickAllElements(List<WebElement> myList){
        for(WebElement eachElement:myList){
            eachElement.click();
        }
    }

    /*
    Create a method name is compareTwoList
    Parameter is two List
    Return type is void

    Compare the first list with second list
    If there it is not equal then throw error

    This method will not work because after we get the first list we are clicking on one element
    and changing the HTML code that is why it will give us stale element exception

    public static void compareTwoList(List<WebElement> l1 , List<WebElement>l2){

        for(int i=0 ; i<l1.size() ;i++){

            if(l1.get(i).getText().equals(l2.get(i).getText())){
                System.out.println("Lists are equal");
            }else{
                Assert.fail("First list is not equal to second one");
            }
        }
    }
    */


}
