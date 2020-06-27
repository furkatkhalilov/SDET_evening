package study.techno.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import study.techno.Utils.BaseDriver;

public class _02_SelectClassIntro extends BaseDriver {


    public static void main(String[] args) {

        /*
            Select class in Selenium.

            Select class handle the dropdown for us in websites.

            Select by visible Text --> Choose the element from the visible text
            Select by index -->  Choose the element by the location in the dropdown
            Select by value -->  Choose the element by value attribute.

        <option value="1">Collectibles</option>
        Visible text is equal to Collectibles
        value of this element is "1"

        INTERVIEW QUESTIONS
        1) How do you handle dropdown in selenium?
            I am using select class to handle dropdowns .

        2) What kind of types we have to use select class?
            We have 3 options 1 by visible Text
                              2 by index
                              3 by value

        3) Can you tell me the code of select class?


        NOTE: Select class is just for the dropdown

        IMPORTANT: We can use select class with dropdown which has SELECT  tag

         */

        driver.get("https://www.ebay.com/");

        WebElement menuDropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

//        Creating an object for the select class and giving the dropdown which is we want is to choose from
        Select s1 = new Select(menuDropDown);

//        s1.selectByVisibleText("Cameras & Photo");
//        s1.selectByIndex(4);
          s1.selectByValue("2984");

    }
}
