package homework8;

import java.util.ArrayList;

public class SymbolsAndIndex {
    public static void main(String[] args) {
        int i;
        int count = 0;
        ArrayList<Integer> co = new ArrayList<Integer>();
        String str = "“aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs  a a  sdfsdf sdf”";
        for ( i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                co.add(i);
                count++;
            }
        }
        System.out.println("А встречается "+count+" раз");
        System.out.print("На следующих позициях в строке: "+co);


    }

}
