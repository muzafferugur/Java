package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        /*
        gun ismi iste
        girilen isim geçerli ise gun isminin 1, ve 3. harflerini
        ilk hrf buyuk diğer ikisi kucuk olarak yazdırın,
        gun ismi geçerli değilse "geçerli bir gün ismi girin" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("salı")) {
            System.out.println("Sal");

        } else if (gun.equals("çarşamba")) {
            System.out.println("Çar");

        } else if (gun.equals("persembe")) {
            System.out.println("Per");

        } else if (gun.equals("cuma")) {
            System.out.println("Cum");

        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");

        } else if (gun.equals("pazar")) {
            System.out.println("Paz");

        }else {
            System.out.println("gecerli bir gun giriniz");
        }
    }
}
