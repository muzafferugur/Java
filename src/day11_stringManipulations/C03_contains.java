package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*
        kullanıcıdan mail adresi girmesini isteyin
        -mail @gmail.com içermiyorsa "lutfen gmail adresi giriniz",
        -mail @gmail.com içeriyorsa "Email adresiniz kaydedildi",
        -@gmail.com ile bitmiyorsa "lütfen yazımı kontrol edin" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Email adresinizi yazınız");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {

            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }


    }
}
