package lesson11;

import java.util.Scanner;

public class MultiplyCatchExample {
    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            m[a] = 4/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) { // перехват 1
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) { // перехват 2
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) { // перехват 3
            System.out.println("Произошло ещё какое-то исключение");
        }
    }
}
