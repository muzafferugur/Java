package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen isim giriniz");
        /*
        string verileri scanner ile alırken next() ve nextLine() kullanılabilir
        next():ilk boşluğa kadarolan kısmı yani(1 kelime)alır
        nextLine(): satırın sonuna kadar ne yazarsak alır
        Not: eğer art arda birden fazla string değer alacaksak nextLine() kullanmalıyız
         */
        String isim = scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int yas= scan.nextInt();
        System.out.println("girilen bilgiler:"+isim+" "+soyisim+" "+yas);


    }
}
