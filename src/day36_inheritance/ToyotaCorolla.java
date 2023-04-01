package day36_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        Child classtan parrent class a erişimde
        access modifier kurallarını çiğneyemeyiz

        örneğin parent class daki private class üyelerini child classdan
        kullanamayız.Aynı sekilde parent ve child farklı packagelarda ise
        parent classdaki default access modifier i olan
        class üyelerini child classdan kullanamayız
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.model);//model belirtilmedi
    }
}
