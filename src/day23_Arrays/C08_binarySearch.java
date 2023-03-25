package day23_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search java da eleman aramanın kısa yoludur
        Ancak binary search un calısması için öncelikle
        array'in sıralı hale getirilmesi gerekir
        Eğer sıralama yapmadan binarySearch yaparsanız
        sonucu bulamayabilir veya yanlış bulur
         */

        String[] harfler={"Y", "G", "B", "D", "O", "A"};

        String arananHarf = "A";

        Arrays.binarySearch(harfler,arananHarf);

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));//true

        //binarySerach bize aradığımız elemanın indexini döndürür
        //Array sıralı olmadığı için arama sonucunu doğru bulamayabilir
        //emin olmak için önce sort yapmalıyız
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//[A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//0

    }
}
