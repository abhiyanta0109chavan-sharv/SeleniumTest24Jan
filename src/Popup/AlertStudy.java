package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vinothqaacademy.com/iframe/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"popuppage\"]")));
        System.out.println("Switched to frame");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()=\"Alert Box\"]")).click();
        System.out.println("Switched to alert1");
        Thread.sleep(1000);
        Alert alt = driver.switchTo().alert();
        String text = alt.getText();
        System.out.println(text);
        alt.accept();
        Thread.sleep(500);

        driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
        System.out.println("Switched to alert1");
        Thread.sleep(1000);
        Alert alt1 = driver.switchTo().alert();
        alt1.dismiss();

        driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
        System.out.println("Switched to alert2");
        Thread.sleep(1000);
        Alert alt2 = driver.switchTo().alert();
        alt2.sendKeys("yes");
        alt2.accept();




        
}}
