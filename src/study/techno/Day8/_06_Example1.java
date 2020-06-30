package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import study.techno.Utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _06_Example1 extends BaseDriver {

    public static void main(String[] args) {

    /*
        Create one Random number and write it in the first input in the website

     */

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

//        Find first element
        WebElement firstNum = driver.findElement(By.id("number1Field"));

//        Create a random num
        int rand1  = RandomGenerator(100);

//        Changing the int rand1 to String and typing in the website
        firstNum.sendKeys(Integer.toString(rand1));

//        Find second element
        WebElement secondNum = driver.findElement(By.id("number2Field"));

//        Create a random num
        int rand2 = RandomGenerator(100);

//        Changing the int rand2 to String and typing in the website
        secondNum.sendKeys(Integer.toString(rand2));

//        Creating the element for the dropdown
        WebElement dropdownOperation = driver.findElement(By.id("selectOperationDropdown"));

//        Create a select object and connecting our select object to web elemetn
        Select selectObject = new Select(dropdownOperation);

//          getOptions --> Getting all the options from the dropdown and put it in the list
        List<WebElement> listOptions = selectObject.getOptions();

//        Create a random num
        int rand3 = RandomGenerator(listOptions.size());

//        Choose an element according to rand3
        selectObject.selectByIndex(rand3);

//      Create element of calculate button
        WebElement calculateButton = driver.findElement(By.id("calculateButton"));

//        Get the text from the List of dropdown
        String choose = listOptions.get(rand3).getText();

//        Click on the calculate button
        calculateButton.click();

        System.out.println("Choose "+choose);

        if(choose.equals("Add")){
            System.out.println(rand1 + rand2);
        }else if(choose.equals("Subtract")){
            System.out.println(rand1 - rand2);
        }else if(choose.equals("Multiply")){
            System.out.println(rand1 * rand2);
        }else if(choose.equals("Divide")){
            System.out.println(rand1 / rand2);
        }else if(choose.equals("Concatenate")){
//            System.out.println("Concat --> "+(rand1) +""+ (rand2));
//            System.out.println(String.valueOf(rand1).concat( String.valueOf(rand2)));
            System.out.println((rand1)+(rand2));
        }
 

    }

    public static int RandomGenerator(int max){

        Random rnd = new Random();

//        Creating the number between 0 < max
        int randomNum = rnd.nextInt(max);

        return randomNum;

    }

}
