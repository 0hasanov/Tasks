package calculator;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        char ch = sc.next().charAt(0);
        int number2 = sc.nextInt();
        switch (ch) {
            case '+': {
                System.out.println(number1 + number2);
                break;
            }
            case '-': {
                System.out.println(number1 - number2);
                break;
            }
            case '*': {
                System.out.println(number1 * number2);
                break;
            }
            case '/': {
                System.out.println(number1 / number2);
                break;
            }
        }
    }
}