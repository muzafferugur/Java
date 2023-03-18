package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        //1-verilen sayı1 ve sayı2 değerlerini değiştren(swap ) yazınız
        //sayı1=10 sayı2=20 kod çalıştıktan sonra sayı1=20 sayı2=10

        int sayı1=10;
        int sayı2=20;
        int sayı3=0;

        sayı3=sayı2;
        sayı2=sayı1;
        sayı1=sayı3;
        System.out.println("swapdan sonra sayı1 :"+sayı1);
        System.out.println("swapdan sonra sayı2 :"+sayı2);
    }
}
