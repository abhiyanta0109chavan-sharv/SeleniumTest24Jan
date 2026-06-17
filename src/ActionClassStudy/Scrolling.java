package ActionClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);

        Actions action = new Actions(driver);

        action.scrollByAmount(400,400).perform();



}}
