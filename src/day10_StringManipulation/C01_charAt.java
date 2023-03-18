package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java öğrenmek ne güzel";

        System.out.println(str.toUpperCase().charAt(7));//R
        System.out.println(str.charAt(21));//l
        //System.out.println(str.charAt(22));//.StringIndexOutOfBoundsException hatası verir


        /*
        son harfi bulmak için str ın uzunluğunun 1 eksiğini index olarak gireriz
        eğer index olarak uzunluğu veya daha bir sayıyı girersek java exception verir


        charAt() methodu kullandığımızda sonuc char olacağı için artık manipulation yapamayız
        string methodlarından kullanmamız gereken method varsa
        charAt() den önce kullanmalıyız
         */
    }
}
