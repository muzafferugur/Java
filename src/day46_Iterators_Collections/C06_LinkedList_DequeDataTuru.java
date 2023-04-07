package day46_Iterators_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        /*
        DOUBLE ENDED QUEUE--iki tane sonu olan kuyruk--FİFO VE LİFO(Last in first out) özlliği var
        interfacedir.LinkList kullanarak obje oluşturabiliriz
        Deque null element kabul etmez
        ilk ve son eleman çok önemli olduğu için bunlara özel bir çok methodu barındırır.
         */

        Deque<String> ll4 = new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeFirstOccurrence("hasan");//f-->boolean döndürür
        System.out.println(ll4);
        ll4.removeLastOccurrence("Selim");//-->boolean döndürür//iki tane selim var-->birden fazla varsa son kullanılanı sil
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop()); // Cavidan-->ilk elemeti siliyo ve bize döndürüyor

        //queue de eklenen sona eklenir silinen baştan silinir bunda iki uçtan da ekleyebilirim iki uçtan da silebilirim
        //bastakini getir sondakini getir.
        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        //deque ikitaraflı queue demektir.
        //dolayısıyla her methodun first ve lastı var
    }
}
