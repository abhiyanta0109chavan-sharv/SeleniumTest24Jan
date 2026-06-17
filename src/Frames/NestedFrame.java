package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frame1\"]")));
        Thread.sleep(3000);
        System.out.println("switched frame 0 ");
        String Frame2HeaderText=driver.findElement(By.xpath("//h1[text()='New Tab']")).getText();
        Thread.sleep(3000);
        //String Frame2HeaderText =driver.findElement(By.xpath("//h1[text()='Child Iframe']")).getText();
        System.out.println("text is"+Frame2HeaderText);
        Thread.sleep(2000);

        driver.switchTo().parentFrame();
        System.out.println("switched to 1st frame");
        driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
        System.out.println("Done of the click frame 1");

    }}

