package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchHelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //Инициализация драйвера
        driver.get("https://www.facebook.com/"); //Переход по ссылке. Обазателен протокол http/https

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("unsteady@meta.ua");
        driver.findElement(By.id("pass")).sendKeys("california5581359");
        driver.findElement(By.id("loginbutton")).click();
        driver.get("https://www.facebook.com/dan.dudelife.bravo"); 
        driver.get("https://www.facebook.com/messages/t/dan.dudelife.bravo");
        //driver.findElement(By.id("js_d")).click();
        driver.findElement(By.id("js_d")).sendKeys("АУЕ");
        driver.findElement(By.id("js_d")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();
        Thread.sleep(4000);
    }
}
