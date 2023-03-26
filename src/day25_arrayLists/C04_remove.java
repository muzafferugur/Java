package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<String>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove methodu 2 şekilde kullanılor
        1-objeyi yazıp silmesini istersek bize boolean sonuc doner.true/false
        2-index girersek o index'deki elemanı siler ve bize silinen elemanı dondurur.
         */
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));//true
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby"));//false
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]


    }
}
