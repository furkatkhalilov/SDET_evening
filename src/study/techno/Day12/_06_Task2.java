package study.techno.Day12;

import org.openqa.selenium.JavascriptExecutor;
import study.techno.Utils.BaseDriver;

public class _06_Task2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
        navigate to https://www.etsy.com/

        Navigate to bottom of the page

        */

        driver.get("https://www.etsy.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

    }
}
