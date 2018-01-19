package homework6;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = {5, 512, 121, 24, 52, 3, 3, 3, 5, 86, 334, 152, 21, 3, 64, 77, 5};
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        for (int x : arr) {
            if (x == min)
                System.out.println("The MIN number is: " + min);
        }
    }
}
