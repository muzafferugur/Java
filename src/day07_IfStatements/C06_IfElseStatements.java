package day07_IfStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        /*
        kullanıcıya yasını sorun negatif değer girerse uyaralım
        eğer 65 ten kucuk ıse "emekli olamazsn, calısmalısın"
        65 e esit veya buyukse "emekli olabilirsin" yazdırın

        Not:birden fazla if-else if birbirine baglanmıssa
        son durum onemlidir.
        eğer else ile bitiyorsa butun ihtimaller kapsanıyor demektr
        ama else if ile bitiyorsa kapsanmayan durumlar olabılır

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasınızı gırınız");
        int yas=scan.nextInt();

        if (yas<0){
            System.out.println("lutfen geçerli bir yas giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsn "+(65-yas)+" yıl daha calısmalısın");
        }else {
            System.out.println("emekli olabilirsin");
        }
    }
}
