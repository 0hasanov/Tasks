package pp1Week2Contest1;

import java.util.Scanner;

public class AtLeastOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 !=0 || n>0 && (n>99 && n<1000)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
