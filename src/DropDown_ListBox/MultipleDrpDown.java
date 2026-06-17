package DropDown_ListBox;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class MultipleDrpDown {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement MultiSelectDropDown = driver.findElement(By.id("cars"));
        Select select = new Select(MultiSelectDropDown);
        Thread.sleep(200);

        boolean MultipleDropDown =select.isMultiple();
        System.out.println("Verify that is dropdown multiselectable: "+MultipleDropDown);

        select.selectByValue("audi");
        Thread.sleep(200);
        select.selectByVisibleText("Saab");
        Thread.sleep(200);
        select.selectByIndex(0);
        select.selectByVisibleText("Opel");
        System.out.println("All are selected");

        select.deselectByIndex(0);
        System.out.println("Deselected 0 th index");

        File source  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Destination = new File("D:\\ScreenShot\\1stSS.png");
        FileHandler.copy(source,Destination);
        System.out.println("ScreenSot is captured");

        driver.close();


}}
