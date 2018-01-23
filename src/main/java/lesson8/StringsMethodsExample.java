package lesson8;

public class StringsMethodsExample {
    public static void main(String[] args) {
        String stringNames = "Gleb, Bla, New, Piuskja, Kkuyky";
        String[] stringArrays = stringNames.split(", ");
        for(String name : stringArrays){
            System.out.println(name);
        }
    }
}
