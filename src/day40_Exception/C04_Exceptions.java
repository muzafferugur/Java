package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        /*
        bir onceki classdaki soruda belirtilen istenen indexin yazılması için
        en bastan "Urun indexi icin bir tam sayi girmeniz gerekli" uyarısı alarak bir döngü oluşturalım
        hata kodlarını almadan
         */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Fındık"};

        Scanner scan;
        System.out.print("Istediginiz urunun sıra nosunu giriniz : ");
        int istenenSıra = 0;
        boolean kontrol = true;

        while (kontrol) {
            try {
                scan = new Scanner(System.in);
                istenenSıra = scan.nextInt();
                kontrol = false;
            } catch (InputMismatchException e) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");

            }
        }

        try {
            System.out.println("Aradıgınız urun : " + urunler[istenenSıra]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz index listemizde bulunmuyor" +
                    "\nsıra numarasi en fazla : " + (urunler.length) + " olabilir");
        }
    }
}
