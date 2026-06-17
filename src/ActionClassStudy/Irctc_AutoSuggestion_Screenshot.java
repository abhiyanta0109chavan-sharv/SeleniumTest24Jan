package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Irctc_AutoSuggestion_Screenshot {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(1000);

        WebElement searchBox = driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[1]"));
        searchBox.click();
        searchBox.sendKeys("Pu");
        Thread.sleep(1000);

        List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        Thread.sleep(1000);

        System.out.println("Suggestion count is := "+AllSuggestions.size());

        for(WebElement s:AllSuggestions)
        {
            System.out.println(s.getText());
        }

        Thread.sleep(1000);
        String ExpectedResult = "PUNE JN - PUNE (PUNE)";

//        for(WebElement s:AllSuggestions)
//        {
//           if(ExpectedResult.equalsIgnoreCase(s.getText()))
//           {
//               s.click();
//               break;
//           }
//        }


        Actions obj = new Actions(driver);

        for(WebElement s:AllSuggestions)
        {
            Thread.sleep(100);
            obj.sendKeys(Keys.ARROW_DOWN).perform();
            System.out.println("checking --- "+s.getText());
            if(s.getText().contains("PUNARAKH - PHK"))
            {
               obj.sendKeys(s,Keys.ENTER).perform();
               break;
            }
        }
}}
