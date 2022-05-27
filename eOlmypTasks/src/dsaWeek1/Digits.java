package dsaWeek1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        for (; n != 0 && n >0; n /= 10) {
            count++;
        }
        System.out.println(count);
    }
}
