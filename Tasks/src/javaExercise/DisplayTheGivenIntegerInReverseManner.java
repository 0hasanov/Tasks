package javaExercise;

import java.util.Scanner;
import java.util.stream.Stream;

public class DisplayTheGivenIntegerInReverseManner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");

        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = (reverse *10) + digit;
            number = number / 10;


        }
        System.out.println(reverse);
    }
}
