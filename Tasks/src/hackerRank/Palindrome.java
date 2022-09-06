package hackerRank;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reverse = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
