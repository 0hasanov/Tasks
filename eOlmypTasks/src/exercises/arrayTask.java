package exercises;

import java.util.Scanner;

public class arrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int column = sc.nextInt();

        int number = 1;
        int[][] arr = new int[column][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, number++) {
                arr[i][j] = number;
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        System.out.println("With For method");
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");


            }
            System.out.println();

        }
        System.out.println("With Enhanced method");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("|%-3s",anInt + " ");


            }
            System.out.println("|\n");

        }
    }
}