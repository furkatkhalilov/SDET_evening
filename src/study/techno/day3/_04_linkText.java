package study.techno.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_linkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigating to the website
        driver.get("http://www.practiceselenium.com/");

        /*
        Rule 1: To use a linkText and partialLinkText we need to have 'a' tag.

        Rule 2: We need to get the text from the HTML.
         */

        WebElement ourPassionButton = driver.findElement(By.linkText("Our Passion"));
        ourPassionButton.click();

//      to get the URL we need to use driver.getCurrentUrl();
        String URL = driver.getCurrentUrl();

        System.out.println(URL);

//        Lets talk button element
        WebElement LetsTalkTeaButton = driver.findElement(By.partialLinkText("Talk Tea"));
        LetsTalkTeaButton.click();

        /*
        It the linktext and partial link text is key sensitive
         */

//        this one will not work because attribute name is not ID it is data-pageid
//        WebElement checkOutButton = driver.findElement(By.id("00000000-0000-0000-0000-000451986078"));
        WebElement checkOutButton = driver.findElement(By.partialLinkText("Check"));
        checkOutButton.click();

//        Link text vs partial link text in java
//        String s1 = "Hello World";
//
//        String s2 = "Hello";
//
//    /*
//        link text is checking is there any element in the website is equal to my text in the double
//            quotes.
//
//            link text is working as .equals in the java
//     */
//        System.out.println(s1.equals(s2)); //false like in the linktext
//
//        /*
//            partial link text is there any element in the website contains my text in the double
//            quotes
//
//         */
//        System.out.println(s1.contains(s2)); // true like in the partialLinkText

    }
}
