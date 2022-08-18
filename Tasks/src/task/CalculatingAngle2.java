package task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class CalculatingAngle2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();

        int angle = Math.abs((11 * minute - 60 * hour)) / 2;
        System.out.println("SAATIN DƏQİQƏ ƏQRƏBİ İLƏ SAAT ƏQRƏBİ ARASINDAKI BUCAQ : " + angle);


    }
}

