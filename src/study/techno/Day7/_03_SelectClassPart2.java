package study.techno.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import study.techno.Utils.BaseDriver;

public class _03_SelectClassPart2 extends BaseDriver {

    /*
    Navigate to https://www.amazon.com/

    Choose amazon fresh
     */

    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        WebElement menuDropdown = driver.findElement(By.id("searchDropdownBox"));

        Select s1 = new Select(menuDropdown);

//        s1.selectByVisibleText("Amazon Fresh");
        s1.selectByIndex(4);

        WebElement searchButton = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
        searchButton.click();

        /*
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
        searchButton.click(); is not working for click on the search button in amazon

        ElementClickInterceptedException
            There is one element front of your webelement

         */

    }


}
