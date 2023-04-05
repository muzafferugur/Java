package day43_Abstract_Interface;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parentı olan tum classlardaki abstract methodları
    concrete hale donusturmek(override etmek) zorundadır.

    bu kuralın istisnası
    parent classlardan herhangi birinde
    concrete hale donusturulmus,abstract methodlardır.
     */
    public static void main(String[] args) {

        HA160 arb1=new HA160();
        //concrete bir classdan istediğimiz bir objeyi üretebiliriz
        FMercedes arb2 = new FMercedes();
        //Mercedes'de concrete

        /*
        Abstract class'lar constructor barındırır ama obje uretemezler.
        EToyota arb3 = new EToyota(); -->

        Toyota class'i abstract class oldugundan obje uretilemez.
         */

        EToyota arb4=new GCorolla();

        /*
        List<String> list1 = new List<String>();
        List<String> list2 = new ArrayList<String>();
        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedimiz abstract class constructor'i ise child'i olan
        concrete bir class'tan seceriz.
         */






    }

}
