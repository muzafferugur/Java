package day48_Maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        /*
        SADECE KEY-VALUE'LERDEN OLUŞUR.
        Aynı bilgilere aynı formatta sahip olması lazım
        map in yapısı dataları karıştırıp kurcalayıp ona ulaşmak üzere yapılmıştır.
         */

        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());// [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]-->Collections olarak getiriyo
        System.out.println(sinifList.size());//4-->4 anahtar var uzunluğu 4 string var

        //Tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueCall =sinifList.values();//valuleri collection olarak döndürüyor


        String[] eachArr;
        int sira=1;
        for (String each:tumValueCall) {
            /*
             buradaki each bize her bir ogrenciye ait ayni yapidaki
             isim, soyisim, brans bilgilerini icren String'ler getiriyor.
             */
            //Stringi parçalamamız gerrekiyor split methoduyla
            eachArr=each.split(", ");
            System.out.println(sira+"- "+eachArr[0]+" "+ eachArr[1]);//eachArr[0]-->isim indexi,eachArr[1]-->soyisim indexi
            sira++;
        }
        /*
        Map'de bulunnan ogrencilerin, isim ve soyisimlerin birlestirerek bir
        sinif listesi olusturun.
         */

        List<String> sinifIsimSoyisimListe=new ArrayList<>();
        //oop konseptin en önemli özelliği kodları bir kere yaz istediğin zaman ulaş

        for (String each:sinifIsimSoyisimListe
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimListe.add(eachArr[0]+" "+eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimListe);



    }
}
