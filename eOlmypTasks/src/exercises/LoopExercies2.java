package exercises;

import java.util.Scanner;

public class LoopExercies2 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 10000; i++) {
            int firstdigit = i / 1000;
            int seconddigit = i / 100 % 10;
            int thirddigit = i / 10 % 10;
            int lastdigit = i % 10;
            int sum = 0;
            int sumoffirsttwo = firstdigit + seconddigit;
            int sumoflasttwo = thirddigit + lastdigit;

            if (sumoffirsttwo == sumoflasttwo) {
                System.out.println(i);
            }
        }


    }

}
