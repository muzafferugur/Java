package day37_InheritancedaConstructorKullanimi;

public class DPersonel {

    DPersonel(){
        //burada super(); yok extends yoksa super(); yok demiştik
        //buraya kadar geldiğimiz için ilk alttaki sout çalısır
        System.out.println("Personel parametresiz constructor");
    }

    DPersonel(String isim){
        System.out.println("Personel parametreli constructor");
    }

    }

