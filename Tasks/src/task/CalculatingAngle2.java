package task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculatingAngle2 {
    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
        int hour, minute;
        Scanner tr = new Scanner(System.in);
        String saatStr = tr.next();
        LocalTime saat = LocalTime.parse(saatStr, DateTimeFormatter.ofPattern("HH:mm"));
        hour = saat.getHour();
//        System.out.println("Hour: " + hour);
        minute = saat.getMinute();
//        System.out.println("Minute: " + minute);

        System.out.println(saat);

        int angle = Math.abs((11 * minute - 60 * hour)) / 2;
        System.out.println("SAATIN DƏQİQƏ ƏQRƏBİ İLƏ SAAT ƏQRƏBİ ARASINDAKI BUCAQ : " + angle);


    }
}

