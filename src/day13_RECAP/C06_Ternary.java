package day13_RECAP;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin.
         * fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" ,
         * 10 ile 20 arasinda ise "normal" ,
         * 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen fiyat giriniz");

        double fiyat=scan.nextDouble();

        if (fiyat<0){
            System.out.println("lutfen gecerli aralıkta fiyat giriniz");

        }else if (fiyat<10){
            System.out.println("ucuz");

        } else if (fiyat<20){
            System.out.println("normal");

        }else {
            System.out.println("pahalı");
        }

        /*
        if (fiyat < 10) {
            System.out.println("Ucuz");
        } else if (fiyat < 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Pahali");
        }

        String result = (fiyat < 10) ? "ucuz" : (fiyat < 20) ? "normal" : "pahali";
        System.out.println("result = " + result);

         */

    }
}
