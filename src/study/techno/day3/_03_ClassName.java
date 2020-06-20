package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ClassName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

        /*
         If driver.findElement find multiple elements in the page. It will give me first found element.

         */
        WebElement teaName = driver.findElement(By.className("editor_collections"));

        System.out.println(teaName.getText());


    }
}
