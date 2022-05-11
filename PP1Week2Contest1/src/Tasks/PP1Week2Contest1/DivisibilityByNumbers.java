package Tasks.PP1Week2Contest1;

import java.util.Scanner;

public class DivisibilityByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % b ==0 && a % c == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

