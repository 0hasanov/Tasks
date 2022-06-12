import java.util.Arrays;
import java.util.Scanner;

public class arrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int column = sc.nextInt();

        int number = 1;
        int[][] arr = new int[column][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++,number++) {
                arr[i][j] = number;
            }
        }
        System.out.println(Arrays.deepToString(arr));

       /* for (int i = 0; i < arr.length; i++) {
            arr[i][i] = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.println((int) Math.pow(arr[i][i], 2));
                }
            }
        }*/
        for (int i = 0; i < arr[i].length; i++) {
            System.out.println(Arrays.deepToString(arr + "\n"));

        }
    }
}