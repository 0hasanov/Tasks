package pp1Week3Contest1;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++ ) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }

        for (int i = 2; i >= Math.sqrt(number); i--) {
            if(number % i == 0){
                System.out.print(number / i + " ");
            }
        }


    }
}
