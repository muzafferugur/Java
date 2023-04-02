package day38_İnheritqnceDataTypeKullanimi;

public class CMemur extends BMuhasebe{
    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

      CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();//personel class
        System.out.println(mmr1.isim);//personel class
        System.out.println(mmr1.soyisim );//personel class
        System.out.println(mmr1.departmant);//personel


        BMuhasebe mhsb1=new BMuhasebe();

        /*
        her ne kadar memur classının içinde olsamda oluşturduğum obje muhasebe classından
        bunu da oluşturduğum const. den anlıyorum.(cunku data turu ve const. BMuhasebe)
         */

        /*
        ASLINDA HER BİR CLASS AYNI ZAMANDA BİR DATA TÜRÜDÜR.
        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer sayi = 20;
        BMuhasebe class'i da obje olusturabilen bir class'dır yani data turudur.
         */

        System.out.println(mhsb1.gunlukMesai); // 8 --> Muhasebe class
        System.out.println(mhsb1.saatUcreti); // 10 --> Muhasebe class
        mhsb1.maas(); // Personel minumum : 2400 maas alir --> Muhasebe class
        mhsb1.ozelSigorta(); // Isteyen calisanlara %50 indirimli ozel sigorta yapilir. --> Muhasebe class
        mhsb1.sigorta(); // Personel
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departmant); // Personel








    }
}
