package lesson6;

public class IncrementExample {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a" + a++);
        System.out.println("After post-increment a " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment a " + a);
    }
}
