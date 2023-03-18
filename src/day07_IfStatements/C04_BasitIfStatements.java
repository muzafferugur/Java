package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        /*
        kullanıcıdan gün ismi alın ve
        haftaiçi mi haftasonu mu yazdırın(String için equals methodunu kullanın)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır gun ısmı gırınız");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("girilen gün haftasonu");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("çarsamba")
        || girilenGun.equals("perşembe") || girilenGun.equals("cuma")){
            System.out.println("girilen gün haftaiçi");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("çarsamba")
                || girilenGun.equals("perşembe") || girilenGun.equals("cuma")
                || girilenGun.equals("cumartesi") || girilenGun.equals("pazar"))){
            System.out.println("lutfen geçerli bir gün giriniz");
        }


    }
}
