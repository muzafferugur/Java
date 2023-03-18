package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazır methodları kullanabilmemiziçin
        primitive data türlerinin herbiri için açtığı class lardır.
         */
        String str="java ile hayat ne güzel";

        System.out.println(str.toUpperCase());
        boolean guzelMi=true;
        //guzelMi. boolean primitive olduğundan hazır method u bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo="123456";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı sayı giriniz");

        String sifre= scan.nextLine();
        Integer sifreSayı=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlası :"+ (sifre+3));
        System.out.println("Integer sifrenin 3 fazlası :"+ (sifreSayı+3));

        /*
        Wrapper classlar ileride kullanabileceğimiz pek cok faydalı hazır metod içerir.
         */


    }
}
