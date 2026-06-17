package Waits_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotstar.com/in/paywall");
        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        //here evenif if we used hours duration it will wait until page load remaining time it will ignore
        driver.findElement(By.xpath("//span[text()='Login']")).click();

    }
}
