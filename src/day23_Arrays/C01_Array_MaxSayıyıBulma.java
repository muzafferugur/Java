package day23_Arrays;

public class C01_Array_MaxSayıyıBulma {
    public static void main(String[] args) {

             /*
     Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
      */

        int[] sayılar = {3, 5, 7, 1, 4, 9, 5, 2};

        maxSayıyıYazdır(sayılar);


    }

    private static void maxSayıyıYazdır(int[] sayılar) {

        int maxSayı=sayılar[0];
        for (int i = 1; i <sayılar.length; i++) {
            if (sayılar[i]>maxSayı){
                maxSayı=sayılar[i];
            }

        }

        System.out.println("Arraydeki en büyük sayı :"+maxSayı);
    }
}
