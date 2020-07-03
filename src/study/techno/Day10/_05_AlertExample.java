package study.techno.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _05_AlertExample extends BaseDriver {

    public static void main(String[] args) {

        /*
        Enter the data in the customer ID click on submit button
            Get the data from the alert and print it
            Click on OK in the alert and click on Ok in the alert
        */

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("123");

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        String alertMessage = driver.switchTo().alert().getText();

        System.out.println(alertMessage);

        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

    }

}
