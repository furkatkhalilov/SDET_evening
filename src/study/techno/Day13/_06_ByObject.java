package study.techno.Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

public class _06_ByObject extends BaseDriver {

    public static void main(String[] args) {

        WebDriverWait wait = new WebDriverWait(driver,10);

//        Creating the element in the By
        By b1 = By.linkText("Social Justice Resources");

//        I am able to use By object in the WebElement multiple types
        WebElement element = driver.findElement(b1);

        WebElement e2 = driver.findElement(b1);

//        I am able to use By object in the explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(b1));


    }

}
