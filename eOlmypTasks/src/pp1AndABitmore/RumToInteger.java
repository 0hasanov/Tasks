package pp1AndABitmore;

import java.util.Scanner;

public class RumToInteger {


    public static int rumToInt(String rum) {

        int number = 0;
        for (int i = 0; i < rum.length(); i++) {
            char c = rum.charAt(i);
            if (c == 'I') {
                number += 1;
            } else if (c == 'V') {
                number += 5;
            } else if (c == 'X') {
                number += 10;
            } else if (c == 'L') {
                number += 50;
            } else if (c == 'C') {
                number += 100;
            } else if (c == 'D') {
                number += 500;
            } else if (c == 'M') {
                number += 1000;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rum = String.valueOf(rumToInt(sc.next()));
        System.out.println(rum);
    }
}
