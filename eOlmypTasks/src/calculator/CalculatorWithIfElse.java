package calculator;

import java.util.Scanner;

public class CalculatorWithIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add First number: ");
        int number1 = sc.nextInt();
        System.out.println("Add operator : + , - , * , / ");
        char operator = sc.next().charAt(0);
        System.out.println("Add Second number: ");
        int number2 = sc.nextInt();
        System.out.print("Answer is : ");

        if (operator == '+') {
            System.out.println(number1 + number2);
        }
        if (operator == '-') {
            System.out.println(number1 - number2);
        }
        if (operator == '*') {
            System.out.println(number1 * number2);
        }
        if (operator == '/') {
            System.out.println(number1 / number2);
        }

    }
}
