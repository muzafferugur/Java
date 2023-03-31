package day33_timeFormatter_varargs;

public class C04_varargsİleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet","Babayiğit");
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("girilen en uzun kelime :"+enUzunKelime);//Babayiğit
    }
}
