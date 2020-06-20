package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

//        tagname[attributeName=‘value’]

        WebElement ourPassionButton = driver.findElement(By.cssSelector("a[data-title='Our Passion']"));
        ourPassionButton.click();

    }
}
