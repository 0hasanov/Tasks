package dsaWeek1;

import java.util.Scanner;

public class HowMuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = Math.max(n,k);
        System.out.println(answer);
    }

}

