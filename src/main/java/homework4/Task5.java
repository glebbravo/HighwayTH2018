package homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - January");
        System.out.println("2 - February");
        System.out.println("3 - March");
        System.out.println("4 - April");
        System.out.println("5 - May");
        System.out.println("6 - June");
        System.out.println("7 - July");
        System.out.println("8 - August");
        System.out.println("9 - September");
        System.out.println("10 - October");
        System.out.println("11 - November");
        System.out.println("12 - December");
        System.out.println("Type in the number of the month: ");


        int choice = sc.nextInt();
        switch (choice){
            case 1 : System.out.println("It's Winter"); break;
            case 2 : System.out.println("It's Winter"); break;
            case 3 : System.out.println("It's Spring"); break;
            case 4 : System.out.println("It's Spring"); break;
            case 5 : System.out.println("It's Spring"); break;
            case 6 : System.out.println("It's Summer"); break;
            case 7 : System.out.println("It's Summer"); break;
            case 8 : System.out.println("It's Summer"); break;
            case 9 : System.out.println("It's Autumn"); break;
            case 10 : System.out.println("It's Autumn"); break;
            case 11 : System.out.println("It's Autumn"); break;
            case 12 : System.out.println("It's Winter"); break;

        }
        System.out.println(choice);
    }
}
