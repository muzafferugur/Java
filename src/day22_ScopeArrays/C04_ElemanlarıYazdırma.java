package day22_ScopeArrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayilar [] = {1, 2, 3, 4, 5, 6, 7};
        // Array'in tamammini yazdiralim.

        System.out.println(Arrays.toString(sayilar));

        //Array'in tum elementlerini yazdiralim.

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]+" ");

        }

    }
}
