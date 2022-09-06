package hackerRank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(word.substring(start,end));

    }
}

