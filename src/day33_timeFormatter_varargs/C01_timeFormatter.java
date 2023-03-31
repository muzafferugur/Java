package day33_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println("ilk olusturulan tarih : "+ tarihSaat);
        // ilk olusturulan tarih : 2023-03-31T01:57:38.891222600

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");
        System.out.println("dtf = " + dtf1.format(tarihSaat)); // 31/3/23  01:57

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm");
        System.out.println("dtf2 = " + dtf2.format(tarihSaat)); // dtf2 = 31/Mar/2023  01:57

    }
}
