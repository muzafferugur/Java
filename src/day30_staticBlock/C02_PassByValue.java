package day30_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati));
        //İki farklı method da satisFiyati isminde variable olabilir
        //Java buna itiraz etmez cunku scopeları farklıdır


    }

    public static double indirimliFiyat(double orjinalFiyat){

        /*
        Methodumuz %10 indirim yapip
        yeni fiyati main methoda dondürsün.
         */

        double satisFiyati = orjinalFiyat*0.9;

        return satisFiyati;


    }
}
