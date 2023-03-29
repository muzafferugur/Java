package day30_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
      /*
            %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyatı=100;
        double İndirimOranı=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyatı,İndirimOranı);
        System.out.println("indirimli Fiyati : "+indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyatı,double İndirimOranı) {
        double indirimliFiyat=satisFiyatı*(1-İndirimOranı/100);

        return indirimliFiyat;
    }
}
