package lesson1.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id='email']")).clear();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testlogin@test.test");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("TESTPASSWORD");
        driver.findElement(By.xpath("//*[@id='loginbutton']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}