package homework4;

public class Task4 {
    public static void main(String[] args) {
        String str1 = new String("Глеб");
        String str2 = new String("гЛеБ");
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Вы тезки!");
        }else{
            System.out.println("Нет:(");
        }
    }
}