package day38_İnheritqnceDataTypeKullanimi;

public class DIsci extends BMuhasebe{

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIscı() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIscı() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();//yeni bir işçi oluşturuyoruz muhasebe classından
        //işçinin muhasebe classından hakkettiği tüm haklarla birlikte oradaki özellikleri kullanarak
        /*
        bir obje oluşturulurken
        Data Turu ve constuructor aynı classdan ise
        direkt o classa gidiyorduk
        eğer data turu ve const. farklı ise

        1-obje cons. olduğu classın objesidir.
        ancak bizden istenen İsci classındaki spesifik özellikler değil
        bir işçinin muhasebe classındaki tum calısanlarla beraber sahip olduğu genel ozellikleri
        yazdırır
        data turu ve obje farklı olursa data turunun classına gidip özellikleri oradan ararız
        data turu ve obje aynı olursa hangi classdan olusturduysak oradan ararız
         */

        System.out.println(isc1.gunlukMesai);  // Muhasebeden alcaz- 8
        System.out.println(isc1.saatUcreti); // Muhasebeden alcak 10
        isc1.maas(); // Muhasebe classından --> Personel minumum : 2400 maas alir
        isc1.ozelSigorta(); // Muhasebe classından --> Isteyen calisanlara %50 indirimli ozel sigorta yapilir.
        isc1.sigorta(); // Personel
        System.out.println(isc1.isim); // Personel
        System.out.println(isc1.soyisim); // Personel
        System.out.println(isc1.departmant); // Personel


        APersonel isc2=new DIsci();//yeni bir işçi oluşturuyoruz bu sefer Apersonel classından
        //işçinin personel classından hakkettiği tüm haklarla birlikte oradaki özellikleri kullanarak başlıyoruz aramaya




    }

}
