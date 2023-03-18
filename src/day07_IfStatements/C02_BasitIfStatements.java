package day07_IfStatements;

public class C02_BasitIfStatements {
    public static void main(String[] args) {

        int sayı=15;

        if(sayı>0){
            System.out.println("sayı pozitiftir");
        }

        if (sayı%2==0){
            System.out.println("sayı çift");

        }

        if (sayı%5==0){
            System.out.println("sayı 5in tam katı");
        }

        /*
        basit if cumleleri kodun diğer parçalarından bağımsızdır.
        sadece bir sart kontrol eder, sart saglanıyorsa if body calısır yoksa calısmaz
        birden fazla basıt if cümlesi varsa tümünde if bodysi calısabilir,kısmen if bodyleri calısabilir
        veya hiçbir if bodysi calısmayabilir.
         */
    }
}
