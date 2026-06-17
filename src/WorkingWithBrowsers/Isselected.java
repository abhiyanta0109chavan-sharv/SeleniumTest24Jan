package WorkingWithBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement RadioButton1 = driver.findElement(By.xpath("//input[@value=\"igottwo\"]"));
        Thread.sleep(2000);
        if (!RadioButton1.isSelected())
        {
            System.out.println("First if block of RadioButton1") ;
            RadioButton1.click();
            System.out.println("Button was not selected so selected it yes " );
        } else {
            System.out.println("Button is already selected" );
        }
        Thread.sleep(2000);
        WebElement RadioButton2 = driver.findElement(By.xpath("//input[@value=\"igotthree\"]"));
        if (RadioButton2.isEnabled()) {
            RadioButton2.click();
            System.out.println("Second click done impressive" );
        } else {
            System.out.println("already clicked");
        }
        WebElement Radiobutton3 = driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[3]"));
        Thread.sleep(2000);
        if (Radiobutton3.isEnabled()) {
            Radiobutton3.click();
            System.out.println("button is enable so clicked" );
        } else {
            System.out.println("button is not enabled" );
        }
    }
}
