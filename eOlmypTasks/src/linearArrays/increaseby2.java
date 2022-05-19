package linearArrays;

import java.util.Scanner;

public class increaseby2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + 2 + "\t");
            } else {
                System.out.println(arr[i]);
            }
        }

    }
}
