package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import study.techno.Utils.BaseDriver;

public class _01_Intro extends BaseDriver {

    public static void main(String[] args) {


        /**
         * If this current element is a form, or an element within a form, then this will be submitted to
         * the remote server. If this causes the current page to change, then this method will block until
         * the new page is loaded.
         *
         * @throws NoSuchElementException If the given element is not within a form
         */

        /*
            In case if we can not click on the element in the form then we can use this option.
         */


        /*
        void click(); Clicking on the element.
        void submit();
                  driver.findElement(By.id("username")).submit();

        void sendKeys(CharSequence... keysToSend); type in the element
        void clear();   clear the text in the input
        String getTagName();   Is returning me tag name of the element
        String getAttribute(String name);
            driver.findElement(By.id("global-enhancements-search-query")).getAttribute("value");


        boolean isSelected();
        boolean isEnabled();
        boolean isDisplayed();


        String getText();                   getting the text from the website


        String getCssValue(String propertyName);
                With a css value: We can get the color, font-size, backgroun-color

         */




        /*


         */

    }
}
