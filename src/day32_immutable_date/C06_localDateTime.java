package day32_immutable_date;

import java.time.LocalDateTime;

public class C06_localDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat =LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-03-31T01:51:27.199477400

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2023-07-04T05:51:27.199477400
        System.out.println(tarihSaat.minusDays(100).minusMinutes(100));//2022-12-21T00:11:27.199477400


        System.out.println(tarihSaat.toLocalDate()); //2023-03-31
    }
}
