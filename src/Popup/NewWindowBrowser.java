package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class NewWindowBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        Thread.sleep(500);

        driver.findElement(By.xpath("//button[text()='New Window']")).click();
        Thread.sleep(500);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        Set<String> AllWindowId =driver.getWindowHandles();
        System.out.println(AllWindowId);
        Thread.sleep(500);

        ArrayList<String> arraylistOfAllWindowsID = new ArrayList<String>(AllWindowId);
        String MainWindowID=arraylistOfAllWindowsID.get(0);
        String ChildWindowId=arraylistOfAllWindowsID.get(1);
        Thread.sleep(500);

        driver.switchTo().window(ChildWindowId);
        Thread.sleep(1000);
        String newTabText = driver.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]")).getText();
        System.out.println("text on new window"+newTabText);
        driver.findElement(By.xpath("//a[@href=\"/selenium/index.htm\"]")).click();
        System.out.println(AllWindowId);

        Set<String> AllWindowId1 =driver.getWindowHandles();
        ArrayList<String> arraylistOfAllWindowsID1 = new ArrayList<String>(AllWindowId1);
        System.out.println(arraylistOfAllWindowsID1);




}}
