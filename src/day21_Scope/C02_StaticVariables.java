package day21_Scope;

public class C02_StaticVariables {

    static int staticSayı=10;
    String isim="Mehmet";

    static int değersizStaticVar;
    int değersizInstanceVariable;

    /*
    Class level daki variable lara değer atamasak da java kabul ediyor
     */


    public static void main(String[] args) {
        /*
        bir variable static oluşturulduysa
        objeler için değil class için geçerlidir
         */
        System.out.println(staticSayı);//10
        staticMethod();
        staticSayı=12;
        System.out.println(staticSayı);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();



    }

    public static void staticMethod(){
        System.out.println(staticSayı);

    }

    public void staticOlmayanMethod(){
        /*
        static variable ler class içerisinden her yerden ulaşılabilir
        static olsun veya olmasın methodlar static variable leri görebiir ve değiştirebilir
        farklı methodlarda static variable in hangi değeri alacağını bilmek istiyorsak
        class ın basından itibaren kodun calısmasını takip etmeliyiz
        method ne zaman cağrılırsa o anki static variable değerini method da kullanabiliriz

         */
        System.out.println(staticSayı);
        staticSayı=20;


    }

}
