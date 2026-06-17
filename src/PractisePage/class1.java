package PractisePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class class1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href=\"/abtest\"]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@href=\"/add_remove_elements/\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
        WebElement checkBox1= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        boolean checkBox1Status = checkBox1.isSelected();
        if(checkBox1Status)
        {
            checkBox1.click();
            System.out.println("button is clicked bcz checkbox1 status is :"+checkBox1Status);
        }
        else
        {
            System.out.println("Not able to click checkbox1 bcz button is already clicked");
        }
        WebElement checkBox2= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        boolean checkBox2Status = checkBox2.isSelected();
        if(checkBox2Status)
        {
            checkBox2.click();
            System.out.println("button is clicked bcz checkbox2 status is :"+checkBox2Status);
        }
        else
        {
            System.out.println("Not able to click checkbox2 bcz button is already clicked");
        }
        // driver.findElement(By.xpath("//a[@href=\"http://elementalselenium.com/\"]")).click();

    }
}
