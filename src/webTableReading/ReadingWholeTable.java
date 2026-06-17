package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReadingWholeTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.xpath("(//table[@id=\"product\"])[2]"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));

        for(WebElement row:rows)
        {
            List<WebElement> cells = row.findElements(By.tagName("th"));
            if(cells.isEmpty())
            {
                cells = row.findElements(By.tagName("td"));
            }
            for(WebElement data:cells)
            {
                System.out.print(data.getText()+" \t");
            }
            System.out.println();
        }
}}
