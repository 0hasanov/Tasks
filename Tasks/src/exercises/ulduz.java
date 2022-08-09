package exercises;

import java.util.Scanner;

public class ulduz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int j = 1; j <= a; j++) {
            System.out.print("***");

        }
        System.out.println();
        for (int k = 1; k <= a; k++) {
            System.out.print("*****");

        }
        System.out.println();
        for (int l = 1; l <= a; l++) {
            System.out.print("*******");

        }
        System.out.println();
        for (int m = 1; m <= a; m++) {
            System.out.print("*********");

        }
    }
}

