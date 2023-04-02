package day37_InheritancedaConstructorKullanimi;

public class GToyota {


    GToyota() {
    System.out.println("GToyota parametresiz constructor");
}

    GToyota(String isim) {

        //super(isim); extends olmadigi icin super constructor call'a java kabul etmez.
        //aşagıdaki sout parametrelide önce calısır
        System.out.println("GToyota parametreli constructor");
    }


}

