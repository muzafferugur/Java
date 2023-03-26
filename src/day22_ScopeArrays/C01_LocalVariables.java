package day22_ScopeArrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
    int sayı=10;
        //System.out.println(sayıMethod); //sayıMethod method1 de oluşturulmuş local variabledir.


        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
        //System.out.println(i); i loop da olusuturulmuş local variabledir.
        //sadece loop içerisinde kullanılabilir


        //static int sayıStatic=20; static keyword sadece class levelda kullanılabilir
        //methodların içersinde static variable TANIMLANAMAZ.


    }
    public  static void method1(){

        //System.out.println(sayı); sayı main method da oluşturulmuş
        //local variabledir ve sadece main method da geçerlidir

        int sayıMethod=20;
    }
}
