package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class NewTabChildBrowserStudy {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
        Thread.sleep(2000);

        Set<String> allWindowsID =  driver.getWindowHandles();
        ArrayList<String> arraylistOfAllWindowsID = new ArrayList<>(allWindowsID);
        String mainWindowId = arraylistOfAllWindowsID.get(0);
         String childWindowId = arraylistOfAllWindowsID.get(1);

         driver.switchTo().window(childWindowId);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/selenium/index.htm\"]")).click();

}}
