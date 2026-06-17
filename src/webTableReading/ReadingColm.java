package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingColm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //int noOfRows = driver.findElements(By.xpath("//table//tbody//tr")).size(); this will not count header row
        int noOfRows = driver.findElements(By.xpath("//table//tbody/tr")).size();
        System.out.println("No of rows = "+noOfRows);
        int noOfColms = driver.findElements(By.xpath("//table//thead/tr/th")).size();
        System.out.println("No of columns = "+noOfColms);

        for(int i= 1; i<noOfRows;i++)
        //in the for loop i removed = sign bcz it was trying to fetch 6 th row and hrowing exception we can handle it by changing no of rows tagname to xpath like (//table//tbody/tr )
        {
            //To handle header
            if(i==1)
            {
                for (int j= 1; j<=noOfColms;j++) {
                    String header = driver.findElement(By.xpath("//table//thead/tr/th["+j+"]")).getText();
                    System.out.print(" \t"+header);
                }
                System.out.println();
                System.out.println("========================================================");
            }
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[1]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();

        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[2]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();
        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[3]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();
        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[4]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();
        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[5]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();
        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[6]")).getText();
            System.out.print(" \t"+ColmValue);
        }
        System.out.println();
        for(int i= 1; i<=noOfRows;i++)
        {
            String  ColmValue = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td[7]")).getText();
            System.out.print(" \t"+ColmValue);
        }


}}
