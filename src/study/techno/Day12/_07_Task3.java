package study.techno.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class _07_Task3 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1496137%3AUNKNOWN%3AUNKNOWN&destination-id=1496137&q-destination=Atlanta,%20Georgia,%20United%20States%20of%20America&q-check-in=2020-07-04&q-check-out=2020-07-05&q-rooms=1&q-room-0-adults=2&q-room-0-children=0&sort-order=STAR_RATING_HIGHEST_FIRST");

        /*
            Scroll to down
                When you are able to see the 100 hotels then stop the scrolling
                Then Print 100th hotel
         */

//        We are getting all hotel list to find the 100th hotel
        List<WebElement> hotelList = driver.findElements(By.className("property-name-link"));

        System.out.println(hotelList.size());


        /*
            Scroll to last element in the page
                get the count
                If it is more then 100 then stop
         */
        while(hotelList.size()<=100){

            JavascriptExecutor js = (JavascriptExecutor)driver;

    /*            Scroll to last element in the List
                    Why we used -1
                        Because hotelList.size() start counting from 1
                        hotelList.get() start counting from 0
                            And if dont use it List will throw
                            ArrayIndexOutOfBoundException
  */
            js.executeScript("arguments[0].scrollIntoView();", hotelList.get(hotelList.size()-1));

            hotelList = driver.findElements(By.className("property-name-link"));

            System.out.println(hotelList.size());

        }

        System.out.println(hotelList.get(99).getText());
        System.out.println("code is done");

    }
}
