package lesson4.Loops.Conditions;

import java.util.Scanner;

public class IfElseIfElseIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Gleb!");
        System.out.println("1 - print Hulk");
        System.out.println("2 - print Kakawka");
        System.out.println("3 - print Putin");
        System.out.println("Select number: ");

        int choice = sc.nextInt();
        if (choice==1){
            System.out.println("Vodka");
        } else if(choice == 2){
            System.out.println("blahblahblah");
        } else if (choice == 3){
            System.out.println("AAAAAAAASAUENIAAAAAA");
        } else if (choice == 1){
            System.out.println("PUMP IT UP!");
        }



        System.out.println(choice);
    }
}
