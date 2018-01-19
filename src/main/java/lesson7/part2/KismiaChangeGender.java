package lesson7.part2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class KismiaChangeGender extends BrowserFactory {

    @Test
    public void changeGender(){
        driver.get("https://kismia.com/profile/settings");
        driver.findElement(By.cssSelector("[name='search_gender][value='m']")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/button")).click();


    }


}
