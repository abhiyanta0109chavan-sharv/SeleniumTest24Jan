package WorkingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class WebDriverMethods {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = new WebDriver()
        Scanner input = new Scanner(System.in);
        System.out.println("Enter browser name: ");
        String  browserName = input.next();
        if(browserName.equalsIgnoreCase("chrome"))
        {
             driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
            return;
        }
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://www.naukri.com/recruit/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("name of title "+title);
        String url = driver.getCurrentUrl();
        System.out.println("name of title "+url);
        driver.manage().window().minimize();

        //driver.close();






    }
}
