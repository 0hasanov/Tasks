package PP1Week3Contest1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = 1;
        int number = sc.nextInt();
        for (i = 1; i <= number; i++) {
            n *= i;

        }
        System.out.println(n);
    }
}



