package Waits_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hotstar.com/in/paywall");
    driver.manage().window().maximize();

    WebDriverWait obj = new WebDriverWait(driver, Duration.ofMinutes(2));
        // obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
        //driver.findElement(By.xpath("//span[text()='Login']")).click();

        WebElement button = driver.findElement(By.xpath("//span[text()='Login']"));
        obj.until(ExpectedConditions.visibilityOf(button));
        button.click();


}}
