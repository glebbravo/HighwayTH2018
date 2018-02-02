package lesson11;

public class ExceptionExample {
    public static void main(String[] args) {
        int a=4;
        try {
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println("Произошла недопустимая арифметическая операция:");
            System.out.println(e.getMessage());
        }
    }
}
