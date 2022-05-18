package pp1Week2Contest1;

import java.util.Scanner;

public class TheLevelOfEducationalAchievements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 1 && 3 <= a) {
            System.out.println("Initial");

        }
        else if (a >= 4 && 6 <= a) {
            System.out.println("Average ");
        }
        else if (a >= 7 && 9 <= a ) {
            System.out.println("Sufficient ");
        }
        else if (a >= 10 && 12 <= a) {
            System.out.println("High");
        }
    }
}