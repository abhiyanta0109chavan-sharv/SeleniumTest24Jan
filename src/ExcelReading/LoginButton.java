package ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginButton {
   public static void main(String[] args) throws IOException, InterruptedException {
       FileInputStream file = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");

       Sheet mysheet= WorkbookFactory.create(file).getSheet("Sheet2");

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

       driver.manage().window().maximize();
       Thread.sleep(3000);

       WebElement nameField = driver.findElement(By.cssSelector("#name"));
       WebElement emailIDField = driver.findElement(By.cssSelector("#email"));
       WebElement mobileNumField = driver.findElement(By.cssSelector("#mobile"));

       nameField.sendKeys(mysheet.getRow(0).getCell(0).getStringCellValue());
       emailIDField.sendKeys(mysheet.getRow(0).getCell(1).getStringCellValue());
       mobileNumField.sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue());
   }
}
