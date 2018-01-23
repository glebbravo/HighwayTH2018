package lesson8;

public class StringExample {
    public static void main(String[] args) {
        String myString = "JACK";
        myString.concat(" SPARROW");// JACK + SPARROW
        System.out.println(myString);//JACK
        myString = myString.concat(" SPARROW");//myString = "JACK"+"SPARROW"
        //метод concat озвращает новую строку - не изменяет
        System.out.println(myString);//JACK SPARROW
    }
}
