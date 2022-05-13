package Calculator;

import java.util.Scanner;

public class CalculatorWithIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        char op = sc.next().charAt(0); //?
        int number2 = sc.nextInt();
        if (op == '+') {
            System.out.println(number1 + number2);
        } else if (op == '-') {
            System.out.println(number1 + number2);
        } else if (op == '*') {
            System.out.println(number1 + number2);
        } else if (op == '/') {
            System.out.println(number1 + number2);

        }
    }
}
