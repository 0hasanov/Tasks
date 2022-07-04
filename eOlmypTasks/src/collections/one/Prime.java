package collections.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<Integer>();
        prime.add(sc.nextInt());
        for (Integer number :
                prime) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println("complex");
                }
                if (number == 0 || number == 1) {
                    System.out.println("complex");
                }

                else {
                    System.out.println("prime");
                }
            }
        }
    }
}