package ScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static java.util.logging.FileHandler.*;

public class Take_ss {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpuneit.com/");
        Thread.sleep(3000);

        File source  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Destination = new File("D:\\ScreenShot\\1stSS.png");
        FileHandler.copy(source,Destination);
        System.out.println("ScreenSot is captured");



    }

}
