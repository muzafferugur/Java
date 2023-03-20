package day13_RECAP;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

         /*
        not hesaplayici
         A => 90 ~100
         B => 80 ~ 89
         C => 70 ~ 79
         D => 60 ~ 69
         F =>  0 ~ 59
          */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir not giriniz");
        double not=scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("gecerli bir not giriniz");

        }else if (not<60){
            System.out.println("F");

        } else if (not<70) {
            System.out.println("D");

        } else if (not<80) {
            System.out.println("C");

        } else if (not<90) {
            System.out.println("B");

        }else {
            System.out.println("A");
        }


    }
}
