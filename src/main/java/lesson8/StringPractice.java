package lesson8;

public class StringPractice {
    public static void main(String[] args) {
        int a = 5;
        String str = String.valueOf(a);
        System.out.println(str);
        int i = Integer.valueOf(str);
        System.out.println(str);

        double d = 1.2;
        String strd = String.valueOf(d);
        System.out.println(strd);
        double w = Double.valueOf(strd);
        System.out.println(strd);

        long l = 1212412;
        String strl = String.valueOf(l);
        System.out.println(strl);
        long p = Long.valueOf(strl);
        System.out.println(strl);

        boolean b = true;
        String strb = String.valueOf(b);
        System.out.println(strb);
        boolean v = Boolean.valueOf(String.valueOf(b));
        System.out.println(v);


    }
}
