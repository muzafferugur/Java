package day24_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdırma {
    public static void main(String[] args) {
         /*
        Verilen bir multi-dimensional array'in tum elementlerini yazdiran bir
        method olusturun.
         */

        int[][] sayilar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1, 6}};

        elemetleriYazdır(sayilar);


    }

    public static void elemetleriYazdır(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {//i =0,1,2 değerleri alacak
            for (int j = 0; j < sayilar[i].length; j++) { //inner arraylerin uzunluğuna bağladık
                System.out.print(sayilar[i][j]+" ");

            }

        }

    }
}
