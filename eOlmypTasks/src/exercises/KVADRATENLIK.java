package exercises;

import java.util.Scanner;

public class KVADRATENLIK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int d = (int) ((Math.pow(b, 2)) - (4 * a * c));
        if (d > 0 && a != 0) {

            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Two roots: " + (int) x2 + " " + (int) x1);
        } else if (d == 0 && a != 0) {
            double x1;
            double x2 = -b / (2 * a);
            x1 = x2;
            System.out.println("One root: " + (int) x1);
        } else if (d < 0 && a != 0) {
            System.out.println("No roots");
        }

    }
}
