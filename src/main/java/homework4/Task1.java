package homework4;

public class Task1 {
    public static void main(String[] args) {
        int ar[] = {4, 2, 9, 7, 9};
        int min = ar[0];
            for (int i : ar){
                if (i<min)
                    min = i;
            }
        System.out.println("min number: " +min);
            }

    }

