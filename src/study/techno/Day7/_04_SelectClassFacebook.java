package study.techno.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import study.techno.Utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _04_SelectClassFacebook extends BaseDriver {

    public static void main(String[] args) {

        /*

        Navigate to https://www.facebook.com/

        Enter first name lastname mobile password

        Choose November in month

        Choose 25 in days

        Choose 2000 in years

        Click on
         */
        driver.get("https://www.facebook.com/");

        WebElement firstNameInput = driver.findElement(By.id("u_0_m"));
        firstNameInput.sendKeys("Testing");

        WebElement lastNameInput = driver.findElement(By.id("u_0_o"));
        lastNameInput.sendKeys("Test");

        WebElement emailInput = driver.findElement(By.id("u_0_r"));
        emailInput.sendKeys("Test@gmail.com");

        WebElement newPassword = driver.findElement(By.id("password_step_input"));
        newPassword.sendKeys("123qweasd");

        WebElement monthDropDown = driver.findElement(By.id("month"));

        Select s1 = new Select(monthDropDown);

//        s1.selectByVisibleText("Nov");
        s1.selectByValue("11");

        WebElement dayDropDown = driver.findElement(By.id("day"));

//        Select s2 = new Select(dayDropDown);
        s1 = new Select(dayDropDown);

        s1.selectByIndex(25);

        WebElement yearDropDown = driver.findElement(By.id("year"));

        s1 = new Select(yearDropDown);

        List<WebElement> yearList = s1.getOptions();

        Random rnd = new Random();

        int randomNum = rnd.nextInt(yearList.size());

        s1.selectByIndex(randomNum);

//        //label[text()='Female']

//        driver.findElement(By.xpath("//label[text()='Female']")).click();

        List<WebElement> genderOptions = driver.findElements(By.className("_58mt"));

        Random rnd2 =new Random();

        int random2 = rnd2.nextInt(genderOptions.size());

        genderOptions.get(random2).click();

    }
}
