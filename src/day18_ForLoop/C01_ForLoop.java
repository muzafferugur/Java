package day18_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //verilen bir pozitif tam sayının
        // tam bölenlerini yazdıralım

        int input=20;

        for (int i = 1; i <input ; i++) {
            if (input%i==0){
                System.out.println(i+" ");
            }

        }
    }
}
