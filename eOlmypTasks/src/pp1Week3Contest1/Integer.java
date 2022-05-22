package pp1Week3Contest1;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double dc = Math.floor(number);
        if (number == dc) {
            System.out.println("Ok");
        }
        else{
            System.out.println("No");
        }



    }
}
