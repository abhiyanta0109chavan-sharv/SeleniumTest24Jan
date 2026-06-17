package PractisePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanddyMapperPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://candymapper.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //Alert alt= driver.switchTo().alert();
        //alt.dismiss();
        driver.findElement(By.id("popup-widget5912-close-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()=\"JOIN US\"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Create account.\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("Abhiyanta");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder=\"Last name\"]")).sendKeys("Chavan");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("Abhiyanta@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder=\"Phone (optional)\"]")).sendKeys("7558682513");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=\"Create Account\"]")).click();
        System.out.println("You have created account");



    }
}