package JavScripExecutorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollToElementAStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://poi.apache.org/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement refVariable = driver.findElement(By.xpath("//h2[text()='Contributing']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)",refVariable);

          driver.close();
    }}
