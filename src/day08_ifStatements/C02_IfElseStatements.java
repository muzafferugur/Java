package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan üzerinden bir not isteyin
        100 üzerinden
        harf notuna cevir
        50 den asağı ise "D"
        50-60 C
        60-80 B
        80 üzeri A
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("lutfen geçerlibir not giriniz");

        }else if (not<50){ //bu satıra geldiysek notunuz 0 ile 100 arasında
            System.out.println("D");
        } else if (not<60) {//bu satıra geldiysek notunuz 50 ile 100 arasında
            System.out.println("C");

        } else if (not<80 ) {//bu satıra geldiysek notunuz 60 ile 100 arasında
            System.out.println("B");

        }else {
            System.out.println("A");
        }

    }
}
