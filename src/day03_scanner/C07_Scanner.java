package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim,soyism ve yaşınızı giriniz \naralarda Enter tuşuna basınız");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("girilen bilgiler:"+isim+" "+soyisim+" "+yas);


    }
}
