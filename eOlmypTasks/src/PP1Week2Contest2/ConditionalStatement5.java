package PP1Week2Contest2;

import java.util.Scanner;

public class ConditionalStatement5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
//        if (x>=13) {
//            int y = (int) x;
//            System.out.println(y + Math.pow(x,3) * 3 + Math.pow(x,2) * 4 + 5*x + 6);
//        }
//        else if (x<13) {
//            int y = (int) x;
//            System.out.println(Math.pow(x,3) * 3 - Math.pow(x,2) * 2 - 3 * x -4);
//        }
       x = x>=13 ? Math.pow(x,3) * 3 + Math.pow(x,2) * 4 + 5*x + 6 :  Math.pow(x,3) * 3 - Math.pow(x,2) * 2 - 3 * x -4;
       int y = (int) x;
       System.out.println(y);
    }
}

