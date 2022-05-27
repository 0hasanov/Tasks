package dsaWeek1;

import java.util.Scanner;

public class Ekob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int ebob = 1;
        int ekob = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0)
                ebob = i;
            ekob = (number1*number2)/ebob;

        }
        System.out.println(ekob);
    }
}