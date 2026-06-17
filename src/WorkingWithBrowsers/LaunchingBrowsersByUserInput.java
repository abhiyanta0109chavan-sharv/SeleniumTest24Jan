package WorkingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class LaunchingBrowsersByUserInput {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter browser name: ");
        String browserName = input.next();
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            return;
        }
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }
}
