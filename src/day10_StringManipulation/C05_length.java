package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren, işi kap";

        System.out.println(str.length());//str ın karakter sayısı
        System.out.println(str.charAt(str.length()-1));//son karakteri yazdıralım p
        System.out.println(str.charAt(str.length()-3));//sondan 3. karakteri yazdıralım

        /*
        java da null pointer (işaretleyici) bir değer değildir
        karsısına yazıldığı variablenin hiç bir değer almadığının işaretçisidir.
         */

        String str2="";//str2 ye bir değer atanmışmıdır EVET
                        //bu değer nedir: hiçlik

        System.out.println(str2.length());//0

        String str3=null; //str3 e bir değer atanmış mıdır. HAYIR
                            //null bu değer atamamayı isaret etmektedir.
        System.out.println(str3.length());//.NullPointerException//bir değer atanmamış ki uzunluğu olsun

    }
}
