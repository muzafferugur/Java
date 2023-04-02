package day38_İnheritqnceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");

    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir.");
    }

    public static void main(String[] args) {

        /*
        OVERRİDDİNG child class daki methodun
        parent classdaki aynı isimdeki methodu
        etkisiz hale getirerek kendisinin spesifikleştirmesidir.
         */

    }



}
