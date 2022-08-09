package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list1.add(random.nextInt(10));
            list2.add(random.nextInt(10));

        }
        System.out.println("List 1"+ list1);
        System.out.println("List 2"+list2);
//        list1.stream().distinct().peek(a-> System.out.print(a+" ")).collect(Collectors.toList());
//        System.out.println();
//        list2.stream().distinct().peek(a-> System.out.print(a+" ")).collect(Collectors.toList());


        List<Integer> collect = list1.stream().filter(a -> list2.stream().noneMatch(c -> c==a)).distinct().collect(Collectors.toList());
        List<Integer> collect2 = list2.stream().filter(a -> list1.stream().noneMatch(c -> c==a)).distinct().collect(Collectors.toList());

        List<Integer> ferqliler = Stream.of(collect, collect2).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
        System.out.println(ferqliler);

        System.out.println("salam".equals(new String("salam")));
        String a , b;
        System.out.println("salam"==new String("salam"));
        System.out.println(new Integer(5).equals(5));
        System.out.println(new Integer(5)==5);



        // 1 5 2 7 9 5
                                     // 5 2 7 9 5
    }


}

