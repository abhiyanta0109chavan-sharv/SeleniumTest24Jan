package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);

        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("(//a[@style=\"color:#FFFFFF;\"])[2]"));
        Thread.sleep(1000);

        WebElement Destination = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
        Thread.sleep(1000);

        action.dragAndDrop(source,Destination).perform();

        WebElement source1 = driver.findElement(By.xpath("(//a[@style=\"color:#FFFFFF;\"])[4]"));
        Thread.sleep(1000);

        WebElement Destination1 = driver.findElement(By.xpath("//ol[@id=\"amt8\"]"));
        Thread.sleep(1000);

        action.moveToElement(source1).clickAndHold(source1).moveToElement(Destination1).release(Destination1).build().perform();

}}
