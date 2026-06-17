package Waits_Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait_Thread {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotstar.com/in/paywall");
        driver.manage().window().maximize();
        Thread.sleep(2000); //Static wait
}}
