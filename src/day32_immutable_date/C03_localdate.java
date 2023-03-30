package day32_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_localdate {

    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);//2023-03-31

        System.out.println("tarih.getDayOfYear() = "+ tarih.getDayOfYear());//90
        System.out.println("tarih.getDayOfWeek() = "+tarih.getDayOfWeek());//FRIDAY
        System.out.println("tarih.getMonthValue() = " +tarih.getMonthValue());//3
        System.out.println("tarih.isLeapYear() = " + tarih.isLeapYear());//false

        LocalDate tarih2=LocalDate.of(2023,03,31);
        System.out.println(tarih2);//2023-03-31

        LocalDate tarih3=LocalDate.of(2023, Month.MARCH,31);
        System.out.println(tarih3);//2023-03-31

        System.out.println(tarih.plusDays(100)); // 2023-07-09, 100 gün sonra

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2028-07-12

        System.out.println(tarih.minusWeeks(20)); // 2022-11-11

        System.out.println(tarih.isAfter(tarih2)); // false

        /*
        İki farkli dogum gunu girilidiginde hangisinde doganın daha buyuk oldugunu bulunuz.
         tarih2 ve tarih3 icin yapalim
         */

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuktur.");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuktur.");

        }else System.out.println("iki tarih birbiri ile aynı");//iki tarih birbiri ile aynı

    }
}
