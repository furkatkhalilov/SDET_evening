package study.techno.Day13;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _05_ActionExercise extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
            navigate to https://www.yogaalliance.org/--

            Hover over on the become a member button

            Click on the Teachers button

            Verify URL is containing the Teachers text.


         */

//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.yogaalliance.org/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Social Justice Resources")));

//        WebElement  e1 =driver.findElement(By.linkText("Social Justice Resources"));
//
//        wait.until(ExpectedConditions.visibilityOf(e1));
//
//        By b1 = By.linkText("Social Justice Resources");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(b1));

        WebElement BecomeAMember = driver.findElement(By.linkText("Become a Member"));

        Actions actions = new Actions(driver);
        actions.moveToElement(BecomeAMember).perform();

        //        (//a[text()='Teachers'])[2] other option for the teachers element
        WebElement teachers = driver.findElement(By.xpath("//li[@class='category child-3']/a[text()='Teachers']"));
        teachers.click();


//        wait.until(ExpectedConditions.invisibilityOf(teachers)); waiting until element invisible
        wait.until(ExpectedConditions.titleContains("Teachers | Yoga Alliance"));

        String URL = driver.getCurrentUrl();

        System.out.println(URL);

        Assert.assertTrue(URL.contains("Teachers"));

        /*
            Why Implicit wait is not working?
               driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

               Implicit wait is waiting if there is a noSuchElementException.

         */

    }
}
