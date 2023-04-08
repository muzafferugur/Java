package day48_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {
      Map<Integer,String> ogrenciMap= ReusableMethods.mapOlustur();//gelen mapi bu class ın adamaı yapmamız için atama yapıyoruz

        System.out.println(ogrenciMap);

        /*Bu kadar şeyi kullanmamış olduk
         Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");

         */

        //value leri sıra numaralı olarak yazdır
        ReusableMethods.tumValueSıraliYazdır(ogrenciMap);

        //isim ve soyisimlerin birlikte olacağı bir liste oluştur
       List<String>sinifisimsoyisimlist= ReusableMethods.isimSoyisimListesiOluştur(ogrenciMap);//bu classın malı yapmak için yine atama yapıyoruzLİST ile
        System.out.println("isim soyisim listesi : "+sinifisimsoyisimlist);

        //kaç farklı brans varsa brans ismi:branstaki ogrencisayısı şeklinde yazdırın

    }
}
