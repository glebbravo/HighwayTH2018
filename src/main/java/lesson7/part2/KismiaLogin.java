package lesson7.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class KismiaLogin extends BrowserFactory {
    WebDriver driver;


    @Test
    @Parameters({"email", "password"})
    public void login(@Optional("test@test.com") String email, @Optional String password) throws InterruptedException {
        System.out.println("EMAIL: "+email);
        System.out.println("PASSWORD: "+password);
        driver.get("https://kismia.com/");
        driver.findElement(By.xpath("//*[@id='user-email']")).click();
        driver.findElement(By.xpath("//*[@id='user-email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='user-password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='sign-in-form']/button")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://kismia.com/"), "Wrong Page: "+driver.getCurrentUrl());
    }

}
