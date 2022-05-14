package PP1Week2Contest2;

import java.util.Scanner;

public class FiveDigitInOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tenthousand = number / 10000 % 10;
        int thousand = number / 1000 % 10;
        int hundreds = number / 100 % 10;
        int tens = number /10 % 10;
        int ones = number % 10;
        if  (tenthousand < thousand && thousand < hundreds &&  hundreds < tens && tens  < ones ) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
