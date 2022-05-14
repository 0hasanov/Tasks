package PP1Week2Contest2;

import java.util.Scanner;

public class ThreeIdenticalDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                // 2221+       2212+       1222+  2122+
        int number = sc.nextInt();
        int thousand = number / 1000 % 10;
        int hundreds = number / 100 % 10;
        int tens = number /10 % 10;
        int ones = number % 10;
        if  (thousand == hundreds && thousand == tens || thousand ==tens && thousand == ones || thousand == hundreds && thousand == ones || hundreds == tens && hundreds == ones) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
