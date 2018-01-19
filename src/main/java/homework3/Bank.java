package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.privat24.ua/");
        String privat = driver.findElement(By.xpath("//div[2]/span")).getText();

        for (String priv : privat.split("EUR: 32.70 / 33.33")) {
            System.out.println("Privat Bank " + priv);

         driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
         String ukrsibBuy = driver.findElement(By.xpath("//main/section[2]/div[2]/table/tbody/tr[1]/td[2]")).getText();
         String ukrsibSell = driver.findElement(By.xpath("//main/section[2]/div[2]/table/tbody/tr[1]/td[3]")).getText();
            System.out.println("Ukrsib Bank " + ukrsibBuy + " / " + ukrsibSell);

          driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
          String avalBuy = driver.findElement(By.xpath("//*[@id='bar-center']/div[1]/div/div[1]/table/tbody/tr[2]/td[2]")).getText();
          String avalSell = driver.findElement(By.xpath("//*[@id='bar-center']/div[1]/div/div[1]/table/tbody/tr[2]/td[3]")).getText();
            System.out.println("Aval Bank USD: " + avalBuy + " / " + avalSell);

           driver.get("http://www.oschadbank.ua/ua/");
           String oshad = driver.findElement(By.xpath("//*[@id='site-content']/section[2]/div/div/div/div[1]/div/div[1]")).getText();
            for (String osh : oshad.split("EUR: 32.70 / 33.33")) {
                System.out.println("Oshad Bank USD: " + osh);

           driver.get("https://bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
           String nbu = driver.findElement(By.xpath("//td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[9]/td[5]")).getText();
                System.out.println("NBU USD: " + nbu);
            }
        }
    }
}