package study.techno.day4.Recap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/accessing-link.html");

        /*
        Click on go here button

        click on click here button

        Check the URL

         */

        WebElement goHereButton = driver.findElement(By.linkText("go here"));
        goHereButton.click();

        /*
            Why we are using the WebElement

            In the future we will call the web element in the different class and in that time we are
             always work with webElement

         */
        String URL1 = driver.getCurrentUrl();

        System.out.println(URL1);

        Assert.assertEquals("https://www.google.com/?gws_rd=ssl",URL1);

        driver.navigate().back();

        WebElement clickHereButton = driver.findElement(By.linkText("click here"));
        clickHereButton.click();


    }

}
