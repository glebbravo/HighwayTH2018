package homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ExpectedMatches {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://kismia.com/");
        driver.findElement(By.xpath("//*[@id=\"user-email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-email\"]")).sendKeys("blink-182@bigmir.net");
        driver.findElement(By.xpath("//*[@id=\"user-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-password\"]")).sendKeys("5581359");
        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='new-header-main-nav__link new-header-main-nav__link--matches']")));
        driver.get("https://kismia.com/matches");
        for (int i = 0; i < 40; i++) {
            String id = driver.findElement(By.xpath("//a[@class='link matches-game-name show_payment_widget un_redirect_link']")).getAttribute("data-uid");
            driver.findElement(By.xpath("//div[@class='matches-game__button matches-game__button--like js_matchesGameLike']")).click();
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.xpath("//a[@class='link matches-game-name show_payment_widget un_redirect_link']"),"data-uid",id)));
            xx.add(id);

//            boolean present;
//            try {
//                driver.findElement(By.xpath("//div/a[@class='matches-more-views__cta__later js-skip-more-views']")).click();
//                present = true;
//            }catch (NoSuchElementException e){
//                present = false;
//            }
        }
        if (driver.findElements(By.xpath("//div/a[@class='matches-more-views__cta__later js-skip-more-views']")).size()!=0){
            driver.findElement(By.xpath("//div/a[@class='matches-more-views__cta__later js-skip-more-views']")).click();
        }
    }
}
