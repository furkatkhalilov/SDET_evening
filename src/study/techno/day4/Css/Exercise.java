package study.techno.day4.Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        driver.manage().window().maximize();

        WebElement businessRadio = driver.findElement(By.cssSelector("input[name='u_N8w_4586'][value='Business']"));
        businessRadio.click();

        WebElement dropdownDiscover = driver.findElement(By.cssSelector("select[id=u_N8w_4588]"));
        dropdownDiscover.click();

        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        WebElement buttonEveryDay = driver.findElement(By.cssSelector("input[value='Every Day']"));
        buttonEveryDay.click();

        WebElement goodRadio = driver.findElement(By.cssSelector("label[for='u_N8w_4589_0']"));
        goodRadio.click();

        WebElement howLongDropdown = driver.findElement(By.cssSelector("select[id='u_N8w_4597']"));
        howLongDropdown.click();

//        other option option[value*='using XYZ for about a week']
        WebElement forAboutAWeek = driver.findElement(By.cssSelector("select[id='u_N8w_4597']>option:nth-child(3)"));
        forAboutAWeek.click();

//      to find the child of the table we can use tbody>tr:nth-child(4)>td

    }
}
