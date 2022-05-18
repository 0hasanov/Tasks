package pp1Week2Contest1;

import java.util.Scanner;

public class SightseeingTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (n%k == 0 && m%k == 0) {
            System.out.println(n / k + m / k);
        }
        else if (n%k!=0 && m%k!=0){
            System.out.println(n / k + m / k + 2);
        }
        else {
            System.out.println(n / k + m / k + 1);
        }
    }
}
