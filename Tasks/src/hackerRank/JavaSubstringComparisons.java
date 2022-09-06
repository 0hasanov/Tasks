package hackerRank;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int substring = sc.nextInt();
        String minSubstring = word.substring(0, substring);
        String maxSubstring = word.substring(0, substring);
        for (int i = 1; i < word.length() - substring +1; i++) {
            String sub = word.substring(i, i + substring);
            System.out.println(sub);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
            System.out.println(minSubstring);
            System.out.println(maxSubstring);
        }
    }
}
