package day42_Exception;

public class A {



    /*
    Bir variable final olarak tanimlandiysa baska class'lardan veya icinde oldugumuz
    class'dan bu variable'a baska deger atanmasi mumkun degildir.
    Madem ki egeri degistirilemiyor genelde static'de yaparak bu variable'a erisim
    kolaylastirilabilir.

    ve genelde static final olarak belirlenen variable isimleri buyuk HARFLE yazilir.
     */

    String isim="Cuneyt";
    static final String OKUL="Yildiz Koleji";

    final void finalMethodd(){

        System.out.println("Final method'lar override edilemez");
        /*
        bir method'u final olarak isaretlerseniz bu method degistirilemez demektir.
        (override edilemez)
         */

    }
}
