package day47_collectionsQDS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Set (Küme)-->elemanları uniquedir.Tekrarsız olsun diye setten yaptık soruyu
        java elemanları unique yapmak için hash algoritması kullanır
         */

        /*
        Verilen bir array'deki tekrar eden elementleri silip tekrarsiz
        halini array'e atayan kod yaziniz.
         */
        int arr[] = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        //var olan array e eleman atanamaz o yuzden sıfırdan array oluşturduk

        Set<Integer> tekrarsızSet=new HashSet<>();//hızlı olsun diye hash kullanalım
        //SIRALAMAYA İHTİYACIM OLMADIĞI İÇİN FOREACH KULLANDIM-ARRAYDEN ALIP SET E ATICAM
        //FORLOOP da sürekli kontrol etme ihtiyacı duyuyoruz(if yapısıyla) o yuzden kullanmadık-

        for (int each:arr
             ) {
            tekrarsızSet.add(each);//her bir elementi alıp sete attım tekrarlardan kurtuldum
        }

        System.out.println("set : "+tekrarsızSet);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsızArr=new int[tekrarsızSet.size()];//array in uzunluğu--> dinamik olsun diye .size() aldık
        //set olarak kalsın istemediğimiz için yeni bir array oluşturup ona attık

        System.out.println(Arrays.toString(tekrarsızArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]-->bunu görmek istemiyorum
        //arraye atayabilmek için forloop olmaz array index ister.
        //forLoop dersek setten alamayız set de index yapısı yok.
        //foreach loopumuzu indexli hale getirelim

        int i=0;// indexi kendimiz oluşturuyoruz.bununla arraye atama yapıcaz

        for (Integer each:tekrarsızSet
             ) {
                tekrarsızArr[i]=each;
                i++;
        }

        System.out.println(Arrays.toString(tekrarsızArr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]-->hala işimiz bitmedi şuan tekrarsızArr üzerinden işlem yapıyoruz
        //tekrar kendi Arr mize dönelim

        arr=tekrarsızArr;//-->kendi arrayimize dönmüş olduk
        System.out.println("bizim array in son hali :"+Arrays.toString(arr));
    }
}
