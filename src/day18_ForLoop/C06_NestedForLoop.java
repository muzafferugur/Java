package day18_ForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        // yan yana 3 tane * yaz
        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");

        }

        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");

        }
        System.out.println("");

        //bu tur durumlarda iç içe(nested) loop kullanmak gerekir

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.println("* ");

            }

        }

    }
}
