package dsaWeek1;

import java.util.Scanner;

public class ModularExponentiation {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();
        long z = 1;

        for (int i = 1; i <= n; i++)
            z = (x * z) % m;

        System.out.println(z);

    }
}
