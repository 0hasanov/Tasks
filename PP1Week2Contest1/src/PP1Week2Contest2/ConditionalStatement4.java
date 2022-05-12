package PP1Week2Contest2;

import java.util.Scanner;

public class ConditionalStatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >=0) {
            System.out.println(Math.pow(x,3)+ 2*x*x + 4*x -6);
        }
        else if (x<0) {
            System.out.println(Math.pow(x,3)-7*x);
        }
    }
}
