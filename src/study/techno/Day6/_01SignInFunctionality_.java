package study.techno.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01SignInFunctionality_ {

    /*
            Automate the sign in functionality

            Find elements

            Reusable methods

     */

    public static void main(String[] args) throws InterruptedException {

        /*
            This class is a functional test.
        */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        String[] userNameArr = {"standard_user","locked_out_user","problem_user","performance_glitch_user"};

        String password = "secret_sauce";

        for(String user:userNameArr) {

            WebElement usernameInput = driver.findElement(By.id("user-name"));
            usernameInput.clear();
            usernameInput.sendKeys(user);

//            click on next button

            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.clear();
            passwordInput.sendKeys(password);

            WebElement buttonLogin = driver.findElement(By.className("btn_action"));
            buttonLogin.click();

            /*
                2 scenarios
                    Able to login
                    Not able to login
             */
            try{
                driver.findElement(By.xpath("//div[text()='Products']")); // just make sure I am able to login succesffully
                driver.navigate().back();
            }catch(NoSuchElementException e){
                System.out.println("Not able to login with " + user);

//                h3[data-test=error]
                String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                System.out.println(errorMessage);

            }

        }

    }




}
