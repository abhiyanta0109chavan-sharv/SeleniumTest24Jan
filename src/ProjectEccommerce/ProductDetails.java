package ProjectEccommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ProductDetails extends LoginPageAdmin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("tab-admin")).click();

        driver.findElement(By.xpath("//input[@id=\"admin-username\"]")).sendKeys("9923478751");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"admin-password\"]")).sendKeys("Velocity@123");

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        System.out.println("Before SignIN");
        driver.findElement(By.xpath("//button[@id=\"btn-admin-signin\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        String TotalProduct = driver.findElement(By.xpath("//div[@class=\"admin-stat-card success\"]")).getText();
        System.out.println(TotalProduct);
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        String TotalOrders = driver.findElement(By.xpath("(//div[@class=\"admin-stat-card\"])[1]")).getText();
        System.out.println(TotalOrders);
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        String LowStockItems = driver.findElement(By.xpath("//div[@class=\"admin-stat-card warning\"]")).getText();
        System.out.println(LowStockItems);
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        String PendingOrders = driver.findElement(By.xpath("//div[@class=\"admin-stat-card danger\"]")).getText();
        System.out.println(PendingOrders);
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        String BackOrders = driver.findElement(By.xpath("(//div[@class=\"admin-stat-card\"])[2]")).getText();
        System.out.println(BackOrders);
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        driver.findElement(By.xpath("(//a[@href=\"/admin/products\"])[2]")).click();
        System.out.println("ProductsSidePannel");



        driver.close();
    }
}
