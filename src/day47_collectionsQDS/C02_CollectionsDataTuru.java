package day47_collectionsQDS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <DataTuru>'nu Object secmeniz durumunda Collection'a farkli
        data turlerinden objeler koymamiza izin verir.

        Bu depolama acisindan bize esneklik saglar.

        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan cok fazla
        casting yapmamiz gerekebilir.
         */

        List<String> liste=new ArrayList<>();
        //liste.add(5); Liste stringlerden oluştuğu için int,char,boolean ekleyemeyiz
        //liste.add(true);
        //liste.add('s');
        //liste.add("Ali");

        List<Object> list = new ArrayList();//collections ın özelliği <Object> yazınca farklı data türlerini barındırabilir
        list.add(5);
        list.add(true);
        list.add('s');
        list.add("Ali");
        //problem olarak sürekli casting yapması
        System.out.println(list); // [5, true, s, Ali]

        list.set(0,(Integer)list.get(0)+5);//object yapısına direkt kafana göre 5 ekleyemezsin o yüüzden parantez içinde(Integer) yazdık.Casting yaptık
        // sıfırıncı indexe 5 ekledik
        System.out.println(list);//[10, true, s, Ali]

        list.set(3,list.get(3)+"Can");//[10, true, s, AliCan]
        //list.set(2,!(Boolean)list.get(2));-->Exception fırlatıyor
        System.out.println(list);

        Set<Object> set1 = new HashSet<Object>();
        set1.add(5);
        set1.add(true);
        set1.add('5');


    }
}
