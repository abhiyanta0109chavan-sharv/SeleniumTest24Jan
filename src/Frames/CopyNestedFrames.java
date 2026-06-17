package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyNestedFrames {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // switch to parent frame
        driver.switchTo().frame(0);

        // switch to child frame
        driver.switchTo().frame(0);

        System.out.println("Switched to 2nd frame");

        String Frame2HeaderText =
                driver.findElement(By.xpath("//h1[text()='Child Iframe']")).getText();

        System.out.println("Text is: " + Frame2HeaderText);

        Thread.sleep(2000);

        // back to parent frame
        driver.switchTo().parentFrame();

        System.out.println("Switched to 1st frame");

        // click link inside parent frame
        driver.findElement(By.xpath("//a[text()='New Tab']")).click();

        System.out.println("Done clicking");

    }
}