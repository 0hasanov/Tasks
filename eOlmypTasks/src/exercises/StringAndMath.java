package exercises;

import java.util.Random;
import java.util.Scanner;

public class StringAndMath {
    public static void main(String[] args) {

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        System.out.println("Let the game begin!");
//        System.out.println(randomInt);
        Scanner sc = new Scanner(System.in);
        int User = sc.nextInt();
        if (User == randomInt) {
            System.out.println("Congratulations, {User}!");
        }
        else if (User < randomInt) {
            System.out.println("Your number is too small. Please, try again.");
        }
        else if (User > randomInt) {
            System.out.println("Your number is too big. Please, try again.");
        }

    }
}
