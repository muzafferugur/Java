package day26_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ıstenmeyenleriSil {
    public static void main(String[] args) {
        /*
        Soru 4-) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
                 kalan elementleri yeni bir array yapin
         */

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }

        }
        //loop bittiğinde istenmeyen harf içermeyen sehirler,listeye eklenmiş olacak
        System.out.println(kalanlar);

        //yeni array oluşturup,listeyi ona aktaralım
        String[] kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i]= kalanlar.get(i);


        }
        //sehirler arrayinin yeni değerini atayalım
        sehirler=kalanlarArrayi;

        System.out.println("sehirler arrayinin son hali :" + Arrays.toString(sehirler));
    }
}
