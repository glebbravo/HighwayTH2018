package lesson4.Loops.Conditions;

import java.util.Scanner;

public class TaskLesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User 1 type your number: ");
        System.out.println("User 2 type your number: ");

        int choice1 = sc.nextInt();
        int choice2 = sc.nextInt();

        if (choice1<choice2){
            System.out.println("User 2 WINS!");

        }else if (choice1>choice2){
            System.out.println("User 1 WINS!");
        }else if (choice1==choice2){
            System.out.println("WTF!");
        }
    }
}
