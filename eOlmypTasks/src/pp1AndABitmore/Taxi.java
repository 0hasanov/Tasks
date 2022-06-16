package pp1AndABitmore;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        if ((d1+d2+d3) %3==0){
            if (d1 < d2 && d1 < d3) {
                System.out.println(d1);
            }
            if (d2 < d1 && d2 < d3) {
                System.out.println(d2);
            }
            if (d3 < d2 && d3 < d1) {
                System.out.println(d3);
            }
        }
        else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
