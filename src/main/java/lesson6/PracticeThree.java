package lesson6;

public class PracticeThree {
    public static void main(String[] args) {
        int ar[] = {1, 2, 84, 45, 111, 97};
         ar[0] = 1;
         ar[1] = 2;
         ar[2] = 84;
         ar[3] = 45;
         ar[4] = 111;
         ar[5] = 97;
        int max = ar[0];
        for ( int i : ar){
            if (ar[0]>ar[1]){
                System.out.println(ar[1]);
            }
            if (ar[1]>ar[2]){
                System.out.println(ar[2]);
            }
            if (ar[2]>ar[3]){
                System.out.println(ar[3]);
            }
            if (ar[3]>ar[4]){
                System.out.println(ar[4]);
            }
            if (ar[4]>ar[5]){
                System.out.println(ar[5]);
            }


        }
    }
}
