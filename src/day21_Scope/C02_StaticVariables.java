package day21_Scope;

public class C02_StaticVariables {

    static int staticSayı=10;

    public static void main(String[] args) {
        /*
        bir variable static oluşturulduysa
        objeler için değil class için geçerlidir
         */
        System.out.println(staticSayı);
        staticSayı



    }

    public static void staticMethod(){

    }

    public void staticOlmayanMethod(){


    }

}
