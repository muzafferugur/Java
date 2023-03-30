package day32_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {
    public static void main(String[] args) {
        /*
        İki tarih arasındaki sureyi bulma
         */

        LocalDate tarih1 = LocalDate.of(1995, 10, 9);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(bugun, tarih1);

        System.out.println(period);//P-27Y-5M-22D
    }
}
