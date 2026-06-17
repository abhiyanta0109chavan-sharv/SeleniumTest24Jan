package PractisePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("fullname")).sendKeys("Abhiyanta chavan");
         Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("abhiyanta27@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("address")).sendKeys(" sangli Maharashsangli Maharashsangli Maharash");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Abhi@123");
        Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
        Thread.sleep(1000);
        //driver.navigate().back();

       driver.findElement(By.xpath("(//button[contains(@class,'accordio')])[1]")).click();
        System.out.println("finally run");
        driver.findElement(By.xpath("//a[@href=\"check-box.php\"]")).click();
        Thread.sleep(1000);
        System.out.println("checkbox execution started");
       WebElement checkbox1= driver.findElement(By.id("c_bs_1"));
        boolean checkbox1Status=checkbox1.isSelected();
        if(!checkbox1Status)
        {
            checkbox1.click();
            System.out.println("not clicked so clicked it: "+checkbox1Status);
        }
        else
        {
            System.out.println("it is  clicked"+checkbox1Status);
        }
        driver.findElement(By.xpath("(//span[contains(@class,'plus')])[4]")).click();
        System.out.println("done");
        driver.findElement(By.id("c_bf_4")).click();
        System.out.println("lets move to radiobutton");
        driver.findElement(By.xpath("//a[@href=\"radio-button.php\"]")).click();
        System.out.println("Radio button execution strated");
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

}}

