package study.techno.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

        

    }
}
