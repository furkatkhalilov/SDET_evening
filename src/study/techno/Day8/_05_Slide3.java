package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _05_Slide3 extends BaseDriver {

    public static void main(String[] args) {

        /*

        void driver.navigate().to(String url); working as driver.get
        void driver.navigate().back(); navigating to previous page
        void driver.navigate().forward(); navigating to next page
        void driver.navigate().refresh(); refreshing the page


        Timeouts  driver.manage().timeouts();
        Window driver.manage().window();


        TargetLocator switchTo();
        driver.switchTo().frame(String nameOrId);
        driver.switchTo().alert();
        Driver.switchTo().window()’


         */


        /*
             Implicit wait
             driver.manage().timeouts();


         */

        driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");



    }
}
