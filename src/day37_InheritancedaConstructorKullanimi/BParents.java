package day37_InheritancedaConstructorKullanimi;

public class BParents extends AGrandParents {
    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent klubü";

    BParents(){
        System.out.println("Parent constructor calisti.");
    }
}
