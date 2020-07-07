package study.techno.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _04_ScrollToWebElement extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://triplebyte.com/?ref=yt_20190826_t1_blade_skippable_2_animation&gclid=Cj0KCQiAvc_xBRCYARIsAC5QT9lHGgKp8Pta1S7Q8JRv42jozGtchlQfMpmfMQSqP5zXLWMngA-xK_caAhtlEALw_wcB");

        WebElement skills = driver.findElement(By.xpath("//h4[text()='Skills speak louder than resumes']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

//        Scrolling to the element
        js.executeScript("arguments[0].scrollIntoView();" , skills);

    }
}
