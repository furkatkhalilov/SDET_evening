package study.techno.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _03_ExampleForScroolInFrame extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.dezlearn.com/testingpage/");

        driver.switchTo().frame("contact-iframe");

        WebElement e1 = driver.findElement(By.id("ninja_forms_field_11"));
        e1.sendKeys("Ali");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


    }
}
