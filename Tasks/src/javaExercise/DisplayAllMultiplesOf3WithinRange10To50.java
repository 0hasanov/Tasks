package javaExercise;

import java.util.Scanner;

public class DisplayAllMultiplesOf3WithinRange10To50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 10;number<50;number++){
            if(number%3==0){
                sum = sum + number;
                System.out.println(number);

            }

        }
        System.out.printf("Sum of numbers: %d", sum);


    }
}
