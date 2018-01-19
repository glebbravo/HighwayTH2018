package homework2;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Input first letter: ");
        char ch = reader.next().charAt(0);
        int i = ch;
        System.out.println(i);
    }
}
