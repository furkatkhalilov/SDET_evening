package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _02_ExerciseHoverOver extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://birtwhistle.com/workers-compensation-insurance/");

        WebElement businessInsurance  = driver.findElement(By.id("menu-item-18"));

        Actions a1 = new Actions(driver);

        a1.moveToElement(businessInsurance).perform();

        WebElement UmbrellaInsurance = driver.findElement(By.xpath("//span[text()='Commercial Umbrella Insurance']"));

        UmbrellaInsurance.click();

    }

}
