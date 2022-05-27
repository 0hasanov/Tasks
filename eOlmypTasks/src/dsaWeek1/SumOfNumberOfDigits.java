package dsaWeek1;

import java.util.Scanner;

public class SumOfNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum;
        for (sum = 0; n < 0 || n > 0; n /= 10) {
            sum += n % 10;

        }
        System.out.println(sum);
    }

}
