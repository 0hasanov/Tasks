package linearArrays;

import java.util.Scanner;


public class SumWithoutMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        System.out.println(sum - max);
    }
}




