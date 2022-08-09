package pp1Week3Contest1;

import java.util.Scanner;

public class FindMinimumReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
    }

    public static int intFindMinimum(int[] arr) {
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;

            }
        }
        return min;
    }
}

