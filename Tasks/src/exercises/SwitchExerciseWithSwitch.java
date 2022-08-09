package exercises;

import java.util.Scanner;

public class SwitchExerciseWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String str = sc.next();

        switch (str) {
            case "0" :
                System.out.println("Suspenso");
                break;
            case "1" :
                System.out.println("Suspenso");
                break;
            case "2" :
                System.out.println("Suspenso");
                break;
            case "3" :
                System.out.println("Suspenso");
                break;
            case "4" :
                System.out.println("Suspenso");
                break;


            case "5":
                System.out.println("Aprobado");
                break;

            case "6":
                System.out.println("Bien");
                break;

            case "7":
                System.out.println("Notable");
                break;
            case "8":
                System.out.println("Notable");
                break;

            case "9":
                System.out.println("Sobresaliente");
                break;
            case "10":
                System.out.println("Sobresaliente");
                break;

        }
    }
}
