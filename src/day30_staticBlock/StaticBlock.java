package day30_staticBlock;

public class StaticBlock {
    static int sayi;

    static{

        /*
        Static block class üyelerinin tamamından önce calsıır
        (main methoddan bile önce calsıır)

        static block class oluşturulduğunda calsıır
        genellikle de class la ilgili ön ayarlamalar
        veya static variable lara değer atamak için kullanılır

        static blocklarrın class içerisinde nerede olduğunun onemi yoktur
        önce static blocklar calsıır

        birden fazla static block varsa yukarıdan aşağıya doğru çalısır
         */

        System.out.println("static block calıstı");
        sayi=10;

    }

    public static void main(String[] args) {
        System.out.println("main method calıstı");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altıdnaki  static calıstı");

    }
}
