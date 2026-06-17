package JavScripExecutorStudy;

import PropertiesFileReading.Utility;
import ScreenShot.Take_ss;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement nameField= driver.findElement(By.cssSelector("#name"));
        WebElement gmailField = driver.findElement(By.cssSelector("#gender"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].value='Abhiynata';",nameField);
        js.executeScript("arguments[0].click();",gmailField);

        Utility.takeScreenshot(driver);


    }
}
