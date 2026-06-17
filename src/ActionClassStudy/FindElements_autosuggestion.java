package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FindElements_autosuggestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);


        WebElement SearchBox = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        SearchBox.sendKeys("melo");
        Thread.sleep(1000);
        System.out.println("Send keys box");

        //obj.sendKeys(SearchBox,"Melo");
        Thread.sleep(1000);
        System.out.println("Send keys melo");
        Thread.sleep(1000);
        List<WebElement> AllSuggestions = driver.findElements(By.xpath("//div[@class=\"UUbT9 EyBRub\"]"));

        for(WebElement s: AllSuggestions)
        {
        System.out.println(s.getText());
        }

        Actions obj = new Actions(driver);
        obj.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();


}}
