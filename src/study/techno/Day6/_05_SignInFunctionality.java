package study.techno.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import study.techno.Utils.BaseDriver;

public class _05_SignInFunctionality extends BaseDriver {

    /*
        Create a method which is taking two String(username , password)
        Entering the username and password then clicking on login button
            In the end of the class we will continue
     */

    public static void signInFuncMethod(String username , String password){


        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement buttonLogin = driver.findElement(By.className("btn_action"));
        buttonLogin.click();

    }

    public static void main(String[] args) {
        signInFuncMethod("standard_user" , "secret_sauce");
    }

}
