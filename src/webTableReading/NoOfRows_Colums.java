package webTableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfRows_Colums {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        int noOFColoms = driver.findElements(By.xpath("//table[@class=\"table table-striped mt-3\"]/thead/tr/th")).size();
        System.out.println(noOFColoms);

        int noOFRows = driver.findElements(By.tagName("tr")).size();
       System.out.println(noOFRows);



    }
}
