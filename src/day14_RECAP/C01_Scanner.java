package day14_RECAP;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*  Problem Tanımı
           Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
         a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
         Örnek Ekran Çıktısı
         a sayısını giriniz: 5
         b sayısını giriniz: 3
         c sayısını giriniz: 1
         sonuç : 5.333333333333333
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        double a1=scan.nextDouble();

        System.out.println("b sayısını giriniz");
        double b1=scan.nextDouble();

        System.out.println("c sayısını giriniz");
        double c1=scan.nextDouble();

        double sonuc=(a1*a1-b1*b1)/(3*c1);

        System.out.println("sonuc :"+sonuc);



    }
}
