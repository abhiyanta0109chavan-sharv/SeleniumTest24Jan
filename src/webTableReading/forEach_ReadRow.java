package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class forEach_ReadRow {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();

        // Header Reading
        List<WebElement> headers =
                driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/thead/tr/th"));

        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }

        System.out.println();
        System.out.println("===================================================");

        // Row Reading using For Each
        List<WebElement> rows =
                driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr"));

        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.tagName("td"));

            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }

            System.out.println();
        }

        driver.quit();
    }
}