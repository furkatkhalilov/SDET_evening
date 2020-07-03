package study.techno.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.List;

public class _04_IFrameWithIndex extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        List<WebElement> IFrameList = driver.findElements(By.tagName("iframe"));
        System.out.println(IFrameList.size());

        for(int i = 0 ; i<IFrameList.size() ; i++){

            driver.switchTo().frame(i);
            int frameInTheSize = driver.findElements(By.tagName("iframe")).size();

            System.out.println("Frame in the frame count = " + frameInTheSize);

            /*
                Without this line Selenium is not able to see the second frame
                    Because when we switch to first one It is just focusing to the first frame
                    and not able to see the rest of the page.
             */
            driver.switchTo().parentFrame();
        }
    }

}
