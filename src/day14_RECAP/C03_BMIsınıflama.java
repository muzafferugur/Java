package day14_RECAP;

import java.util.Scanner;

public class C03_BMIsınıflama {
    public static void main(String[] args) {

         /*
              *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
              *
             BMI = kilo(kg) /(boy*boy)(cm)
             BMI <=20 oldukca zayifsiniz
             20<BMI<=25 Normal sinirlardasiniz
             25<BMI<=30 Sisman kategorisindesiniz
             30<BMI ==> Obez grubundasiniz.
               */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;

        System.out.println("lütfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        double BMI=kilo/(boy*boy);
        System.out.print("BMI :"+BMI);

        if (BMI<0){
            System.out.println(" lütfen boy ve kilonuzu tam sayı olarak giriniz");
        } else if (BMI<=20) {
            System.out.println(" oldukca zayifsiniz");

        } else if (BMI<=25) {
            System.out.println(" Normal sinirlardasiniz");

        } else if (BMI<=30) {
            System.out.println("Sisman kategorisindesiniz");

        }else {
            System.out.println("Obez grubundasiniz");
        }
    }
}
