package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        verilen kelime için asağıdaki sartlardan uygun olanı yazan bir program yazınız
        - verilen kelme cumlede kullanılmamış
        - verilen kelime cumlede sadece bir kere kullanılmış
        - verilen kelime cumlede birden fazla kullanılmış
         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanılmamış");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece bir kere kullanılmış");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanılmış");
        }
    }
}
