package exercises;

import java.util.Scanner;

public class LoopExercise1 {
    public static void main(String[] args) {
        int a;
        int i;
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Value of a: ");
        a = scan.nextInt();
        System.out.print("Enter " + a + " Numbers: ");
        for (i = 0; i < a; i++) {
            number = scan.nextInt();
            System.out.println(number);
            if (number > 0) {
                System.out.println(number + " is positive");
            } else if (number < 0) {
                System.out.println(number + " is negative");
            } else if (number == 0) {

                System.out.println(number + " is zero");
            }
        }
    }
}
