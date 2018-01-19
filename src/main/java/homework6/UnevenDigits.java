package homework6;

public class UnevenDigits {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while (n <= 99){
            count++;
            n = n+2;
            if (n==23){
                break;
            }
        }
        int[] arr = new int[count];
        int number = 1;
        for (int i=0; i < arr.length; i++){
            arr[i] = number;
            System.out.print(arr[i] + ", ");
            number = number +2;
        }
    }
}
