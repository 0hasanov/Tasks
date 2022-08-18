package task;

import java.time.LocalTime;
import java.util.Scanner;

public class CalculateAngle {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();

    public void setHour(int hour) {
        this.hour = hour;
    }


    int minute = sc.nextInt();

    LocalTime localTime = LocalTime.of(hour, minute);


    int angle = Math.abs((11 * minute - 60 * hour)) / 2;

    public static void main(String[] args) {
        CalculateAngle calculateAngle = new CalculateAngle();
        System.out.println("SAATIN DƏQİQƏ ƏQRƏBİ İLƏ SAAT ƏQRƏBİ ARASINDAKI BUCAQ : " + calculateAngle.angle);
    }
}

