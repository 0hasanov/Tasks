package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMinMaxAlqo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());


        
        FindMinMaxAlqo findMinMax = new FindMinMaxAlqo();
        System.out.println("Minimum is : " + findMinMax.minMethode(number));
        System.out.println("Maximum is : " + findMinMax.maxMethode(number));

    }

    public int minMethode(ArrayList<Integer> receivedList) {

        int min = receivedList.get(0);
        for (int number : receivedList) {
            if (number < min) {
                min = number;

            }
        }
        return min;

    }

    public int maxMethode(ArrayList<Integer> receivedList) {


        int max = receivedList.get(0);
        for (int number : receivedList) {
            if (number > max) {
                max = number;

            }
        }
        return max;
    }

}
