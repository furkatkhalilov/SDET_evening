package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

//        can we open browser full screen?
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914886"));

        System.out.println(element.getText());

        WebElement element2 = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887"));
        System.out.println(element2.getText());

        /*
        If you see the NoSuchElementException
            First check the locator
                If the locator correct then put some waits before the line which is failing.
         */
        WebElement elementWrongID = driver.findElement(By.id("this is wrong id"));
        System.out.println(elementWrongID.getText());


    }
}
