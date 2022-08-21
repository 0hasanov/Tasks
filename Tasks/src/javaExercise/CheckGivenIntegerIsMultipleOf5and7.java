package javaExercise;

import java.util.Scanner;

public class CheckGivenIntegerIsMultipleOf5and7 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.printf("%s is a multiple of both 5 and 7", number);
        } else {
            System.out.printf("%s is not a multiple of both 5 and 7", number);
        }
    }
}
