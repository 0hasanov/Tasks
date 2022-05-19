package pp1Week3Contest1;

import java.util.Collections;
import java.util.Scanner;

public class squareandkub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int square;
        int cube;

        for (; a <= b; a++) {
            square = a * a;
            System.out.print(square + "\t");
            cube =  a * a * a;
            System.out.println(cube + "\t");
        }
    }
}