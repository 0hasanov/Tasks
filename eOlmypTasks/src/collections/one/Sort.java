package collections.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());

        Collections.sort(numbers);
        for (Integer asd :
                numbers) // ascend
            System.out.print(asd + " ");
        System.out.println();
        Collections.sort(numbers, Collections.reverseOrder()); //descend
        for (Integer asd :
                numbers)
            System.out.print(asd + " ");


    }

}
