package day46_Iterators_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        /*
        Queue-ayırıcı özellik FİFO-->first in first out-eczaneler yemekhanelerbu sistemi kullanır
        Queue interfacedir ve constructor ı yoktur
        Queue den obje oluşturmak için hangi constructorları kullanabilirim-
        child classı olan
        --LinkedList,elemanları ekleme sırasına göre ekler
        --PriorityQueue,öncelik kuralı üretir ve buna göre dizer
         */
        Queue<String> ll3 = new LinkedList();

        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        /*
        Queue kuyruk demektir, sıra onemlidir.
        gelen sona gelir, giden bastan gider
         */
        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat")); // true


        Queue<String> ll4 = new LinkedList();
        //System.out.println(ll3.element()); // Zeynep-->başta kim var diye sorar getirir ama silmez-->boş listede exception fırlatır.
        System.out.println(ll3.peek()); //-->ilk elemanı silmeden return eder. Zeynep-->elementle aynı-->ama tek farkları liste boşsa-->null döner
        // --> System.out.println(ll.element()); // NoSuchElementException

        /*
        peek ve element silmeden ilk elementi bize dondurur.
        aralarindaki fark bos liste olursa peek null doner , element exception fırlatir.
         */

        ll3.offer("Ahmet");//-->eleman ekleme yapar listenin kapasitsine göre*listenin sonuna ekleme yapar yine--add ile aynı
        System.out.println(ll3); // [Zeynep, Kadir, Ahmet]

        System.out.println(ll3.poll()); // Zeynep-->ilk elementi getiriyor ama silip getirir
        System.out.println(ll3); // [Kadir, Ahmet]

        //System.out.println(ll4.remove());//-->throws exceptions- NoSuchElementException

        System.out.println(ll4.poll());//-->ilk elemanı siler ve return eder--null
    }
}
