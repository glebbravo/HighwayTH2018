package lesson4.Loops;

import java.util.Scanner;

public class StringEqualsExample {
    public static void main(String[] args) {
         String str1 = new String("Привет");
         String str2 = new String("Привет");
        String sameStr = str1;

        boolean b1 = str1 == str2; //b1 -false потому что str1 и str2 это 2 разных объекта
        boolean b2 = str1.equals(str2); //b2 - true потому что str1 и str2 логически эквивалентны
        boolean b3 = str1 == sameStr; //b3 - true потому что str1 и sameStr в действительности один и тот же объект

    }
}
