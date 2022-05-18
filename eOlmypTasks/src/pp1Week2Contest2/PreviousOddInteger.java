package pp1Week2Contest2;

import java.util.Scanner;

public class PreviousOddInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0)   {
            System.out.println(a - 1);
        }
        else {
            System.out.println(a - 2);
        }
    }
}
