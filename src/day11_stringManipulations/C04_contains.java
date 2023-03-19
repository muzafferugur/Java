package day11_stringManipulations;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Soru2:kullanıcıdan bir cümle isteyin
        cümle "büyük" kelimesi içeriyorsa tum cumleyi buyuk harf olarak
        kucuk kelimesi içeriyorsa tum cumleyi kucuk harf olarak yazdırın,
        iki kelimeyi de içermiyorsa "cümle büyük yada kucuk kelimesi içermiyor" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle= scan.nextLine();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else {
            System.out.println("cümle büyük yada kucuk kelimesi içermiyor");
        }

    }
}
