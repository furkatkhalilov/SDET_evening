package study.techno.Day12;

import study.techno.Utils.BaseDriver;

public class _07_Task3 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1496137%3AUNKNOWN%3AUNKNOWN&destination-id=1496137&q-destination=Atlanta,%20Georgia,%20United%20States%20of%20America&q-check-in=2020-07-04&q-check-out=2020-07-05&q-rooms=1&q-room-0-adults=2&q-room-0-children=0&sort-order=STAR_RATING_HIGHEST_FIRST");

        /*
            Scroll to down
                When you are able to see the 100 hotels then stop the scrolling
                Then Print 100th hotel

         */

    }
}
