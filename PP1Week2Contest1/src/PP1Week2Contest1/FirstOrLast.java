package PP1Week2Contest1;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hundreds = a / 100 % 10;
        int ones = a % 10;
        if (ones > hundreds ){
            System.out.println(ones);
        }
        if (hundreds > ones) {
            System.out.println(hundreds);
        }
    }
}
