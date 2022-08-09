package pp1Week3Contest1;

import java.util.Scanner;

public class TamKvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (int) Math.sqrt(n);
        if (n == Math.pow(m, 2)) {
            System.out.println(m);
        } else {
            System.out.println("No");
        }
    }
}
