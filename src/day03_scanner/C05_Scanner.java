package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan 2 sayı bu sayıların çarpımı
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen ilk sayıyı giriniz");
        double sayı1=scan.nextDouble();

        System.out.println("lutfen 2. sayıyı giriniz");
        double sayı2=scan.nextDouble();

        System.out.println("girilen sayıların çarpımı :"+ sayı1*sayı2);


    }
}
