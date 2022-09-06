package hackerRank;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        int compare = word1.compareTo(word2);
        System.out.println(word1.length() + word2.length());
        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capw1 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
        String capw2 = word2.substring(0, 1).toUpperCase() + word2.substring(1);
        System.out.println(capw1 + " " + capw2);
    }
}
