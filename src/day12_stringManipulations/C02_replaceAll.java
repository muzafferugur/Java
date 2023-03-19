package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str ı Bugun java cok guzel haline geirin
        //replaceAll() deki all un amacı
        //butun sayıları sil
        //butun özel karakterleri sil

        //tum ozel karakterleri silelim dediğimizde spaceler de siliniyor.
        //spaceleri korumak için en basta onların yerine cumlede bulunmayacak
        //bir string koyalım
        //"qazwsx"

        str=str.replaceAll(" ", "qazwsx");
        System.out.println(str);

        str=str.replaceAll("\\W", "");
        System.out.println(str); //1Bu2gu3nJavacokg3uzel
        str=str.replaceAll("\\d","");

        //istenmeyen özel karakter sayılardan kurtulduk
        //simdi spaceleri geri getirelim

        str=str.replaceAll("qazwsx"," ");
        System.out.println(str);



    }




}
