package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import study.techno.Utils.BaseDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _08_Exercise extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.snapdeal.com/");

        WebElement inputSearch = driver.findElement(By.id("inputValEnter"));
        inputSearch.sendKeys("Phone");

// This class will not work because there is a space between words and selenum see this class name as 3 diff classes
//        driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        searchButton.click();

        WebElement SecondElement = driver.findElement(By.xpath("(//p[@class='product-title '])[2]"));
        SecondElement.click();

//        All windows name in the Set<String>
        Set<String> allWindows = driver.getWindowHandles();

        String FirstTabName = driver.getWindowHandle();

//        Switching between the windows
        for(String eachWindow:allWindows){
            driver.switchTo().window(eachWindow);
        }

        System.out.println(driver.getCurrentUrl());

//
        String itemName = driver.findElement(By.tagName("h1")).getText();

        System.out.println(itemName);

        WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver , 10);

//        Will wait until add to cart button is become invisible
         wait.until(ExpectedConditions.invisibilityOf(addToCart));

        driver.close();

        driver.switchTo().window(FirstTabName);

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//span[text()='Cart']")).click();

        String itemName2 = driver.findElement(By.className("item-name")).getText();

        System.out.println(itemName);
        System.out.println(itemName2);
    }
}
