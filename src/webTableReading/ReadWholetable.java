package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReadWholetable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement table =driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]"));

        //driver limit instead of (driver.) I have used (table.)
        //count row
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row:rows)
        {
            // Read header cells
           List<WebElement> cells = row.findElements(By.tagName("th"));
           if(cells.isEmpty())
           {
               cells = row.findElements(By.tagName("td"));
           }
            // Print all cells of current row
            for(WebElement data:cells)
            {
                System.out.print(data.getText()+" \t");
            }
            System.out.println();
        }
    }
}
