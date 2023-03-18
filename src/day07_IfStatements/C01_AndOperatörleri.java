package day07_IfStatements;

public class C01_AndOperatörleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b);
        /*
        Java & operatorü konusunda bize iki seçenek sunar

        && kullanırsak, ilk false bulduğunda artık sonucun false olacağını bilir
        ve geriye kalan şartlrı incelemez

        & kullanırsak falseyi görse bile diğer şartları da incelemek ister
        bu çalışma usulünden dolayı & operatorü ,&& operatorunden daha yavaş çalışır
         */

        System.out.println(a<0 & b<20 & c>=b);

    }
}
