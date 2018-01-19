package lesson2;
//Классы оболочки
public class WrapperClassExample {
    public static void main(String[] args) {


        Integer i = new Integer(100);
        Character c = new Character('c');
        Boolean b = new Boolean(true);

        int xInt;
        Float x = new Float("3.7761");
        xInt = x.intValue();
    }
}