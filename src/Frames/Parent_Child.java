package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"new-tab-sample.php\"]"));
        //driver.switchTo().frame(frame);
        //driver.switchTo().frame(0);
        System.out.println("Trying to switch frame1");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        System.out.println("Switched to frame 0");
        Thread.sleep(1000);

        System.out.println("Trying to focus on new tab");
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println("Trying to close");
        driver.close();
        System.out.println("Trying to switch frame1");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        System.out.println("Switched to frame 1");
        Thread.sleep(1000);


    }
}
