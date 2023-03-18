package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g'));// 6
        System.out.println(str.indexOf("t"));//bana integer donduruyor
                                            // int de yok diye bi değer bulunmmuyor
                                            //0 dersek j nin indexidir.
                                            //- bir değer dönerse biz aranan string in str da olmadığını anlarız
                                            // java -1 döndürmeyi tercih etmiştir.

        String str5="dnahwfjabwfajkgnaljgngjkawnf";

        //str5 de p harfi var mı?

        if (str5.indexOf("p")==1){
            System.out.println("str5 te istenen harf kullanılmamış");
        }else {
            System.out.println("str5 te istenen karakter kullanılmış");
        }
    }
}
