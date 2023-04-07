package day46_Iterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class C03_ListIteratörHocaÇözmedigisoru5 {
    public static void main(String[] args) {
        /*
       (literatör ile index kullanımına örnek) bir listdeki ilk n elemanı iteratör kullanarak 5 artırın
        örn:
        list:[2,13,56,23,45,14,40]
        artırılması istenen eleman sayısı 3
        output:[7,18,61,23,45,14,40]
         */
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println("liste ilk hali : "+liste);//[2, 13, 56, 23, 45, 14, 40]
        Integer value;
        int n = 3;
        ListIterator list1= liste.listIterator();
        while (n > 0 && list1.hasNext()) {
            value =(Integer) list1.next();
            list1.remove();
            list1.add(value + 5);
            n--;
        }

        System.out.println("liste ilk 3 elamanına +5 hali : "+liste);//[7, 18, 61, 23, 45, 14, 40]
    }

    /*
    öncelikle List sınıfından bir liste oluşturuluyor ve elemanlar ekleniyor. Daha sonra n değişkeni ile
    kaç elemanın artırılacağı belirtiliyor ve ListIterator sınıfından bir (LİST1)iteratör oluşturuluyor.

    Daha sonra, while döngüsü ile listenin ilk n elemanı üzerinde geziniliyor ve her eleman 5 artırılıyor.
    İteratör üzerindeki elemanlar silinip, yerlerine artırılmış elemanlar ekleniyor.

    Son olarak, listenin tüm elemanları ekrana yazdırılıyor.
    Bu şekilde, listenin ilk n elemanı 5 artırılmış olarak elde edilmiş oluyor.
     */
}
