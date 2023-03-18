package day05_matematıkselıslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayı1=10;

        int sayı2=sayı1+1; //11
        sayı2+=5; //16

        /*
        pre veya post increment/decrement
        sadece ++ ve -- işlemi için geçerlidir.
        bu iki işlem sayıdan önce ve sonra ayzılmasına göre farklı iki işleyiş olur

         */

        int sayı3=sayı2++; //1-sayı2 değeri sayı3 e atanacak
                            //2-sayı2 1 artırılacak

        /*
        ++ veya -- variableden sonra olursa buna post denir
        budurumda o satırda yapılan iki işlemden
        artırma veya azaltma sonuncudur.
         */

        System.out.println("sayı3 :"+sayı3);//16
        System.out.println("sayı2 :"+sayı2);//17

        int sayı4=++sayı1;//1-sayı1 1 artırılıcak
                            //2-sayı1 değeri sayı4 e atanacak
        /*
        eğer ++veya-- variableden önce ise burada pre.. denir
        bu durumda o satırda yapılan iki işlemden öncelikli olan
        artırma veya azaltmadır

         */

        System.out.println("sayı4 :"+sayı4);//11
        System.out.println("sayı1 :"+sayı1);//11

    }
}
