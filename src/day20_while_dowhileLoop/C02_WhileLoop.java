package day20_while_dowhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
     /*
       Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        int input=5432;

        int rakamlarTop=0;
        int birlerBas=0;
        int temp=input;



        while (temp>0){

            birlerBas=temp%10;
            rakamlarTop+=birlerBas;
            temp/=10;

        }
        System.out.print(input+" sayısının rakamlar toplamı :"+rakamlarTop);

    }
}
