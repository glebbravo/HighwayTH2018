package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countrySet = new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("USA");
        countrySet.add("Honduras");
        countrySet.add("USA");
        System.out.println(countrySet);
    }
}
