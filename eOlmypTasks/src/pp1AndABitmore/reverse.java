package pp1AndABitmore;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
    }
}


