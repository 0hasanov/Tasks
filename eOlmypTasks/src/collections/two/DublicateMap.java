package collections.two;

import java.util.*;

public class DublicateMap {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();


        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(11);
        numbers.add(55);
        numbers.add(33);

        for (Integer names : numbers) {
            System.out.println(names);
        }


        Map<Integer, Integer> count = new HashMap<>();


        for (Integer names : numbers) {
            count.put(names, count.getOrDefault(names, 0)+1);
        }


        System.out.println(count);
    }
}

