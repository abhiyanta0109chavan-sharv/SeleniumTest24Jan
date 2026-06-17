package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.Read;

public class ReadingRow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        int NoOFColoms = driver.findElements(By.xpath("//table[@class=\"table table-striped mt-3\"]/thead/tr/th")).size();
        System.out.println(NoOFColoms);

        int noOFRows = driver.findElements(By.tagName("tr")).size();
        System.out.println(noOFRows);

        for(int i=1;i<=NoOFColoms;i++)
        {
            String ReadHeaders =driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]/thead/tr/th["+i+"]")).getText();
            System.out.print(ReadHeaders+" ");
        }
        System.out.println();
        System.out.println("====================================================================================");
        for(int i= 1;i<=NoOFColoms;i++)
        {
            String ReadRow1 =driver.findElement(By.xpath("//tbody/tr[1]/td["+i+"]")).getText();
            System.out.print(ReadRow1+" ");
        }
        System.out.println();
        for(int i= 1;i<=NoOFColoms;i++)
        {
            String ReadRow2 =driver.findElement(By.xpath("//tbody/tr[2]/td["+i+"]")).getText();
            System.out.print(ReadRow2+" ");
        }
        System.out.println();
        for(int i= 1;i<=NoOFColoms;i++)
        {
            String ReadRow3 =driver.findElement(By.xpath("//tbody/tr[3]/td["+i+"]")).getText();
            System.out.print(ReadRow3+" ");
        }
        System.out.println();
        for(int i= 1;i<=NoOFColoms;i++)
        {
            String ReadRow4 =driver.findElement(By.xpath("//tbody/tr[4]/td["+i+"]")).getText();
            System.out.print(ReadRow4+" ");
        }
        System.out.println();
        for(int i= 1;i<=NoOFColoms;i++)
        {
            String ReadRow5 =driver.findElement(By.xpath("//tbody/tr[5]/td["+i+"]")).getText();
            System.out.print(ReadRow5+" ");
        }
}}
