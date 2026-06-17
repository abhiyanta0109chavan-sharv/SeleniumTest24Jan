package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        WebElement click = driver.findElement(By.xpath("(//button[@type=\"button\"])[6]"));
        action.click(click).perform();
        System.out.println("click done");

        WebElement RightClick = driver.findElement(By.xpath("(//button[@type=\"button\"])[7]"));
        action.contextClick(RightClick).contextClick(RightClick).build().perform();
        System.out.println("Rightclick done");

        WebElement DoubleClick = driver.findElement(By.xpath("(//button[@type=\"button\"])[8]"));
        action.moveToElement(DoubleClick).doubleClick().build().perform();
        System.out.println("Double click done");
    }
}
