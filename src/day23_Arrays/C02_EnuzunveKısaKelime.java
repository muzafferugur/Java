package day23_Arrays;

public class C02_EnuzunveKısaKelime {
    public static void main(String[] args) {
         /*
        Soru 2- Verilen String bir array’de
        en uzun ve en kisa String’leri yazdiran bir method olusturun
         */
        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        enUzunVeKısayıYazdır(isimler);


    }

    public static void enUzunVeKısayıYazdır(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKısaKelime=isimler[0];

        for (int i = 1; i <isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }

            if (isimler[i].length()<enKısaKelime.length()){
                enKısaKelime=isimler[i];
            }

        }
        System.out.println("Arraydeki en uzun kelime :"+enUzunKelime);
        System.out.println("Arraydeki en kısa kelime :"+enKısaKelime);
    }
}
