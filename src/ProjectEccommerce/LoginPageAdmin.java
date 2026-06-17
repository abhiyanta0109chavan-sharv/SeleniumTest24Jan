package ProjectEccommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginPageAdmin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("tab-admin")).click();

        driver.findElement(By.xpath("//input[@id=\"admin-username\"]")).sendKeys("9923478751");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"admin-password\"]")).sendKeys("Velocity@123");

       Thread.sleep(1000);
        System.out.println("Before SignIN");
        driver.findElement(By.xpath("//button[@id=\"btn-admin-signin\"]")).click();


    }}

