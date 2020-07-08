package study.techno.Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.techno.Utils.BaseDriver;

public class _03_AlternativeUpload extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement inputChooseFile = driver.findElement(By.id("uploadfile_0"));
        inputChooseFile.sendKeys("C:\\Users\\JuNiOr\\Desktop\\sifre.txt");

        driver.findElement(By.id("submitbutton")).click();

    }
}
