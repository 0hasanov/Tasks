package hackerRank;

import java.util.Scanner;

public class SumAndAverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edilen ededlerin sayi: ");
        int say = sc.nextInt();
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < say; i++) {
            counter++;
            System.out.println(counter + "-" + "Ededi daxil edin!");
            int number = sc.nextInt();
            sum = sum + number;

        }
        System.out.println("Sum of numbers: " + sum);
        double average = sum / say;
        System.out.println("Average of numbers: " + average);
    }

}
