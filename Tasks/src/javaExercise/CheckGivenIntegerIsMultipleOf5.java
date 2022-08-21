package javaExercise;

import java.util.Scanner;

public class CheckGivenIntegerIsMultipleOf5 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.printf("%s is a multiple of 5", number);
        } else {
            System.out.printf("%s is not a multiple of 5", number);
        }
    }
}
