package day28_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1"+ ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Emre","Akdoğan","1/1/2001");
        System.out.println("Ogretmen 2"+ ogretmen2);
    }
}
