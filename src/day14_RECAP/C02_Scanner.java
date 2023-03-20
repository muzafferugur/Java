package day14_RECAP;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
      Örnek Ekran Çıktısı
       Bir işçi işi kaç günde bitirmektedir? 10
      Toplam kaç işçi çalışacak? 2
      İşin bitme süresi 5 gündür.
        */

        Scanner scan=new Scanner(System.in);
        double isSuresi=10;
        System.out.println("lütfen işçi sayısını giriniz");
        double isci=scan.nextDouble();

        double isToplamBİtmeSursi=10/isci;

        System.out.println("toplam işin bitme süresi :" + isToplamBİtmeSursi+" gün");

        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir isci isi kac günde bitirmektedir :");
        double birİsciBitirmeSüresi = scan.nextDouble();

        System.out.print("Toplam kac isci calıstıracaksınız :");
        double isci_Sayisi = scan.nextDouble();

        double cokluBitirmeSüresi = birİsciBitirmeSüresi/isci_Sayisi;

        System.out.print("cokluBitirmeSüresi = " + cokluBitirmeSüresi);

         */

    }
}
