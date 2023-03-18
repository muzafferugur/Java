package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

          /*
    kullanıcıdan ismini isteyin
    girilen ismi
    isminiz :ismail şeklinde yazdırın

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");


        String kullanıcıIsmi=scan.next();
        System.out.println("Isminiz:"+ kullanıcıIsmi);
    }



}
