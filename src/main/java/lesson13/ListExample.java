package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    @Test
    public void azazaza(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("Maria");
        stringList.add("Pavel");
        stringList.add("Gleb");
        System.out.println(stringList);

    }
}
