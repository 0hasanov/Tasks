package hackerRank;

import java.util.Locale;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.DATE,day);
        calendar.set(java.util.Calendar.MONTH,month-1);
        calendar.set(java.util.Calendar.YEAR,year);

        System.out.println(calendar.getDisplayName(java.util.Calendar.DAY_OF_WEEK, java.util.Calendar.LONG,new Locale("en","US")).toUpperCase());

    }
}