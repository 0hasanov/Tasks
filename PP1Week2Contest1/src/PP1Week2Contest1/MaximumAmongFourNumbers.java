package PP1Week2Contest1;

import java.util.Scanner;

public class MaximumAmongFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a>b && a>c && a>d) {
            System.out.println("max :" + a);
        }
        else if (b > a && b>c && b>d ){
            System.out.println("max :" + b);
        }
        else if (c > a && c>b && c>d ){
            System.out.println("max :" + c);

        }
        else   {
            System.out.println("max :" + d);
        }

}
}

