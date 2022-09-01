package hackerRank;

import java.util.Scanner;

public class vurmaCedveli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(eded + "x" + i + "=" + eded*i);
        }
    }
}
