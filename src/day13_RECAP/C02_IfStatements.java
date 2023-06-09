package day13_RECAP;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Y veya N ikilisinden birisini giriniz :");
        char karakter = scan.next().charAt(0);

        if ((karakter == 'Y') || (karakter == 'y')) {
            System.out.println("YES");
        } else if ((karakter == 'N') || (karakter == 'n')) {
            System.out.println("NO");
        } else {
            System.out.println("Karakterin yazimini kontrol ediniz.");
        }
    }
}
