package lesson4.Loops.Conditions;

import java.util.Scanner;

public class SwitchConsolExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi Gleb!");
            System.out.println("1 - print Hulk");
            System.out.println("2 - print Kakawka");
            System.out.println("3 - print Putin");
            System.out.println("Select number: ");

            int choice = sc.nextInt();
            switch (choice){
                case 1 : System.out.println("Vodka"); break;
                case 2 : System.out.println("blahblahblah"); break;
                case 3 : System.out.println("AAAAAAAASAUENIAAAAAA"); break;
                case 4 : System.out.println("PUMP IT UP!"); break;
            }



            System.out.println(choice);
        }
    }


