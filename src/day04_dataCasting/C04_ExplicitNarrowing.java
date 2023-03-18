package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayı1=50;
        short sayı2= (short) sayı1;
        /*
        geniş data türündeki değeri, dar data türündeki variable a atamak isterseniz
        Java sizin geniş data türündeki değerin, dar data türünün
        sınırlarına uyup uymayacağını calıştırana kadar bilmez
        ama java risk almaz
        Riski sıfıra indirmek için burada bir sorun olursa
        sorumluluğu kabul etmenizi bekler
        bunun için değerin önüne parantez içerisinde istediğimiz data turunu
        yazmamız yeterlidir.
        bu riski üstlendiğimmizde 3 durum oluşabilir
        1-bizim değerimiz dar kalıp değerlerine uygun olursa hiç bir
        kayıp olmadan cast olur
        2-double bir sayıyı int bir sayıya cast etmek gibi durumlarda data kaybı
        yaşayabilirsiniz
        3-geniş kalıptan dar kalıba koyduğumuzda sınırları aşan durumlarda
        veri başkalaşabilir.
         */


    }
}
