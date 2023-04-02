package day37_InheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe(){
        //super();Dpersonel Psiz cons a gönderir.
        System.out.println("Muhasebe parametresiz constructor");
    }

    EMuhasebe (String isim){
        System.out.println("Muhasebe parametreli constructor");
    }

}
