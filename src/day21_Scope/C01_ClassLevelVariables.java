package day21_Scope;

public class C01_ClassLevelVariables {
    int İnstSayı=20;//Static olmayıp class level da olduğu için instance variabledir.
    public static void main(String[] args) {

        /*
        class içeerisinde her yerden kullanmak istediğiniz variableleri
        class level da (Class içinde ama methodların dısında)
        genellikle class level variableler class  ın basında olusturulur(sart değil)

        class level daki variableler için 2 scope vardır
        1-static variables(Class variableleri de denir)
        2-instance (static olmayan) variables (obje variable'i da denir)
         */
    int sayı=10;
        //System.out.println(İnstSayı);
        /*
        instance variables static olmadığı için static klupe uye main method dan direkt kullanamayız
        instance variablelerin diğer adı object variabledır
        dolayısıyla  obje oluşturursanız instance variableleri her yerden kullanabilirsiniz
         */

        C01_ClassLevelVariables obje1=new C01_ClassLevelVariables();
        System.out.println("OBJE1 DEĞİŞMEDEN ÖNCE : "+obje1.İnstSayı);
        obje1.İnstSayı=30;
        System.out.println("obje1 değiştikten sonra : "+obje1.İnstSayı);

        C01_ClassLevelVariables obje2=new C01_ClassLevelVariables();
        System.out.println("obje2 değişmeden önce : "+obje2.İnstSayı);
        obje2.İnstSayı=25;
        System.out.println("obje2 değiştikten sonra : "+obje2.İnstSayı);

        C01_ClassLevelVariables obje3=new C01_ClassLevelVariables();
        System.out.println("obje3 değişmeden önce : "+obje3.İnstSayı);
        /*
        her obje olustuğunda instance (obje) variable ının ilk atanan değerini alır
         */



    }
    public static void staticMethod(){
        //System.out.println(sayı);

        /*
        bir method un içerisinde oluşturulan variable
        sadece method içinden kullanılabilir
        (Local variables)
         */
        /*
        İnstSayı=30;
        instance variable'lara main method dısındaki static methodlardan da
        direk ulaşamayız
        obje olusturursak ulaşabiliriz.
         */
        C01_ClassLevelVariables obje4=new C01_ClassLevelVariables();
        System.out.println(obje4.İnstSayı);


    }
    public void staticolmayanMethod(){
        System.out.println(İnstSayı);

        /*
        instance variableler class içersindeki
        static olmayan methodlardan direekt kullanılabilirler
         */

    }
}
