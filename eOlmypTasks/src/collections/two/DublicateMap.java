package collections.two;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateMap {
    public static void main(String[] args) {

        Set<Integer> store = new HashSet<>();
        store.add(1);
        store.add(2);
        store.add(4);
        store.add(6);
        store.add(5);
        store.add(2);
        store.add(1);
        store.add(5);
        Map<String, Integer> nameAndCount = new HashMap<>();
        for (Integer name : store) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(String.valueOf(name), 1);
            } else {
                nameAndCount.put(String.valueOf(name), ++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }


    }
}

