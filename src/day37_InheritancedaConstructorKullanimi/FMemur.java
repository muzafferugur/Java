package day37_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {

    /*
    Extends keyword kullanilan class'larda ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim

    Java constructor'in ilk satirina
    super(); constructor call yazar.

    super(); constructor call default constructor'a benzer
    gorunmese de orada vardir ve calisir ancak biz ilk satira farkli bir constructor
    call yazarsak Java super(); constructor'i siler.

    Eger biz mudahele edip kendi constructor call'umuzu ulusturmazsak java'nın
    default olarak olusturdugu constructor call her zaman parametresizdir.
    super();
     */


    FMemur() {
        //super();Emuhasebe Psiz cons a gönderir
        System.out.println("Memur parametresiz constructor");
    }

    FMemur(String isim) {
        //burada da parametresiz default super(); var buradan Emuhasebe nin parametresiz
        //constructor ü ne gideriz geriye kalan sistem aynı şekilde çalışmaya devam eder
        System.out.println("Memmur parametreli constructor");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();
        /*
        çalısınca yazdırılan|
        Personel parametresiz constructor
        Muhasebe parametresiz constructor
        Memur parametresiz constructor

         */

        FMemur mm2=new FMemur("ali");
        /*
        çalısınca yazdırılan|
        Personel parametresiz constructor
        Muhasebe parametresiz constructor
        -Memmur parametreli constructor-parametre atadığımız için
        ilk parametreli Fmemura gider ve
        en son bu yazdırılır
         */

    }
}
