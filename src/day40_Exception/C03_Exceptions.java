package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o index'deki urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */

        String[] urunler={"Nutella", "Cokokrem", "Sut", "Cay", "Fındık"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Istediginiz urunun sıra nosunu giriniz :");
        int istenenSıra=0;


        try {
            istenenSıra = scan.nextInt();
        } catch (InputMismatchException deneme) {

            System.out.println("hata mesajı :"+deneme.getMessage());
            //deneme.printStackTrace();-->kırmızı kodlu hata mesajını yazar
            System.out.println(deneme);//java.util.InputMismatchException
         /*
            1. TRY KISMI: yapilmak istenen islem.
            2. Cath in önündeki parantez:Yakalanmasi istenen EXCEPTION turu ve yakalaninca icine konacak obje.
            3. CATCH BLOGU: problem yakalandigindan ne yapilacagi belirtilen bolum.
             */


        }
        /*
        Catch blogunun onundeki parantezde exception class'inin ismi ve yaninda
        yakalanan exception'i atadigimiz variable'in ismi olur (e)

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz.

        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa (e) kullanilmasa
        da kod calisir.
         */
        //System.out.println("program çalısmaya devam ediyor");
        try {
            System.out.println("Aradığınız ürün no : "+urunler[istenenSıra-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiğiniz sıra listemizde bulunmuyor"+
                    "\nSıra no en fazla :"+(urunler.length)+" olabilir");

        }
    }
}
