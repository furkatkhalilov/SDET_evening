package study.techno.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindElementsPart1 {

    /*
        What is findElements?


        INTERVIEW QUESTION
            Find element vs FindElements?

            1) Find element is finding one element.
            1) Find elements is finding multiple elements.

            2) If find element is not finding one element then it will throw no such element exception
            2) If find elements is not finding any element then it will return empty list

            3) Find element return WebElement
            3) Find elements return List<WebElement>

     */
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

        List<WebElement> nameOfTheItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        System.out.println(nameOfTheItems.size());

//        printiing the list texts one by one
        for(int i = 0 ; i<nameOfTheItems.size() ; i++){

            String nameOfElement = nameOfTheItems.get(i).getText();

//            .get(i)  it is getting the webelement one by one
//            .getText();  getting the text of the element

            System.out.println(nameOfElement);
       }




    }
}
