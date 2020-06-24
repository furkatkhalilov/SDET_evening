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

        WebElement buttonContinue = driver.findElement(By.xpath("//div[@class='cart_footer']/a[text()='CHECKOUT']"));
        buttonContinue.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastNameInput.sendKeys("SomeOne");

        WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        postalCode.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
        continueButton.click();

//        (//div[@class='inventory_item_price'])[2]
//        ((//div[@class='cart_list']/div)[3]//div)[5]

//        Find the parent in the xpath //div[text()='Sauce Labs Bike Light']/parent::a

//        Find the sibling in the xpath //a[@id='item_0_title_link']/following-sibling::div

//        //a[@id='item_0_title_link']/following-sibling::div[@class='inventory_item_price']

        WebElement price1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/parent::a/following-sibling::div[@class='inventory_item_price']"));
        String price1Str = price1.getText();

        WebElement price2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']/parent::a/following-sibling::div[@class='inventory_item_price']"));
        String price2Str = price2.getText();

        WebElement ItemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String ItemTotalStr = ItemTotal.getText();



        /*
            Task:

            How to make sure price1Str + price2Str = ItemTotalStr

         */

//        double price1 = Double.parseDouble(str.replace("[^\\d.]",""));

        System.out.println(ItemTotalStr);

        double price1Double = changeStringToDouble(price1Str);
        double price2Double = changeStringToDouble(price2Str);
        double TotalDouble = changeStringToDouble(ItemTotalStr);

        Assert.assertTrue(price1Double + price2Double == TotalDouble);

    }

    /*
        I need a method which has taking a string
        And remove all the non numeric characters and change the String to double
        And give me double
     */

    public static double changeStringToDouble(String myString){

        myString = myString.replaceAll("[^\\d.]",""); // remove all the non numeric char (letter or special character)

        double myD = Double.parseDouble(myString);

        return myD;

    }


}
