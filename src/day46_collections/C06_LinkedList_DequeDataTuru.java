package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");//iki tane selim var-->birden fazla varsa son kullanılanı sil
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop()); // Cavidan

        //queue de eklenen sona eklenir silinen baştan silinir bunda bastan ve sondan ekleme ve silme methodları var
        //bastakini getir sondakini getir.
    }
}
