package dsaWeek1;

import java.util.Scanner;

public class Fibonacci_N_th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        else {
            return fib(n - 1) + fib(n - 2);
        }


    }
}
