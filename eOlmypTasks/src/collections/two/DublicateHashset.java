package collections.two;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DublicateHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> store = new HashSet<>();
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());
        store.add(sc.nextInt());


        for (Integer dublicates : store) {
            if (store.add(dublicates) == false) {
                System.out.println(dublicates);
            }
        }
    }
}
