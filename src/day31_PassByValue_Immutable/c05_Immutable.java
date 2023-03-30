package day31_PassByValue_Immutable;

public class c05_Immutable {
    public static void main(String[] args) {
        String isim = "Mine";

        isim = isim.toUpperCase();
        System.out.println(isim); //MINE

        isim = "Mevlüt";
        System.out.println(isim); //Mevlüt

        for (int i = 0; i < 100; i++) {
            isim+=".";

        }
        System.out.println(isim);
    }
}
