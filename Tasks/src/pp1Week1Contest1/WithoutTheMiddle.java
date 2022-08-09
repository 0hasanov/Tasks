package pp1Week1Contest1;

import java.util.Scanner;

public class WithoutTheMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int firstdigit = a / 100 % 10;
        int seconddigit = a / 10 % 10;
        int thirddigit = a  % 10;

        System.out.println(firstdigit + "" + thirddigit);
    }
}
