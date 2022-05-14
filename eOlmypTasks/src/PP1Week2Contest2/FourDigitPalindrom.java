package PP1Week2Contest2;

import java.util.Scanner;

public class FourDigitPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int thousand = number / 1000 % 10;
        int hundreds = number / 100 % 10;
        int tens = number /10 % 10;
        int ones = number % 10;
        if  (thousand == ones && hundreds == tens) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
