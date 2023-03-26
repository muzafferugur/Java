package day24_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        arrayi array yapan sembol [] idi
        arrayList de ise <> diamond kullanırız
         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);// []


        //bir list e eleman eklemek istersek
        isimler.add("basak");
        System.out.println(isimler.add("ayse"));//true döner


        /*
        string de bir method calıstırdığımızda
        assing yapmazsak String değişmiyordu

        String isim="Suleyman";
        isim.toUpperCase(); // SULEYMAN
        sout(isim)--> Suleyman
         */
        System.out.println(isimler);//[basak, ayse]

        /*
        List in tek kötü tarafı array in
        alt yapısını kullandığı için elemanları birer birer eklemek zorundayız
         */

    }
}
