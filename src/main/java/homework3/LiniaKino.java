package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LiniaKino {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//body//b")).click();
        driver.findElement(By.xpath("//*[@id='content-inner']//li[2]/a")).click();

        WebElement hallFrame = driver.findElement(By.xpath("//*[@class='arcticmodal-container_i']//iframe"));
        driver.switchTo().frame(hallFrame);
        driver.findElement(By.xpath("//*[@class='seat seat-color1']"));
        List<WebElement> seats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@id,'hseat')]"));
        System.out.println("Seats amount: " + seats.size());

        List<WebElement> freeSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@class,'seat seat-color1')]"));
        System.out.println("Free seats: "+ freeSeats.size());

        List<WebElement> takenSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//*[contains(@class,'seat seat-occupied')]"));
        System.out.println("Taken seats: " + takenSeats.size());

        System.out.println("Percentage of free seats: " + (freeSeats.size()*100)/seats.size() +"%");
        System.out.println("Percentage of taken seats: " + (takenSeats.size()*100)/seats.size() +"%");
        driver.quit();
    }
}