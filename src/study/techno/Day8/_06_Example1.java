package study.techno.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.Random;

public class _06_Example1 extends BaseDriver {

    public static void main(String[] args) {

    /*
        Create one Random number and write it in the first input in the website

     */

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement firstNum = driver.findElement(By.id("number1Field"));

        int rand1  = RandomGenerator(100);

        firstNum.sendKeys(Integer.toString(rand1));

        WebElement secondNum = driver.findElement(By.id("number2Field"));

        int rand2 = RandomGenerator(100);

        secondNum.sendKeys(Integer.toString(rand2));



    }

    public static int RandomGenerator(int max){

        Random rnd = new Random();

//        Creating the number between 0 - max
        int randomNum = rnd.nextInt(max);

        return randomNum;

    }

}
