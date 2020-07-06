package study.techno.Day12;

import org.openqa.selenium.JavascriptExecutor;
import study.techno.Utils.BaseDriver;

public class _01_Intro extends BaseDriver {

    /*
        We are able to scroll down in selenium
        We are using the java script executer
        and Able to scroll down by pixel to element and bottom of the page

     */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://triplebyte.com/?ref=yt_20190826_t1_blade_skippable_2_animation&gclid=Cj0KCQiAvc_xBRCYARIsAC5QT9lHGgKp8Pta1S7Q8JRv42jozGtchlQfMpmfMQSqP5zXLWMngA-xK_caAhtlEALw_wcB");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");

        Thread.sleep(2000);

//                     (0,-2000)    left number is "0" scrolling from right to left
//                     (0,-2000)    right number is "-2000" scrolling from top to bottom
        js.executeScript("window.scrollBy(0,-2000)");
        
    }
}
