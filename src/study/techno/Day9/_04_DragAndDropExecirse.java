package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _04_DragAndDropExecirse extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

            WebElement oslo = driver.findElement(By.id("box1"));

            WebElement norway = driver.findElement(By.id("box101"));

        Actions a1 = new Actions(driver);

        a1.dragAndDrop(oslo,norway).perform();

            WebElement stockholm = driver.findElement(By.id("box2"));

            WebElement sweden = driver.findElement(By.id("box102"));

        a1.dragAndDrop(stockholm,sweden).perform();

            WebElement washington = driver.findElement(By.id("box3"));

            WebElement US = driver.findElement(By.id("box103"));

        a1.dragAndDrop(washington,US).perform();


    }
}
