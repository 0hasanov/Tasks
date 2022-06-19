package pp1AndABitmore;

import java.util.Scanner;

public class IntegerToRum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println(toRum(sc.nextInt()));

    }

    public static String toRum(int i) {
        int digits = i % 10;
        int tens = (i % 100) / 10;
        int hundreds = (i % 1000) / 100;
        int thousands = i / 1000;


        return (romanDigit(thousands, "M", "MM ", "MMM ") +
                romanDigit(hundreds, "C", "D", "M") +
                romanDigit(tens, "X", "L", "C") +
                romanDigit(digits, "I", "V", "X"));
    }

    public static String romanDigit(int i, String first, String second, String third) {

        String result = "";
        if (i == 0) {
            System.out.print("");
        }
        else {
            if ((i >= 4) && (i <= 8)) {
                return second;
            }
            if (i == 9) {
                return third;
            }
            if (i < 4) {
                return first;


            }
        }

        return result;
    }
}