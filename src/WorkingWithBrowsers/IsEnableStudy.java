package WorkingWithBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableStudy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qa-practice.com/elements/button/disabled");
        WebElement CheckBtn= driver.findElement(By.xpath("//input[@name=\"csrfmiddlewaretoken\"]"));
       boolean statuscheck= CheckBtn.isEnabled();
       if(statuscheck)
       {
           CheckBtn.click();
           System.out.println("enable so clicked"+statuscheck);
       }
       else {
           System.out.println("not able to click"+statuscheck);
       }

    }
}
