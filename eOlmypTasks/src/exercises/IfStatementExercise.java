package exercises;

import java.util.Scanner;

public class IfStatementExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide single character from the letter:");
        String letter = scan.nextLine();
        char ch = Character.toLowerCase(letter.charAt(0));
        if (letter.length() == 1 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.println("Input letter is Vowel");
        } else {
            if (letter.length() == 1) {
                System.out.println("Input letter is Consonant");
            } else {
                System.out.println("Error");
            }
        }
    }
}

