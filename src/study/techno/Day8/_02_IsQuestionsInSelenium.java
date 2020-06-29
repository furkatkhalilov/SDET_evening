package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _02_IsQuestionsInSelenium extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
              boolean isSelected();
              boolean isEnabled();
              boolean isDisplayed();
         */

        /*
        isSelected()
            I am using it mostly in checkbox or in the radio button.

                If the element is clicked already then it is return us true
                If the element is NOT clicked then it is return us false

         */

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

//        (//input[@type='checkbox'])[2]
        //label[text()='Tuesday']/preceding-sibling::input

        Thread.sleep(2000);

        WebElement inputTuesday  = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("is selected before clicking "+inputTuesday.isSelected());

        inputTuesday.click();

        System.out.println("is selected after clicking "+inputTuesday.isSelected());

        System.out.println("------------------------");

        /*
        isEnabled();
            Is enabled is looking for the the element able click on it or not.
         */

        WebElement SaturdayInput = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));

        System.out.println("Expected result is true -->  "+inputTuesday.isEnabled());

        System.out.println("Expected result is false -->" + SaturdayInput.isEnabled());

        System.out.println("-------------------");

        /*
        isDisplayed()
            Is checking is the element is displayed in the website or not.

            If the element is displayed return true.
            If the element is NOT displayed return ???.

         */

        System.out.println("Expected result for displayed is true -->  "+SaturdayInput.isDisplayed());

        //This element is not exist.

        try{


            WebElement wrongElement = driver.findElement(By.id("This is wrongggggg"));

            System.out.println(wrongElement.isDisplayed());

        }catch (Exception e){

            System.out.println("Element is not in the page even in the HTML code");

        }

        WebElement hiddenElement = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[1]"));

        System.out.println("Expected result is false --> "+hiddenElement.isDisplayed());


    }
}
