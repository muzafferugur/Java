package day37_InheritancedaConstructorKullanimi;

public class AGrandParents {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class da görünmese bile bir constructor vardır
    Bu classdan obje olusturmak istediğimizde
    default constructor devreye girecektir.

    Default constructor u gözlemleyemeyeceğimiz için
    onun yerine kullanılabilecek parametresiz constructor olusturalım
     */

    protected String grandpaKlupAdi="Grandpa klubü";
    AGrandParents (){
        System.out.println("Grandpa constructor calıstı");
    }
}
