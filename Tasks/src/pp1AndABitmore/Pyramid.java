package pp1AndABitmore;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {


        System.out.print("Input number of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countnumber = 1;

        int countSpace = n - 1;

        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++)

            for (int j = 0; j < countSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < countnumber; j++) {
                System.out.printf("%-3s",i);
            }
            for (int j = 0; j < countSpace; j++) {
                System.out.print("");
            }


            System.out.println();
            countnumber += 1;
            countSpace--;

        }
    }
}
