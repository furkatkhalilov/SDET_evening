package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _05_Slide3 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

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

        /*
            Implicit wait:
                Wait until element is displayed
                Waiting time is maximum 30 seconds

                After the implicit wait if the driver not able to find the element
                Then it will throw null pointer exception

                Implicit wait is assigning to the driver.

                For each driver creating one implicit wait will be enough.

         */

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));

        downloadButton.click();

//        Thread.sleep(30000);  this is waiting for 10 seconds

        WebElement text = driver.findElement(By.xpath("//div[text()='Complete!']"));

        System.out.println(text.getText());

        WebElement text2 = driver.findElement(By.xpath("//div[text()='Wrong Input!']"));

        System.out.println(text2.getText());



    }
}
