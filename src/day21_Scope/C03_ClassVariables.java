package day21_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {

        /*
        Farklı bir class da calısırken
        herhangi bir class adını yazıp . ya basarsak
        adını yazdığımız classdaki tüm STATIC class uyelerini
        görebilir ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayı);//10
        System.out.println(C02_StaticVariables.değersizStaticVar);//
        /*
        Class leevel variablelere değer atayıp atamamak bize kalmıştır
        istersek değer ataması yaparız, istemezsek değer atamayız

        Eğer değer atamışsak Java atadığımız o değeri kabul eder
        değer atamazsak Java bu variablelara default bir değer ataması yapar
        int --> 0
        string-->null
        boolean-->false
        char-->""(hiçlik)
         */

        /*
        baska class daki instance variablelere obje oluşturarak ulaşabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu method içinde staticSayı=20 oldu
        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.değersizInstanceVariable);//0

    }
}
