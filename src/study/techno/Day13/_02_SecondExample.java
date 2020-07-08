package study.techno.Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_SecondExample extends BaseDriver {

    public static void main(String[] args) throws AWTException, InterruptedException {

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement chooseFile = driver.findElement(By.id("file_wraper0"));
        chooseFile.click();

    /*
        Copy the text
        First paste the text to input
            Click on enter
     */

//        With these two lines keyboard is copy the text in the double quotes.
        StringSelection stringSelection = new StringSelection("C:\\Users\\JuNiOr\\Desktop\\sifre.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);

        Robot rbt = new Robot();

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);

    }

}
