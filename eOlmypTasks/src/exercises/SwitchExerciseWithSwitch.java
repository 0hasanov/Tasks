package exercises;

import java.util.Scanner;

public class SwitchExerciseWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        switch (str) {
            case "Suspenso":
                System.out.println("0,1,2,3,4");
                break;

            case "Aprobado":
                System.out.println("5");
                break;

            case "Bien":
                System.out.println("6");
                break;

            case "Notable":
                System.out.println("7,8");
                break;

            case "Sobresaliente":
                System.out.println("9,10");
                break;
        }
    }
}
