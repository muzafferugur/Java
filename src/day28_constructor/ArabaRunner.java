package day28_constructor;

import day27_Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        //bir gün önceki Car classından obje oluşturalım

        /*
        farklı bir package daki bir classdan obje oluşturduğumuzda
        access modifierları da dikkate almalıyız
         */
        Car car1=new Car();
        System.out.println( car1.fiyat);

        /*
        Araba classından bir obje oluşturduğumuzda eğer default
        constructor kullanıldıysa tum özellikler için
        tek tek değer atamak zorunda kalırız
         */

        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("Araba1 bilgileri\nMarka : " +araba1.marka + "\nModel : " + araba1.model
                + "\nyil : " + araba1.yil + "\nfiyat : " + araba1.fiyat);
        /*
        Eğer bir objeyi oluştururken bazı özellilerini
        argument olarak belirtip
        o ozelliklerde bir obje oluşturmak istersek
        Java itiraz eder.

        cunku her class da default constructor vardır
        ama o parametresizdir.
        bizim yeni parametreli constructorler a ihtiyacımız vardır
         */

        Araba araba2=new Araba("BMW","5.20",2011,15000);

        System.out.println("Araba2 bilgileri\nMarka : " +araba2.marka + "\nModel : " + araba2.model
                + "\nyil : " + araba2.yil + "\nfiyat : " + araba2.fiyat);

        Araba araba3 = new Araba("Opel", "Astra",2015,70000);
        System.out.println("Araba3 bilgileri\nMarka : " + araba3.marka + "\nModel : " + araba3.model
                + "\nyil : " + araba3.yil + "\nfiyat : " + araba3.fiyat);

    }
}
