package day19_ForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere sayilar alın
        sayılarin toplami 500'ü gecince (500 dahil)
        sayilarin toplamını ve kaç sayı toplandığını
        şu şekilde yazdirin
        13 sayi girdiniz ve toplamlari 567
         */

        int toplam=0;
        int sayı=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);

        while(toplam<500){
            System.out.println("lutfen toplamak için sayı girin");
            sayı= scan.nextInt();
            toplam+=sayı;
            sayac++;
        }
        System.out.println(sayac+"sayı girdiniz ve toplamları :"+toplam);
    }
}
