package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list1.add(random.nextInt(10));
            list2.add(random.nextInt(10));

        }
        System.out.println("List 1"+ list1);
        System.out.println("List 2"+list2);
        list1.stream().distinct().peek(a-> System.out.print(a+" ")).collect(Collectors.toList());
        System.out.println();
        list2.stream().distinct().peek(a-> System.out.print(a+" ")).collect(Collectors.toList());
    }


}

