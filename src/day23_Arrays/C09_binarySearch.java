package day23_Arrays;

import java.util.Arrays;

public class C09_binarySearch {

    public static void main(String[] args) {

        /*
        binarySearch methodu sıralanmış array de aradığımız elementin indexini döndürür

        Ya aradığımız element array de yoksa?
        (String de indexOf() bize olmayan elentler için -1 döndürüyordu)

        Aradığımız element array de yoksa Java hem olmadığını,
        hem olsaydı nerede olacağını döndürür

        olmadığını ifade etmek için - kullanır
        olsaydı nerede olacağını index değil sıralama kullanır
         */

        int[] sayılar={3,5,1,4,7,0};

        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));//[0, 1, 3, 4, 5, 7]
        //varsa index yoksa -sıra

        System.out.println(Arrays.binarySearch(sayılar,1));//1

        System.out.println(Arrays.binarySearch(sayılar,5));//4

        System.out.println(Arrays.binarySearch(sayılar,10));//-7

        System.out.println(Arrays.binarySearch(sayılar,6));//-6

        System.out.println(Arrays.binarySearch(sayılar,-100));//-1


    }
}
