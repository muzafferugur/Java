package day37_InheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{

    HCorolla() {
        System.out.println("HCorolla parametresiz constructor");
    }

    HCorolla(String isim) {
        //super(); --> aşagıda super(isim); atadığımız için java bunu siler
        super(isim);//-->parent yani GToyotadaki parametreli cons. a gider
        System.out.println("HCorolla parametreli constructor");
    }
}

