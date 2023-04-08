package day49_Maps;

import day48_Maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrarı {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);


        //ogrenci listesini isim soyisim olarak yazdirin


        ReusableMethods.tumValueSiraaliYazdir(sinifListMap);


        //Kac farkli brans varsa bransIsmi = branstakiOgrencisoyisi seklinde yazdirin

        ReusableMethods.bransOgrencisoyisiYazdir(sinifListMap);

    }
}
