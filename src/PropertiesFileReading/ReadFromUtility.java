package PropertiesFileReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ReadFromUtility {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(Utility.readDataFromProperty("URL"));
        System.out.println("Used URL from utility class and properties method");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#name")).sendKeys(Utility.readDataFromExcel(0,0));
        driver.findElement(By.cssSelector("#email")).sendKeys(Utility.readDataFromExcel(0,1));
        driver.findElement(By.cssSelector("#mobile")).sendKeys(Utility.readDataFromExcel(0,2));
        System.out.println("Used name,email,mobile data from excel");

        Utility.takeScreenshot(driver);
        System.out.println("Captured ss");
    }
}
