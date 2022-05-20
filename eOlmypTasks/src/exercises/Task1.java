package exercises;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        for (; ;  number++) {
            if ((number % 2) == 0 && (number % 3) == 0) {
                System.out.println(number + " is divisible by 2 and 3");
            } else {
                System.out.println(number + " is not divisible by 2 and 3");
            }

            if ((number % 7) == 0 || (number % 9) == 0) {
                System.out.println(number + " is divisible by 7 or 9");
            } else {
                System.out.println(number + " is not divisible by 7 or 9");
            }

            if (((number % 2) == 0) && ((number % 3) == 0)) {
                if ((number % 5) == 0) {
                    System.out.println(number + " is divisible by 2 and 3 and 5");
                } else {
                    System.out.println(number + " is divisible by 2 and 3 but 5");
                }
            } else if ((number % 5) == 0) {
                System.out.println(number + " is not divisible by 2 and 3 but 5");
            } else {
                System.out.println(number + " is not divisible by 2 and 3 and 5");
            }
        }
    }
}
