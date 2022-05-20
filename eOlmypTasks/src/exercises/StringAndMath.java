package exercises;

import java.util.Random;
import java.util.Scanner;

public class StringAndMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur Name: ");
        String User = sc.next();

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        System.out.println("Let the game begin!");
        System.out.println(randomInt);
        sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();

        while (number == randomInt) {
            System.out.println("Congratulations " + User);
            randomInt = sc.nextInt();
        }
            if (number < randomInt) {
                System.out.println("Your number is too small. Please, try again.");
                System.out.println("Please enter the number: ");


            } else if (number > randomInt) {
                System.out.println("Your number is too big. Please, try again.");
                System.out.println("Please enter the number: ");
            }

        }
    }
