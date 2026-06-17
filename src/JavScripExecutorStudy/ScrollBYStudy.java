package JavScripExecutorStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBYStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://poi.apache.org/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,900); ");
        System.out.println("done");

       js.executeScript("window.scrollBy(100,300); ");
       js.executeScript("window.scrollBy(-100,-700); ");

        //driver.close();

    }
}
