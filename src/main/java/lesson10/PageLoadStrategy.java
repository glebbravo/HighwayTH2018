package lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class PageLoadStrategy {
    public WebDriver driver;
    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("pageLoadStrategy", "none");
        driver = new ChromeDriver(options);
    }
}
