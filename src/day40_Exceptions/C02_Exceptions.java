package day40_Exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac<100){

            /*
            try bloğu yapmaya çalıstığımız fakat risk olduğunu düşündüğümüz
            işlemleri yazmak için kullanıllır

            catch den sonraki parantez karşlaşmayı beklediğimiz exception
            turunu java ya soylemek için kullanılır.

            catch bloğu: javaya soylediğimiz exception(istisnai durum) gerçeklesirse
            java nın yapmasını istediğimiz işlem

            --> Catch blog'unun onundeki paranteze karsilasmayi bekledigimiz exception'i
                        yazabilir veya her turlu exception'da devreye girmesini istiyorsak
                        tum exception'larin parent'i olan Exception yazabiliriz.
             */

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu, dikkatli ol");;
            }
            b--;
            sayac++;

        }

    }
}
