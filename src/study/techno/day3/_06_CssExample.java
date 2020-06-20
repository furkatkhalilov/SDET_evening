package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_CssExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigating to the website
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement EnterMessage = driver.findElement(By.id("user-message"));
        EnterMessage.sendKeys("I am here");

        WebElement ShowMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        ShowMessageButton.click();

        WebElement yourMessage = driver.findElement(By.id("display"));
        System.out.println(yourMessage.getText());

    }
}
