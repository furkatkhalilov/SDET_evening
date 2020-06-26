package study.techno.Day6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_ClickOnAllElements {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();


        /*
            Create a code
            It is taking the each element from list
            and clicking all of them one by one

            9.13
         */

//        for(int i = 0 ; i < addToCartbuttons.size() ; i++){
//            addToCartbuttons.get(i).click();
//        }

        List<WebElement> addToCartbuttons =driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        clickingInTheList(addToCartbuttons);

          WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
            cartButton.click();

         List<WebElement> removeButtons = driver.findElements(By.xpath("//button[text()='REMOVE']"));

         clickingInTheList(removeButtons);

        removeButtons = driver.findElements(By.xpath("//button[text()='REMOVE']"));

        Assert.assertTrue(removeButtons.size()==0);

//         if(removeButtons.size()==0){
//             System.out.println("There is no items");
//         }else{
//             System.out.println("There are some items");
//         }

    }

    /*
        Create one method name is clickingInTheList
        Parameter is one List
        Return type is void

        Click on each element in the list

        9.31
     */


        public static void clickingInTheList(List<WebElement> anyList){
            for(WebElement eachElement:anyList){
                eachElement.click();
            }
        }



}
