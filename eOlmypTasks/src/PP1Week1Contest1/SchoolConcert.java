package PP1Week1Contest1;

import java.util.Scanner;

public class SchoolConcert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0) {

            System.out.println(a + b - c);
        }

    }
}
