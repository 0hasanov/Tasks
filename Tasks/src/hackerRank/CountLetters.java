package hackerRank;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int uppercase = 0, lowercase = 0, number = 0, specialwords = 0;
        for (int i = 0; i < text.length(); i++) {

            char result = text.charAt(i);
            if (result >= 'A' && result <= 'Z') {
                uppercase++;
            } else if (result >= 'a' && result <= 'z') {
                lowercase++;
            } else if (result >= 0 && result <= 9) {
                number++;
            } else {
                specialwords++;
            }

        }
        System.out.println("Uppercase letters " + uppercase);
        System.out.println("Lower letters " + lowercase);
        System.out.println("Number " + number);
        System.out.println("Specialwords " + specialwords);

    }

}
