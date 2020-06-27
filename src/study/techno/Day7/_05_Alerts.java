package study.techno.Day7;

import org.openqa.selenium.By;
import study.techno.Utils.BaseDriver;

public class _05_Alerts extends BaseDriver {

    public static void main(String[] args) {

    driver.get("http://demo.guru99.com/test/delete_customer.php");

    driver.findElement(By.xpath("//input[@value='Submit']")).click();

    driver.switchTo().alert().accept();

    }
}
