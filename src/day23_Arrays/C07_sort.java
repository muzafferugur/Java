package day23_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[] sayılar={5,7,1,6,4,3,9};

        //Array'i Arrays class'ını kullanarak natural sıralı hale getirebiiriz

        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));//[1, 3, 4, 5, 6, 7, 9]



    }
}
