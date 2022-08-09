package pp1Week3Contest1;

import java.util.Scanner;

public class SumOfSomeRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double sum1 = n1 + n2;
        double sum2 = n1 + n2 + n3;
        double sum3 = n1 + n2 + n3 + n4;
        System.out.printf("%.4f  %.4f  %.4f", sum1 , sum2 , sum3);


    }
}
