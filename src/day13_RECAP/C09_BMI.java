package day13_RECAP;

import java.util.Scanner;

public class C09_BMI {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo=scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy=scan.nextDouble();

        double boy1= boy/100;

        double VKI=kilo/(boy1*boy1);

        System.out.print("Vucut Kitle Indeksiniz :"+VKI);

    }
}
