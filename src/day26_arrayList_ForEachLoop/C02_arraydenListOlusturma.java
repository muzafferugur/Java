package day26_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_arraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list olusuturun.
        Kullanicidan bir sayi isteyip listede var olup olmadigini kullaniciya yazalim.
         */
        Random rnd=new Random();
        int sayı=0;
        List<Integer> sayıListesi=new ArrayList<>();

        while (sayıListesi.size()<200){
            sayı=rnd.nextInt(200);
            if (!sayıListesi.contains(sayı));{
                sayıListesi.add(sayı);

            }
        }
        System.out.println(sayıListesi);

        boolean bildiMi=false;
        int tahminSayısı=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMi){//bildiMi=false
            System.out.println("Lutfen bir sayı tahmininde bulunun");
            sayı=scan.nextInt();
            if (sayıListesi.contains(sayı)){
                System.out.println("tebrikler"+tahminSayısı+" adet tahminde listeden bir sayı buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayısı+" adet sayı söylediniz ama hiç biri listede yok");
                tahminSayısı++;
            }

        }
    }
}
