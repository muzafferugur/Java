package day13_RECAP;

import java.util.Scanner;

public class C10_NotHesaplama {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("vize1 notunuzu girin");
        int vize1=scan.nextInt();

        System.out.println("vize2 notunuzu girin");
        int vize2=scan.nextInt();

        System.out.println("final notunuzu giriniz");
        int finalNotu=scan.nextInt();

        double vizeOrt=(vize1+vize2)/2;

        double gecmeNotu=vizeOrt*0.3+finalNotu*0.7;
        System.out.println("geçme notunuz :"+gecmeNotu);


    }
}
