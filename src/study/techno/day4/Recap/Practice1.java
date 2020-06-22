package study.techno.day4.Recap;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/login.html");

//        Maximize the window
        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.sendKeys("email@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("123qwe");

//        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
//        signInButton.click();

        WebElement succesfullMessage = driver.findElement(By.tagName("h3"));
        String message = succesfullMessage.getText();

        System.out.println(message);

        Assert.assertEquals("Successfully Logged in..." , message  );

    /*
        Find the element for the username input

        and Password input
     */
    }



}
