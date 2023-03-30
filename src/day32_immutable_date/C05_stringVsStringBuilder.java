package day32_immutable_date;

import java.time.LocalTime;

public class C05_stringVsStringBuilder {

    public static void main(String[] args) {

       /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun için bir String olusturup, 1000 kere sonuna (.) ekleyelim,
        oncesinde ve sonrasinda zamani alip aradaki farki bulalım.
        Ayni islemi StringBuilder icin de yapalim.
         */

        LocalTime baslangic =LocalTime.now();
        String str = "Ahhhh Java";
        for (int i = 0; i < 10000; i++) {
            str+=".";
        }

        LocalTime bitis =LocalTime.now();

        System.out.println("String baslangic = " + baslangic);//String baslangic = 01:52:28.738832200
        System.out.println("String bitis = " + bitis);//String bitis = 01:52:28.794474400


        System.out.println("String zaman : "+(bitis.getNano() - baslangic.getNano()));//String zaman : 55642200



        baslangic =LocalTime.now();
        StringBuilder sb = new StringBuilder("Ahhhh Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(".");
        }

        bitis = LocalTime.now();

        System.out.println("baslangic = " + baslangic);//baslangic = 01:52:28.810496900
        System.out.println("bitis = " + bitis);//bitis = 01:52:28.811493500

        System.out.println("StringBuilder zaman : "+(bitis.getNano() - baslangic.getNano()));//StringBuilder zaman : 996600
    }
}
