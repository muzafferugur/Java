package day23_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldiginiz bir ismin
        verilen bir array'de olup olmadıgını
        kontrol edip, bize true veya false
        sonucu donen bir method olusturun.
         */

        String [] isimler={"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Aradiginiz ismi yaziniz : ");
        String arananİsim = scan.nextLine();

        boolean sonuc=contains(isimler,arananİsim);
        if (sonuc){
            System.out.println("girilen isim listede var");
        }else System.out.println("girilen isim listede yok");
    }

    public static boolean contains(String[] isimler, String arananİsim) {
        boolean sonucMethod=false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananİsim));
            sonucMethod=true;


        }

        return sonucMethod;

    }
}
