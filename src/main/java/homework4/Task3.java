package homework4;

public class Task3 {
        public static void main(String[] args) {
            int ar[] = {4, 2, 9, 7, 9};
            int min = ar[0];
            int max = ar[0];
            for (int i : ar){
                if (i<min)
                    min = i;
                if (i>max)
                    max = i;


            }
            System.out.println("min number: " +min);
            System.out.println("max number: " +max);
        }

    }



