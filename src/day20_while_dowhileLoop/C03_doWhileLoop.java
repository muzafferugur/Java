package day20_while_dowhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        /*
        While loop'ta once kontrol edip sonra islem yaptigımız icin
        islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz
        gerekiyor. Bu durumda fazladan bir islem yapiliyor.
         */

        int sayı=7;

        while (sayı<10){

            System.out.println(sayı);

            sayı++;
        }


        sayı=7;

        do {
            System.out.println(sayı);
            sayı++;
        }while (sayı<10);

    }
}
