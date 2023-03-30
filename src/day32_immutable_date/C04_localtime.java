package day32_immutable_date;

import java.time.LocalTime;

public class C04_localtime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);//00:36:30.863620400

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
        bizim variable'imiza store eder.

        time1 variable'inin degeri SABİTTİR.
         */

        Thread.sleep(3000); // 3 sn bekler sonra alt satira geçer

        time1=LocalTime.now();
        System.out.println(time1);//00:37:55.392775100

        System.out.println("time1.getSecond() = " + time1.getSecond());//time1.getSecond() = 31

        System.out.println("time1.plusSeconds(10000) = " + time1.plusSeconds(10000));
        //time1.plusSeconds(10000) = 03:25:38.159769700

    }
}
