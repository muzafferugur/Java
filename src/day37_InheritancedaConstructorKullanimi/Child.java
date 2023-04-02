package day37_InheritancedaConstructorKullanimi;

public class Child extends BParents{
    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child klubü";

    Child(){
        System.out.println("Child constructor çalıstı");
    }

    public static void main(String[] args) {
        AGrandParents gp1=new AGrandParents();
        //bu objeyi oluşturmak için Grandpa Cons. calısır
        //parent veya child cons calısmaz

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";


        //child1 objesii için Child const. calısır
        /*
        Javada bir class ı kullanabilmek için
        o class dan obje olusturur dolayısıyla o classın const. kullanırdık

        Java inth parent class lardaki özelllikleri kullanabilmek için
         o classların con. otomatik calsıtıran bir yapı kullanmaktadır

         örneğin biz child classında
         Child classından bir obje oluşturmak istediğimizde
         child cons. kulllanırız

         Java Child(){} gorduğunde once parentın const. çalıstırmam lazım der
         buradan parent cons a gider
         Parent classında Parent(){} gorunce
         once bunun parentının yani grandpa const. calısması gerekir der.


         */

    }

}
