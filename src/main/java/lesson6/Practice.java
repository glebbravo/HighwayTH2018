package lesson6;

public class Practice {
    public static void main(String[] args) {
        int ar[] = {1, 2, 84, -2, 1111};
        int max = ar[0];
        int min = ar[0];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 84;
        ar[3] = -2;
        ar[4] = 1111;
        for ( int i : ar) {
            if (i>max)
                max = i;
            if (i<min)
                min = i;

            }
                System.out.println("min number: " +min);
                System.out.println("max number: " +max);


        }
    }

