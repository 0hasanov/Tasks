package hackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        sc.close();
        int area = breadth * height;
        if (breadth > 0 && height > 0) {
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
}
