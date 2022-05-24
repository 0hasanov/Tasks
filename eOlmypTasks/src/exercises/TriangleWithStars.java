package exercises;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int countStar = 1;

        int countSpace = n-1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < countSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < countStar; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < countSpace; j++) {
                System.out.print(" ");
            }



            System.out.println();
            countStar+=2;
            countSpace--;
        }

    }
}
