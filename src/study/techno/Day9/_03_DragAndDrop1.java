package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _03_DragAndDrop1 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

        WebElement learningElement = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));

        WebElement myLibrary = driver.findElement(By.xpath("//div[@id='treeTarget']/ul"));

        Actions a1 = new Actions(driver);

//        Without perform keyword dragAndDrop action will not work
//        a1.dragAndDrop(learningElement,myLibrary).perform();

        Action act1 = a1.dragAndDrop(learningElement,myLibrary).build();
        act1.perform();

    }


}
