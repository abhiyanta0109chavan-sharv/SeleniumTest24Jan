package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionStudy {
    public static void main(String[] args) {

        ChromeOptions obj = new ChromeOptions();
        obj.addArguments("incognito","start-maximized","disable-notifications","disable-infobars");

        WebDriver driver = new ChromeDriver(obj);
        driver.get("https://www.google.com/");

    }
}
