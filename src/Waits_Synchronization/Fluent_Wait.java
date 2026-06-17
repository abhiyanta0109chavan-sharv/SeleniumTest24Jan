package Waits_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluent_Wait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotstar.com/in/paywall");
        driver.manage().window().maximize();

        Wait<WebDriver> obj = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).
                ignoring(NoSuchElementException.class);

       obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
       driver.findElement(By.xpath("//span[text()='Login']")).click();

}}
