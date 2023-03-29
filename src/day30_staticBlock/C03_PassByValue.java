package day30_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
      /*
            %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyatı=100;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyatı);
        System.out.println("indirimli Fiyati : "+indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyatı) {
        double indirimliFiyat=satisFiyatı*0.75;

        return indirimliFiyat;
    }
}
