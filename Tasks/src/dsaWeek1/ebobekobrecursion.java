package dsaWeek1;

import java.util.Scanner;

public class ebobekobrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(ebob(number1, number2));
        System.out.println(ekob(number1, number2));
    }

    public static int ebob(int number1, int number2) {
        if (number1 % number2 == 0)
            return number2;
        else {
            return ebob(number2, number1 % number2);
        }
    }

    public static int ekob(int number1, int number2) {
        return number1 * number2 / ebob(number1, number2);
    }
}

