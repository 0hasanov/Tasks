package javaExercise;

import java.util.Scanner;

public class FindAverageOf5NumbersUsingWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(count< 5){
            System.out.println("Enter an integer: ");
            int number =sc.nextInt();
            sum = sum+number;
            count++;
        }

        double average = ((double) sum) / count;
        System.out.println("Average is :"+average);

    }
}
