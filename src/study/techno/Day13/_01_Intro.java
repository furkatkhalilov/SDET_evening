package study.techno.Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _01_Intro extends BaseDriver {

    public static void main(String[] args) throws AWTException, InterruptedException {

        /*
            Robot class helping me to handle the windows pop ups.

            Interview Question
                1) How you are handling the windows pop ups?
                    I am using robot class to handle windows pop up in selenium.

                2) How to upload a file with a selenium?
                     I am using robot class to handle uploading in selenium.
         */

         driver.get("https://www.cleartrip.com/");

         Robot rbt = new Robot();

//         rbt.keyPress();  Pressing on the button in the keyboard
//         rbt.keyRelease();  Stop pressing on the button in the keyboard

         Thread.sleep(2000);
         rbt.keyPress(KeyEvent.VK_TAB);
         rbt.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(2000);

         rbt.keyPress(KeyEvent.VK_TAB);
         rbt.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(2000);
         rbt.keyPress(KeyEvent.VK_TAB);
         rbt.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

    }




}
