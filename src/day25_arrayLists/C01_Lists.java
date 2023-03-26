package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayılar1=new ArrayList<>();
        sayılar1.add(5);
        sayılar1.add(3);
        sayılar1.add(2);

        System.out.println("Listenin boyutu :"+sayılar1.size());
        sayılar1.add(2);
        sayılar1.addAll(sayılar1);
        System.out.println(sayılar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu :"+sayılar1.size());

        sayılar1.set(2,8);
        System.out.println(sayılar1);//[5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayılar1.set(0,12));//5
        System.out.println(sayılar1);//[12, 3, 8, 2, 5, 3, 2, 2]

        /*
        set methodu istenen index deki eski elementi silip yerine verdiğimiz
        yeni elementi set eder.

        eğer eski elementi silmek istemiyorsak
        add(index,değer) methodunu kullanabiliriz.

        set() methodu sildiği eski elementi de bize döndürür
         */

    }
}
