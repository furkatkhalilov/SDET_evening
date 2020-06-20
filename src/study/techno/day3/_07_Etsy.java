package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_Etsy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        WebElement searchInput = driver.findElement(By.id("global-enhancements-search-query"));
        searchInput.sendKeys("TeddyBear");

//        driver.findElement(By.className("wt-input-btn-group__btn"))
        WebElement searchIcon = driver.findElement(By.cssSelector("button[aria-label='Search']"));
        searchIcon.click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

//        WebElement toysAndGames = driver.findElement(By.linkText("Toys & Games"));
//        String toysAttri = toysAndGames.getAttribute("data-level");
//
//        System.out.println(toysAttri);

//        to get rid of the StaleElementReferenceException we can re call the element
        searchInput = driver.findElement(By.id("global-enhancements-search-query"));

        String valueOfInput = searchInput.getAttribute("value");

        System.out.println(valueOfInput);

//        remove the text from the input.
        searchInput.clear();

        searchInput.sendKeys("phone");

//        click on search icon
        searchIcon = driver.findElement(By.cssSelector("button[aria-label='Search']"));
        searchIcon.click();

        String URL2 = driver.getCurrentUrl();
        System.out.println(URL2);

        /*
         StaleElementReferenceException
            When the element was in the page but it is not in the page any more.

         */


        /*
            Which locators do you use first in selenium? Which locator do you prefer in selenium?

            ID - because it is mostly unique
            Class - but usually class is not unique that is why I am looking for other locators
            Linktext
            Partial Linktext
            Css selector - Css is faster then xpath
            Xpath

         */

    }
}
