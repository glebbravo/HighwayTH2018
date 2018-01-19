package lesson2;

import java.sql.Timestamp;
//Показывает время, которое одинаковое везде
public class TimestampExample {
    public static void main(String[] args) {
        java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        System.out.println((timestamp.getTime()));
    }


}
