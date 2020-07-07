package study.techno.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.List;

public class _08_Task4 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.youtube.com/");

        /*
            Search for selenium
            Find the 80th video in page then print it.
         */



        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
        searchInput.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(5000);

        List<WebElement> AllVideos = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));

        System.out.println(AllVideos.size());

        while(AllVideos.size()<=80){

            JavascriptExecutor js = (JavascriptExecutor)driver;

            js.executeScript("arguments[0].scrollIntoView();" ,AllVideos.get(AllVideos.size()-1) );

            AllVideos = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));

            System.out.println(AllVideos.size());

        }

        System.out.println(AllVideos.get(AllVideos.size()-1));

    }

}
