package lesson4.Loops.Conditions;

import java.util.Scanner;

public class TaskLesson {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi Gleb!");
            System.out.println("1 - ПН");
            System.out.println("2 - ВТ");
            System.out.println("3 - СР");
            System.out.println("4 - ЧТ");
            System.out.println("5 - ПТ");
            System.out.println("6 - СБ");
            System.out.println("7 - ВС");
            System.out.println("Select number: ");

            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Monday"); break;
                case 2 : System.out.println("Tuesday"); break;
                case 3 : System.out.println("Wednesday"); break;
                case 4 : System.out.println("Thursday"); break;
                case 5 : System.out.println("Friday"); break;
                case 6 : System.out.println("Saturday"); break;
                case 7 : System.out.println("Sunday"); break;
            }



            System.out.println(choice);
        }
    }



