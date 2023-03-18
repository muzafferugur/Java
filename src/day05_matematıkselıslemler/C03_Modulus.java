package day05_matematıkselıslemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        //kullanıcıdan 4 basamaklı bir sayı alınız ve rakamları toplamını yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir tam sayı giriniz");
        int sayı=scan.nextInt();

        int birlerBasamağı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayı=sayı;

        //suanda sayı 5267 bb:0 rt:0

        birlerBasamağı=sayı%10;
        rakamlarToplamı +=birlerBasamağı;
        sayı /=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı +=birlerBasamağı;
        sayı /=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı +=birlerBasamağı;
        sayı /=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı +=birlerBasamağı;
        sayı /=10;

        System.out.println(ilkGirilenSayı+" ilk girilen sayısının rakamlar toplamı : "+ rakamlarToplamı);


    }
}
