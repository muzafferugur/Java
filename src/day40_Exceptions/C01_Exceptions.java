package day40_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 2;
        System.out.println(a/b);
        //bunda sıkıntı yok ya b=0 olsaydı o zaman sorun
        */

         /*
        Bir sorunla karsilasmayi bekledigimiz noktalarda if-else ile sorunu yakalayip
        onunla ilgili cözüm uretebiliriz.

        Ama sorunu her zaman if-else ile cözemeyecegimizden Java try-catch block'lari
        olusturmustur.
         */

        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac<100){

            if (b==0){
                System.out.println("işlem yapılırken payda 0 oldu dikkat etmelisiniz");
            }else {
                System.out.println(a / b);
            }
            b--;
            sayac++;
        }
    }
}
