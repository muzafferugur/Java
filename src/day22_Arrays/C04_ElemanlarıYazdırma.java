package day22_Arrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayilar [] = {1, 2, 3, 4, 5, 6, 7};
        // Array'in tamammini yazdiralim.

        System.out.println(Arrays.toString(sayilar));

        //Array'in tum elementlerini yazdiralim.

        for (int i = 0; i < sayilar.length; i++) {
            if (i!= sayilar.length-1) {
                System.out.println(sayilar[i] + " ");
            }else {
                System.out.println(sayilar[i]);
            }

        }

    }
}
