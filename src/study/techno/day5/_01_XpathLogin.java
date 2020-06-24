package study.techno.day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_XpathLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //   //div[text()='Sauce Labs Backpack']

        //   //div[contains(text(),'Sauce Labs ')]

        WebElement bikeLightElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        bikeLightElement.click();

        /*
            Parent to child
                //div[@class='inventory_details_desc_container']/button <-- single slash is looking for direct child
                //div[@class='inventory_details_container']//div  <-- double slash is looking for the all child
         */

        WebElement addToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCart.click();

        WebElement buttonBack = driver.findElement(By.xpath("//button[text()='<- Back']"));
        buttonBack.click();

//        //div[text()='Sauce Labs Bolt T-Shirt']
//        (//div[@class='inventory_item_name'])[3]

        WebElement boltTshirtText = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirtText.click();

        addToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCart.click();

        WebElement cartIcon = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        cartIcon.click();




    }
}
