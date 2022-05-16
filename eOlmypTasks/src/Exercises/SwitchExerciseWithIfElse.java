package Exercises;

import java.util.Scanner;

public class SwitchExerciseWithIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0 || a == 1 || a == 2 || a == 3 || a == 4) {
            System.out.println("Suspenso");
        } else if (a == 5) {
            System.out.println("Aprobado");

        } else if (a == 6) {
            System.out.println("Bien");
        } else if (a == 7 || a == 8) {
            System.out.println("Notable");
        } else if (a == 9 || a == 10) {
            System.out.println("Sobresaliente");

        }
    }
}
