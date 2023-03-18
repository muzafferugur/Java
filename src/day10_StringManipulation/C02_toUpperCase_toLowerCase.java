package day10_StringManipulation;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str="Beni psikopata bağlamayın";
        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
