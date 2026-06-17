package PropertiesFileReading;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {
    //In utility class we have all common methods
    //Main method should not there

    //common code to read data from properties file
    public static String readDataFromProperty(String key) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Win-10\\IdeaProjects\\SeleniumProject\\application.properties");

        Properties obj = new Properties();
        obj.load(myFile);

        System.out.println("Key is"+key);
        String value = obj.getProperty(key);
        System.out.println("Key Value is "+value);
        return value;
    }

    //Common code to read data from ExcelSheet
    public static String readDataFromExcel(int row,int cell) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");

        String CellValue = WorkbookFactory.create(file).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Reading value from excel sheet row is "+row+"cell is "+cell);

        return CellValue;
    }

    //common code to take screenshot
    public static void takeScreenshot(WebDriver driver) throws IOException {
        String TimeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\Win-10\\IdeaProjects\\SeleniumProject\\out\\Evidence"+TimeStamp+".png");
        System.out.println("your screenshot saved at " + Destination);
        FileHandler.copy(source, Destination);
    }
    public static void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("tab-admin")).click();

        driver.findElement(By.xpath("//input[@id=\"admin-username\"]")).sendKeys("9923478751");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"admin-password\"]")).sendKeys("Velocity@123");

        Thread.sleep(1000);
        System.out.println("Before SignIN");
        driver.findElement(By.xpath("//button[@id=\"btn-admin-signin\"]")).click();
    }


}
