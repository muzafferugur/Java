package day13_RECAP;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve
         * son iki basamagindaki rakamlari toplamini bulunuz
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamaklı bir sayı giriniz");
        int sayı=scan.nextInt();

        int ilkIki = sayı / 1000;
        int sonıki = sayı % 100; // 100' e bolumunden kalani verir

        int ilkIkıTop = (ilkIki / 10) + (ilkIki % 10);
        System.out.println("ilkIkıTop = " + ilkIkıTop);

        int sonIkiTop = (sonıki / 10) + (sonıki % 10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("Sayilarin toplami :" + (ilkIkıTop + sonIkiTop));




    }
}
