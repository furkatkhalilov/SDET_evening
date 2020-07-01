package study.techno.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import study.techno.Utils.BaseDriver;

public class _01_Intro extends BaseDriver {

    public static void main(String[] args) {

        /*
           Interview Question:
                Which action you can do with actions class?
                    I can use actions class for
                    Hoverover , double click , right click , drag and drop , Click on Shift button
                    in selenium

                How to hover over in selenium?
                    I am using moveToElement method for hover over in selenium.

                Can you give me the syntax?
                    To use actions class I am creating the Actions object ,
                        I am passing my driver name as parameter.
                        I can do the actions then I am using the perform method.

         */

        driver.get("https://birtwhistle.com/workers-compensation-insurance/");

//        menu-item-19
        //span[text()='Personal Insurance']

        WebElement personalInsurance = driver.findElement(By.id("menu-item-19"));

//        Connecting actions class object with driver
        Actions a1 = new Actions(driver);

//        MoveEoElement method is hover over for me.
//        I am also connecting my actions class object with webElement

//        First Way
//        Action act1 = a1.moveToElement(personalInsurance).build();
//        act1.perform();

//        Second way
           a1.moveToElement(personalInsurance).perform();

    }
}
