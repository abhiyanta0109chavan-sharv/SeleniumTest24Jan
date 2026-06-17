package ScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureSSWithTimestamp {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpuneit.com/");
        Thread.sleep(3000);

        String TimeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\Win-10\\IdeaProjects\\SeleniumProject\\out\\Evidence"+TimeStamp+".png");
        System.out.println("your screenshot saved at " + Destination);

        FileHandler.copy(source, Destination);
    }
}
