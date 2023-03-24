package day20_while_dowhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        /*
             Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
              islemi bitirmek icin 0’a basmasini soyleyin.
             Kullanici yanlislikla negative sayi girerse o
             sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
             Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
             yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
             toplaminin kac oldugunu yazdirin.
               */

        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int pozSayıAdedi=0;
        int negSayıAdedi=0;
        int pozSayılarTop=0;

        do {
            System.out.println("lutfen toplamak uzere poz. tam sayı giriniz");
            sayı= scan.nextInt();
            if (sayı>0){
                pozSayılarTop+=sayı;
                pozSayıAdedi++;
            } else if (sayı<0) {
                negSayıAdedi++;
                System.out.println("negatif sayı giremezsiniz");

            }
        }while (sayı!=0);
        System.out.println(pozSayıAdedi+" adet poz. sayı girdiniz :"+pozSayılarTop);
        System.out.println(negSayıAdedi + " adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");

    }
}
