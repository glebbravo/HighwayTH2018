package lesson2;

public class DataTypesCast {
    public static void main(String[] args) {
        int i = 50;
        long lo = i;
        short s = (short) lo;
        System.out.println(s);
        //Пример как узнать какому числу соответствует символ
        char ch = 'J';
        int intCh = (int) ch;
        System.out.println("J correspondents with " + intCh); //74 это UNICODE имвола J


        double b = 2.6;
        int c = (int) (0.5 + b);//можно применять к целым выражениям
        System.out.println(c);
        System.out.println((int) 9.69);

    }
}




