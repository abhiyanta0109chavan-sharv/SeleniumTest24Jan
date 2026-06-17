package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Rediff {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        Thread.sleep(2000);

        WebElement SelectDropDownDay = driver.findElement(By.xpath("//select[@class=\"day\"]"));
        Select selectDay = new Select(SelectDropDownDay);
        selectDay.selectByValue("27");
        Thread.sleep(2000);

        WebElement SelectDropDownMonth = driver.findElement(By.xpath("//select[@class=\"middle month\"]"));
        Select selectMonth = new Select(SelectDropDownMonth);
        selectMonth.selectByVisibleText("MAY");
        Thread.sleep(2000);

        WebElement SelectDropDownYear = driver.findElement(By.xpath("//select[@class=\"year\"]"));
        Select SelectYear = new Select(SelectDropDownYear);
        SelectYear.selectByIndex(20);
        Thread.sleep(2000);

       List<WebElement> AllOptionMoth = selectMonth.getOptions();
       for(WebElement a:AllOptionMoth)
       {
           System.out.println(a.getText());
       }

       boolean isDropdownMultiselectable = SelectYear.isMultiple();
       System.out.println("Check if year drop down is multiselectable and its boolean value is: "+isDropdownMultiselectable);
}}
