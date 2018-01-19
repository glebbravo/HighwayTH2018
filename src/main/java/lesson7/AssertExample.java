package lesson7;

import lesson7.MyTestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MyTestListener.class})
public class AssertExample {

    @Test
    public void someAsserts() {
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertTrue(5 < 8,"Проверка 5<8");

    }

    @Test
    public void someAsserts2() {
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertTrue(5 > 8,"Проверка 5>8");

    }
}