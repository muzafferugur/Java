package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

       byte sayı1=23;
       short sayı2=55;

       int sayı3= sayı1+sayı2;
       double sayı4=sayı1*sayı2;

       sayı4=(double) sayı2/sayı1;

        System.out.println(sayı4);


    }

}
