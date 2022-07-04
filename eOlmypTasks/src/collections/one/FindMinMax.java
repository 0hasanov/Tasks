package collections.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());


        int max = Collections.max(number);
        FindMinMax findMinMax = new FindMinMax();
        System.out.println("Minimum is : " + findMinMax.minMethode(number));
        System.out.println("Maximum is : " + findMinMax.maxMethode(number));

    }

    public int minMethode(ArrayList<Integer> receivedList) {
        return Collections.min(receivedList);

    }

    public int maxMethode(ArrayList<Integer> receivedList) {
        return Collections.max(receivedList);
    }

}
