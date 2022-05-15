package PP1Week2Contest2;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int firstdigit  = a /1000;
        int seconddigit = a /100 %10;
        int thirddigit = a /10 %10;
        int fourthdigit = a  % 10;
        if (a % firstdigit ==0 && a % seconddigit ==0 && a % thirddigit ==0 && a % fourthdigit ==0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}