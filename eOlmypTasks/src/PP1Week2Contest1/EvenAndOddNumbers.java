package PP1Week2Contest1;

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 != 0 && b % 2 !=0 && c % 2 !=0 ) {
            System.out.println("NO");
        }
        else if (a % 2 == 0 && b % 2 ==0 && c % 2 ==0 ) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

        }

        }

