package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ForEach_ReadColm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> headers =driver.findElements(By.xpath("//table//thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr"));

        int colIndex = 1;

        for(WebElement header : headers)
        {
            System.out.println(" \t" + header.getText());
            System.out.println("----------------");

            for(WebElement row : rows)
            {
                String value = row.findElement(By.xpath("./td[" + colIndex + "]")).getText();
                System.out.println(value);
            }
            colIndex++;
        }
    }
}
