package ProjectEccommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTable_ProductPage {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        driver.findElement(By.xpath("//button[@id=\"btn-admin-signin\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        driver.findElement(By.xpath("(//a[@href=\"/admin/products\"])[2]")).click();
        System.out.println("ProductsSidePannel");

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        WebElement table =driver.findElement(By.xpath("//table[@class=\"admin-table\"]"));
        System.out.println("Table located");
        List<WebElement> rows = table.findElements(By.xpath("//table//tr"));
        System.out.println("No of rows"+rows.size());

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        for(WebElement row : rows)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            List<WebElement> cells = row.findElements(By.xpath(".//th"));

            if(cells.isEmpty())
            {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                cells = row.findElements(By.xpath(".//td"));

            }

            for(WebElement data : cells)
            {
                System.out.print(data.getText() + "\t");
            }

            System.out.println();
        }
}}
