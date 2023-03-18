package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        int sayı1=5;
        int sayı2=4;

        System.out.println(str1+" "+str2+" "+sayı1+sayı2);//java guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayı1+sayı2));//java guzeldir 9

        System.out.println(sayı1+sayı2+" "+str1);//9 java
        System.out.println(""+sayı1+sayı2+" "+str2);//54 guzeldir

        System.out.println(str1.concat(" ").concat(str2));//java guzeldir

    }
}
