package study.techno.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _05_Task1 extends BaseDriver {

    public static void main(String[] args) {

/*
        navigate to https://www.etsy.com/

        Scroll to What is Etsy? text

 */
        driver.get("https://www.etsy.com/");

        WebElement watisEtsy =driver.findElement(By.xpath("//h2[text()=' What is Etsy? ']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView();" , watisEtsy);

    }
}
