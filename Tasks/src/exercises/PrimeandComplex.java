package exercises;

import java.util.Scanner;

public class PrimeandComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dc = sc.nextInt();
        System.out.println(PrimeorComplex(dc));

    }

    public static String PrimeorComplex(int number) {
        if (number == 0 || number == 1) {
            return "complex";
        }
        if (number == 2) {
            return "prime";
        }
        if (number < 0) {
            return "Oops";
        }
        for (int i = 2; i <= number/2 ; i++) {
            if (number % i == 0) {
                return "complex";
            }
        }
        return "Prime";

    }
}
