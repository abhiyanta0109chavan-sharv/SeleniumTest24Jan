package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class flipcartUnOrderedList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(4000);


        driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
        Thread.sleep(1000);

        WebElement SearchBox = driver.findElement(By.xpath("(//input[@title=\"Search for Products, Brands and More\"])[1]"));
        SearchBox.click();
        SearchBox.sendKeys("Laptop");
        Thread.sleep(1000);
        System.out.println("found Send keys box");

        Thread.sleep(1000);
        System.out.println("Send keys laptop");
        Thread.sleep(1000);
        List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@style=\"border-radius: 16px; background-color: rgb(255, 255, 255);\"]"));

        for(WebElement s: AllSuggestions)
        {
            System.out.println(s.getText());
        }
        Actions obj = new Actions(driver);
        obj.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    }}
