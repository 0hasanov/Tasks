package hackerRank;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        String capw1 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
        String capw2 = word2.substring(0, 1).toUpperCase() + word2.substring(1, 3);
        System.out.println(capw1 + " " + capw2);
    }
}
