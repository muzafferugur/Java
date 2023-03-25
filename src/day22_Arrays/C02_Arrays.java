package day22_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayılar []=new int[3];
        System.out.println(sayılar);//[I@19dfb72a
        //non-primitive data türündeki dataları
        //her zaman direkt yazdırmayabilir
        //Array i yazdırmak istersek Arrays classından yardım isteriz

        System.out.println(Arrays.toString(sayılar));//[0, 0, 0]


        sayılar[2]=10;
        sayılar[0]=5;
        sayılar[1]=3;
        System.out.println(sayılar);//[I@19dfb72a
        System.out.println(Arrays.toString(sayılar));

        String sınıfList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sınıfList));//[Ali, Ayse, Ahmet]
        sınıfList[1]="Hasan";
        System.out.println(Arrays.toString(sınıfList));//[Ali, Hasan, Ahmet]

    }
}
