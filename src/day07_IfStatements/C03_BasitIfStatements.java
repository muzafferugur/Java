package day07_IfStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {

        /*
        bir if statement de {} kullanılmazsa
        java ilk satırı sart ile bağlar sonraki satırlar bağımsız olur

         eğer birden fazla satır aynı if sartına bağlanmış ise mutlaka {} kullanmalıyız
         */
        int sayı=23;

        if(sayı>0)
            System.out.println("sayı pozitiftir");//değere bağlı olarak calısır
            System.out.println("pozitif kalacaktır");//her zaman calısır
            System.out.println("ücüncü satır");//her zaman calısır


        if (sayı%2==0)
            System.out.println("sayı çift");//değere bağlı olarak calısır
            System.out.println("cift kalacaktır");//her zaman calısır



        if (sayı%5==0)
            System.out.println("sayı 5in tam katı");


    }
}
