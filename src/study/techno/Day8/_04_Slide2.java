package study.techno.Day8;

import study.techno.Utils.BaseDriver;

public class _04_Slide2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        /*
        void get(String url);  going to website
        String getCurrentUrl();  giving us a current URL

            URL = http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox

        String getTitle();

            title = Showcase of Features: Checkbox

        WebElement findElement(By by);  Finding one element from the website

        List<WebElement> findElements(By by); Finding the multiple elements from the website

        String getPageSource();

        void close();
        void quit();

         */

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        Thread.sleep(2000);

        System.out.println("Title of the page -->> "+driver.getTitle());

        System.out.println("-----------");

//        System.out.println(driver.getPageSource());

        /*
           Interview Question:
                Difference between driver.close vs driver.quit

                Close: Closing the current page

                Quit: Closing the browser

                driver.close();

                driver.quit();

                Quit: Quit is ending the task (chrome driver (32 bit)) in the task manager or activity monitor(mac)

                Close: Close is not ending it.

         */

    }
}
