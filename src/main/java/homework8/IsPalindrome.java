package homework8;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        isPalindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        String pol = r.replaceAll("[^A-Za-z1-9]+", "");
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return pol;
    }

    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }
}
