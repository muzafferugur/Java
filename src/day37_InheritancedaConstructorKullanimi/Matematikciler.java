package day37_InheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler(){
        //burada da parametresiz default super(); var(extends var  bu classda)
        //buradan LOgretmen in parametresiz constructor üne gideriz
        System.out.println("Matematikciler parametresiz constructor");
    }

    Matematikciler(String isim){
        this();//-->bu classdaki parametresiz cons a gider yani yukarıdaki Matematikçiler() çalısır
        System.out.println("Matematikciler parametreli constructor");
    }

    public static void main(String[] args) {

        Matematikciler obj1 = new Matematikciler("Tugba");
        /*
        parametreli yazdırınca;
        LOgretmen parametresiz constructor
        Matematikciler parametresiz constructor
        Matematikciler parametreli constructor

         */
        /*
        this() içinde bulunan consları
        super() parent daki consları çağırır

        this() veya super() parametre yapısına uygun cons bulamazsa
        Java CTE verir

        constructor konusunda gördüğümüz "this." o class daki instance variableleri refere eder

        "super." parent classdaki instance variableleri refere eder
         */
    }

}
