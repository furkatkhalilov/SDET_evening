package study.techno.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Intro {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

//        java.lang.InterruptedException exception is a checked exception
        Thread.sleep(2000);
/*
        Thread.sleep is waiting for 5 seconds and for example if the element is displayed
            in 3 seconds then thread.sleep is not going to next line and it will make our code slower.
*/

//        Navigating to the website
        driver.navigate().to("https://www.google.com/?gws_rd=ssl");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.quit();

        /*
            Difference between the driver.get and driver.navigate

                Navigate has more actoins like navigate.back and navigate.forward
                 in this way we can navigate previous page and next page.

         */
    }
}
