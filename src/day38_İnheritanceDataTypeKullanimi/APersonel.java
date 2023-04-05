package day38_İnheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim="İsim belirtilmedi";
    protected String soyisim="Soyisim belirtilmedi";
    protected String departmant="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tüm personelimiz maas alır");
    }
    protected void sigorta(){
        System.out.println("Tüm personelimize sigorta yapılır");
    }
}
