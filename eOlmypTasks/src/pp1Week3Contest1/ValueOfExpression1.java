package pp1Week3Contest1;

import java.util.Scanner;

public class ValueOfExpression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double s = 2 * Math.pow(x, 2) - 4 * x * y + 3 * Math.pow(y, 2) + (x + y) / 7;
        System.out.printf("%.3f",s);
    }
}
