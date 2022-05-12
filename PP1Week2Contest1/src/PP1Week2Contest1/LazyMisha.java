package PP1Week2Contest1;

import java.util.Scanner;

public class LazyMisha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        if (t1 <= t2 && t1 <= t3) {
            System.out.println(t1);
        }
        else if (t2 <= t3 && t2 <= t1) {
            System.out.println(t2);
        }
        else {
            System.out.println(t3);
        }


    }
    }
