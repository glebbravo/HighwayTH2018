package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Akinator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Scanner sc = new Scanner(System.in);
        driver.get("http://ru.akinator.com/");
        driver.findElement(By.xpath("//*[@id='bulle-inner']/a")).click();
        driver.findElement(By.xpath("//*[@id='elokence_sitebundle_identification_age']")).click();
        driver.findElement(By.xpath("//*[@id='elokence_sitebundle_identification_age']")).sendKeys("25");
        driver.findElement(By.xpath("//*[@id='elokence_sitebundle_identification_age']")).sendKeys(Keys.ENTER);

        do {
            String qnumber = driver.findElement(By.xpath("//*[@id='questionNo']")).getText();
            System.out.println(qnumber);

            String title =  driver.findElement(By.xpath("//*[@id='bulle-inner']")).getText();
            System.out.println("Вопрос: " + title);

            String response1 = driver.findElement(By.xpath("//*[@id='reponse1']")).getText();
            System.out.println("1- "+response1);

            String response2 = driver.findElement(By.xpath("//*[@id='reponse2']")).getText();
            System.out.println("2- "+response2);

            String response3 = driver.findElement(By.xpath("//*[@id='reponse3']")).getText();
            System.out.println("3- "+response3);

            String response4 = driver.findElement(By.xpath("//*[@id='reponse4']")).getText();
            System.out.println("4- "+response4);

            String response5 = driver.findElement(By.xpath("//*[@id='reponse5']")).getText();
            System.out.println("5- "+response5);

            int choice = sc.nextInt();
            switch (choice){
                case 1 : driver.findElement(By.xpath("//*[@id='reponse1']")).click(); break;
                case 2 : driver.findElement(By.xpath("//*[@id='reponse2']")).click(); break;
                case 3 : driver.findElement(By.xpath("//*[@id='reponse3']")).click(); break;
                case 4 : driver.findElement(By.xpath("//*[@id='reponse4']")).click(); break;
                case 5 : driver.findElement(By.xpath("//*[@id='reponse5']")).click(); break;
            }
            Thread.sleep(1000);
        }while (driver.getCurrentUrl().equals("http://ru.akinator.com/personnages/jeu"));
        Thread.sleep(1000);

        String resulttitle = driver.findElement(By.xpath("//*[@id='infos-perso-title']/p")).getText();
            System.out.println(resulttitle);
        String resultname = driver.findElement(By.xpath("//*[@id='perso']")).getText();
            System.out.println(resultname);
        String resultdescription = driver.findElement(By.xpath("//*[@id='description']")).getText();
            System.out.println(resultdescription);

                    Thread.sleep(1000);
                    driver.quit();




    }
}
