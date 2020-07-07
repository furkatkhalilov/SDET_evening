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
//        Scroll down to bottom of the IFrame
//          We are able to scroll down in the frame because we switched in it in line 14
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

//     Task: Switch to left frame search for asd and then scroll bottom of the page

//        switching to whole page
        driver.switchTo().parentFrame();

//        Switching to left frame
        driver.switchTo().frame("do-it-iframe");

        WebElement searchInput = driver.findElement(By.cssSelector("input[placeholder='Search …']"));
        searchInput.sendKeys("asd");

        WebElement searchbutton = driver.findElement(By.xpath("//input[@value='Search']"));
        searchbutton.click();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
