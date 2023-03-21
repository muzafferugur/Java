package day15_StringManMethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {


        //input olarak verilen 2 integer ı toplayıp sonucunu yazdıralım
        //bir method oluşturun

        int input1=10;
        int input2=20;

        //method 4 adımda oluşturulur
        //1.method call
        //2.argument eklenmesi gerekiyorsa ekleyelim
        //  eğer method un return type void den farklı olacaksa
        //  bir variable olusturup,method call u assign edelim

        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {

       //3.adım:method deklarasyounda değiştirilmesi gereken bolumleri değiştir.(access modifier,return Type vb..)
       //4. eğer return type void  dışında bir şeyse return keyword u ve donecek değeri hesaplamalıyız

        System.out.println("girilen iki sayının toplamı : " +(input1+input2));

    }
}
