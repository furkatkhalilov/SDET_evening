package study.techno.Day13;

import study.techno.Utils.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_Exercise extends BaseDriver {

    public static void main(String[] args) throws AWTException, InterruptedException {

        /*
            Navigate to http://demo.guru99.com/test/upload--

            Click on Control + S

            Click on Enter
         */

        driver.get("http://demo.guru99.com/test/upload");

        Robot rbt = new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_S);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_S);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

    }
}
