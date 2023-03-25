package day22_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        //iki şekilde array oluşturabiliriz
        int sayılar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayılar array uzunluğu :"+sayılar.length);//3
        //String length() methodunda parantez var,array de yok
        System.out.println("harfler arrayinin uzunluğu :"+harfler.length);//4
        System.out.println(Arrays.toString(harfler));//[null, null, null, null]


        //harfler arrayinin son elementini yazdıralım
        System.out.println(harfler[harfler.length-1]);//null

       // System.out.println(harfler[5]);//.ArrayIndexOutOfBoundsException
        //Array RunTime da oluşturulur dolayısıyla böyle bir durumda Syntax hatası vermez

    }
}
