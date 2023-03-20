package day13_RECAP;

import java.util.Scanner;

public class C08_YolHızZaman {
    public static void main(String[] args) {

         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi giriniz");
        int mesafe=scan.nextInt();

        System.out.println("lutfen hızı giriniz");
        int hız=scan.nextInt();

        double sure=(mesafe/hız);

        System.out.print("Sure :"+sure);
    }
}
