package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        int min = Collections.min(number);
        int max = Collections.max(number);
        System.out.println("Minimum is : " + min);
        System.out.println("Maximum is : " + max);

    }

}
