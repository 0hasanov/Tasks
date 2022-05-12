package PP1Week2Contest1;

import java.util.Scanner;

public class SightseeingTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int nroom = n/k;
        int mroom = m/k;
        System.out.println(nroom+mroom);
    }
}
