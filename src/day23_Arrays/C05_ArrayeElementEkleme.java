package day23_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */

        String[] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String [] yeniSinifList=new String[sinifListesi.length+1];// [null,null]

       //eski listeden 1 eleman fazla uzunlukta yeni array olusturdum
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifList[i]=sinifListesi[i];
        }
        //oncelikle eski listedeki tum elemanları,yeni listeye ekledim
        yeniSinifList[yeniSinifList.length-1]=eklenecekIsim;
        //son indexe ise eklenecek ismi atadım

        return yeniSinifList;
    }
}
