package lesson6;

public class ArraysLoopExample {
    public static void main(String[] args) {
        int intArray[] = {1,2,3};
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
