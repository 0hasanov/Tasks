package pp1Week1Contest1;

import java.util.Scanner;

public class TwoDigitsFromFourDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int firstdigit = a / 1000 % 10;
        int seconddigit = a / 100 % 10;
        int thirddigit = a / 10 % 10;
        int fourthdigit = a % 10;
        if (seconddigit == 0) {
            System.out.println(thirddigit);
        } else {


            System.out.println(seconddigit + "" + thirddigit);
        }
    }
}
