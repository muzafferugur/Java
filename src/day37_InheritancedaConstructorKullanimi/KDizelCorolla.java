package day37_InheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla() {
        System.out.println(" KDizelCorolla parametresiz constructor");
    }

    KDizelCorolla(String isim) {
        //super(); --> aşagıda super(isim); atadığımız için java bunu siler
        super(isim);//-->parent yani HCorolladaki parametreli cons. a gider
        System.out.println("KDizelCorolla parametreli constructor");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1 = new KDizelCorolla("hasan");
        /*
        parametereli yazdırınca|
        GToyota parametreli constructor
        HCorolla parametreli constructor
        KDizelCorolla parametreli constructor
         */


        /*
        parametresiz yazdırınca;
        GToyota parametresiz constructor
        HCorolla parametresiz constructor
        KDizelCorolla parametresiz constructor

         */
    }

}
