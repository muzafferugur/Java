package day07_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*
        kullanıcıdan bır karakter gırmesnı ısteyınız
        ve gıırılen karakterın ilk harf olup olmadığını yazdırın

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır karakter gırınız");
        char harf=scan.next().charAt(0);

        if ((harf>='a'&& harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("gırılen karakter bır harf");
        }else {
            System.out.println("gırılen karakter bır harf değil");
        }
    }
}
